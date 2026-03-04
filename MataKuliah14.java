public class MataKuliah14 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah14(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kodeBaru, String namaBaru, int sksBaru, int jamBaru) {
        this.kode = kodeBaru;
        this.nama = namaBaru;
        this.sks = sksBaru;
        this.jumlahJam = jamBaru;
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Sks        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-----------------------------------");
    }

}
