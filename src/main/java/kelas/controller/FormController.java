package kelas.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import kelas.Navigator;
import kelas.data.DataProduk;
import kelas.model.Produk;

public class FormController {

    @FXML
    private TextField kodeField, namaField, hargaField;
    @FXML
    private ComboBox<String> kategoriBox;
    @FXML
    private Label pesanLabel;

    private Navigator navigator;
    private DataProduk data;

    @FXML
    private void initialize() {
        kategoriBox.getItems().addAll("Makanan", "Minuman");
        kategoriBox.setValue("Makanan");
    }

    public void setKonteks(Navigator navigator, DataProduk data) {
        this.navigator = navigator;
        this.data = data;
        kodeField.setText(data.getKodeBerikutnya());
    }

    @FXML
    private void simpan() {
        try {
            long harga = Long.parseLong(hargaField.getText().trim());
            Produk p = data.tambah(namaField.getText(), kategoriBox.getValue(), harga);

            // Berhasil: kosongkan form agar produk berikutnya bisa langsung diisi.
            namaField.clear();
            hargaField.clear();
            kategoriBox.setValue("Makanan");
            kodeField.setText(data.getKodeBerikutnya());
            pesanLabel.setStyle("-fx-text-fill: #15803d;");
            pesanLabel.setText("Produk " + p.getKode() + " (" + p.getNama() + ") berhasil ditambahkan.");
        } catch (NumberFormatException e) {
            pesanLabel.setStyle("-fx-text-fill: #b91c1c;");
            pesanLabel.setText("Harga harus berupa bilangan bulat, contoh: 15000.");
        } catch (IllegalArgumentException e) {
            pesanLabel.setStyle("-fx-text-fill: #b91c1c;");
            pesanLabel.setText(e.getMessage());
        }
    }

    @FXML
    private void bukaDaftar() {
        try {
            navigator.bukaDaftar();
        } catch (IOException e) {
            pesanLabel.setStyle("-fx-text-fill: #b91c1c;");
            pesanLabel.setText("Gagal membuka daftar.");
            e.printStackTrace();
        }
    }
}
