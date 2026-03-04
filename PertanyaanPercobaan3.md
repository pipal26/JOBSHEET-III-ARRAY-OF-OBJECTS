1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
public class Matakuliah {
    Constructor 1 (tanpa parameter)
    public Matakuliah() { }
    Constructor 2 (berparameter)
    public Matakuliah(String kode, String nama) { this.kode = kode; this.nama = nama; }
}
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah
3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar
4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari
array of object Matakuliah ditentukan oleh user melalui input dengan Scanner