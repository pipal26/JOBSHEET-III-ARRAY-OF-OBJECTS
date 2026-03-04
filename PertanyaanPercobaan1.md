1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method? Jelaskan!
Sebuah class tidak diwajibkan memiliki atribut dan method sekaligus untuk bisa dibuat array of object-nya. Seperti pada percobaan di atas, class Mahasiswa hanya memiliki atribut (nim, nama, kelas, ipk) tanpa adanya method di dalamnya, namun tetap dapat diinstansiasi menjadi array of object .
2. Apa yang dilakukan oleh kode program berikut?
Kode Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3]; berfungsi untuk mendeklarasikan sebuah variabel array bernama arrayOfMahasiswa dengan tipe objek Mahasiswa dan mengalokasikan ruang di memori untuk menyimpan 3 elemen array .
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?
Kode Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3]; berfungsi untuk mendeklarasikan sebuah variabel array bernama arrayOfMahasiswa dengan tipe objek Mahasiswa dan mengalokasikan ruang di memori untuk menyimpan 3 elemen array .
4. Apa yang dilakukan oleh kode program berikut?
Kode tersebut pertama-tama membuat instance/objek Mahasiswa baru dan menempatkannya pada indeks ke-0 di array arrayOfMahasiswa. Kemudian, kode tersebut mengisi nilai pada atribut-atribut objek tersebut dengan data: nim "244107060033", nama "AGNES TITANIA KINANTI", kelas "SIB-1E", dan ipk 3.75 .
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
Class Mahasiswa dan MahasiswaDemo dipisahkan untuk menerapkan konsep modularitas Object-Oriented Programming (OOP). Class Mahasiswa bertindak sebagai blueprint (cetak biru) struktur data, sedangkan MahasiswaDemo bertindak sebagai main class yang mengeksekusi program dan melakukan instansiasi objek. Pemisahan ini membuat kode lebih rapi dan mudah di-maintenance .