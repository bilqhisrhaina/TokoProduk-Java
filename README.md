# 🛒 Aplikasi Pencatatan Produk Toko

Aplikasi **Pencatatan Daftar Produk Toko** berbasis JavaFX untuk mencatat dan mengelola data barang jualan (Makanan dan Minuman). 

Project ini merupakan modifikasi dari aplikasi hasil praktikum, dibangun dengan pendekatan *Object-Oriented Programming* (OOP) dengan penyimpanan *in-memory* (tanpa database).

## ✨ Fitur Aplikasi

- Form untuk menambahkan produk baru.
- Tabel yang menampilkan kode produk, nama produk, kategori, dan harga.
- Pencarian data berdasarkan nama produk melalui tombol Cari.
- Tombol "Lihat Detail" untuk membuka halaman detail dari objek produk yang dipilih.
- Validasi input agar nama produk tidak kosong dan harga lebih dari nol.

## 🚀 Tata Cara Menjalankan Aplikasi (Run)

Aplikasi ini menggunakan Maven. Untuk membuka dan menjalankannya, kamu bisa menggunakan perintah `javafx:run`. Berikut adalah langkah-langkahnya:

**Jika melalui Apache NetBeans:**
1. Buka aplikasi Apache NetBeans, lalu buka *project* `TokoProduk` ini.
2. Tunggu sebentar sampai NetBeans selesai membaca *dependency* (biasanya ada *loading* di pojok kanan bawah).
3. Klik kanan pada nama *project* kamu di sebelah kiri, lalu pilih **Run Maven** -> **Goals...**
4. Pada kolom teks yang muncul, ketikkan perintah berikut:
   ```text
   clean javafx:run

## 🖥️ Tampilan Aplikasi
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/d6433f84-50e1-428a-9826-a40b24e5108a" />

## 🛠️ Teknologi yang Digunakan

- Java
- JavaFX
- FXML & CSS
- Apache Maven
- JDK (Bawaan Apache NetBeans)

## 🧪 Hasil Pengujian Aplikasi

Berikut adalah dokumentasi hasil pengujian sesuai dengan ketentuan tugas:

### 1. Menampilkan Minimal Tiga Produk
Pengujian memasukkan minimal tiga produk (makanan dan minuman) dan memastikan ketiganya muncul dengan benar pada tabel.
<img width="959" height="504" alt="image" src="https://github.com/user-attachments/assets/cdc71415-5cf8-4226-8cce-faa6d7dba113" />


### 2. Fitur Pencarian Produk
Pengujian pencarian berdasarkan nama produk untuk memastikan tabel hanya menampilkan produk yang sesuai pencarian.
<img width="959" height="503" alt="image" src="https://github.com/user-attachments/assets/8fff900e-68c1-434f-97fc-434761030e35" />


### 3. Fitur Lihat Detail
Pengujian tombol "Lihat Detail" untuk memastikan halaman baru menampilkan informasi yang pas sesuai dengan produk yang diklik di tabel.
<img width="959" height="502" alt="image" src="https://github.com/user-attachments/assets/e31a9adf-0344-4e17-af7c-ec82f21896b5" />


### 4. Validasi Input Data
Pengujian dengan sengaja memasukkan nama yang kosong atau harga tidak valid (nol/minus) untuk memastikan sistem menolaknya.
<img width="959" height="504" alt="image" src="https://github.com/user-attachments/assets/47178ad1-87dd-453e-b064-968fa55fee8d" />
<img width="959" height="500" alt="image" src="https://github.com/user-attachments/assets/59bdd25e-fe63-4c21-9b88-6896c9b5ecac" />


## 📁 Struktur Project

```text
TokoProduk/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── kelas/
│       │       ├── controller/
│       │       │   ├── DaftarController.java
│       │       │   ├── DetailController.java
│       │       │   └── FormController.java
│       │       ├── data/
│       │       │   └── DataProduk.java
│       │       ├── model/
│       │       │   └── Produk.java
│       │       ├── MainApp.java
│       │       └── Navigator.java
│       │
│       └── resources/
│           └── kelas/
│               ├── styles/
│               │   └── app.css
│               ├── daftar.fxml
│               ├── detail.fxml
│               └── form.fxml
│
├── pom.xml
└── README.md
