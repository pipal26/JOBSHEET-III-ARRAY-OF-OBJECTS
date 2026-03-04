import java.util.Scanner;

public class MataKuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        
        MataKuliah14[] arrayOfMataKuliah = new MataKuliah14[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah14(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("-----------------------------------");
        }
        
        if (jumlah > 0) {
            arrayOfMataKuliah[0].tambahData("IF123", "PBO", 3, 6);
        }
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}