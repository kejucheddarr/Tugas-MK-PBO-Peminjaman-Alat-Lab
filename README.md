# Tugas-PBO-Peminjaman-Alat-Lab
Nama: Nabila Salma Putri
NIM: 2509116065
Kelas: B

## Penjelasan Studi Kasus
Sistem Manajemen Peminjaman Alat Laboratorium adalah sebuah program yang digunakan untuk mengelola proses peminjaman dan pengembalian alat laboratorium. Sistem ini mencakup pencatatan data alat, data peminjaman, proses peminjaman, serta pengembalian alat. Sistem ini membantu mengatur proses peminjaman alat laboratorium menjadi lebih terstruktur dan mudah dipantau.
<br>

<p>
Program ini memiliki beberapa fitur, yaitu:
1. Menampilkan daftar alat laboratorium beserta kondisi dan stok.
2. Menambahkan data peminjaman alat.
3. Menampilkan riwayat peminjaman.
4. Mengembalikan alat berdasarkan ID peminjaman.
5. Mengubah stok alat secara otomatis ketika alat dipinjam atau dikembalikan.
</p>
<br>
Pada program ini terdapat 2 class dan 1 subclass, yaitu *Alat, Peminjaman,* dan *AlatBedah*. Data alat dan data peminjaman disimpan menggunakan *ArrayList*.

## Penjelasan Hierarki Kelas
Hierarki class pada program ini adalah:
Alat (superclass)
└── AlatBedah (subclass)
<br>
Class *Alat* merupakan superclass yang menyimpan atribut dan method umum untuk alat laboratorium, sementara class *AlatBedah* adalah sebuah subclass dari Alat yang mewarisi atribut dan method dari superclass tersebut. Selain itu, *AlatBedah* memiliki atribut tambahan yaitu bahan untuk menyimpan informasi bahan dari alat bedah.
<br>

## Penjelasan Kode (Penerapan Inheritance)
Penerapan inheritance pada program terdapat pada class *AlatBedah* yang merupakan turunan dari class *Alat*. Hal ini ditunjukkan dengan penggunaan keyword extends.
<br>
<img width="1189" height="194" alt="image" src="https://github.com/user-attachments/assets/77b1637e-01b6-49f9-8456-af3c8c6f91dd" />
<br>
Pada kode di atas, karena class *AlatBedah& merupakan subclass dari class *Alat*, *AlatBedah* dapat menggunakan atribut dan method yang diwarisi dari class *Alat*. Penggunaan *super()* pada konstruktor *AlatBedah* digunakan untuk memanggil konstruktor dari class *Alat* dan memberikan nilai pada atribut *idAlat, namaAlat, kondisiAlat,* dan *stokAlat*. *AlatBedah* juga memiliki atribut tambahan selain atribut yang diwarisi, yaitu atribut *bahan* yang digunakan untuk menyimpan informasi bahan dari alat bedah.

## Dokumentasi Program
### Tampilan Awal

<p>
<img width="999" height="576" alt="image" src="https://github.com/user-attachments/assets/ca316e5e-cc73-4dfa-98e6-6dbc5e8bc35b" />
</p>

### 1. Tampilkan Alat

<p>
<img width="623" height="662" alt="image" src="https://github.com/user-attachments/assets/99dcee17-c5c6-44f6-a39f-8180e753fb21" />
</p>

### 2. Tambahkan Peminjaman

Disini, petugas sebagai pengguna dapat mengisi namanya, nama alat yang ingin dipinjam, dan jumlah yang dipinjam.
<br>

<p>
<img width="501" height="400" alt="image" src="https://github.com/user-attachments/assets/c490e3fa-bbe7-4e7e-ae6a-4d9227e95552" />
</p>

### 3. Tampilkan Riwayat Peminjaman

<p>
<img width="607" height="487" alt="image" src="https://github.com/user-attachments/assets/5b7b7e22-9db7-4c5b-adb8-436712092454" />
</p>

### 4. Kembalikan Alat

<p>
<img width="549" height="319" alt="image" src="https://github.com/user-attachments/assets/5c7d2149-acdc-414a-8dc7-756f9cde9444" />
</p>

### 5. Keluar

<p>
<img width="818" height="391" alt="image" src="https://github.com/user-attachments/assets/9e100135-636b-4396-9fd2-848c6856e1f8" />
</p>
