1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program
pada langkah no 3.
public void cetakInfo() {
    System.out.println("NIM   : " + nim);
    System.out.println("Nama  : " + nama);
    System.out.println("Kelas : " + kelas);
    System.out.println("IPK   : " + ipk);
    System.out.println("--------------------------------");
}
for(int i = 0; i < 3; i++) {
    System.out.println("Data Mahasiswa ke-" + (i + 1));
    arrayOfMahasiswa[i].cetakInfo();
}
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama
myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
Kode menyebabkan error (NullPointerException) karena array myArrayOfMahasiswa baru dialokasikan tempat (kapasitas) sebanyak 3 elemen saja . Objek pada setiap indeks belum diinstansiasi dengan menggunakan new Mahasiswa(); sehingga elemen array masih bernilai null saat dicoba untuk mengakses dan mengisi atribut nim, nama, kelas, dan ipk .
