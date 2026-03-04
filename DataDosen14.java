public class DataDosen14 {
    public static void dataSemuaDosen(Dosen14[] arrayOfDosen) {
        int i = 1;
        for (Dosen14 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("----------------------------------");
            i++;
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " + (countPria == 0 ? 0 : (double)totalUsiaPria / countPria));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (countWanita == 0 ? 0 : (double)totalUsiaWanita / countWanita));
    }

    public static void infoDosenPalingTua(Dosen14[] arrayOfDosen) {
        Dosen14 tertua = arrayOfDosen[0];
        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("--- Dosen Paling Tua ---");
        System.out.println("Nama : " + tertua.nama + " (Usia: " + tertua.usia + ")");
    }

    public static void infoDosenPalingMuda(Dosen14[] arrayOfDosen) {
        Dosen14 termuda = arrayOfDosen[0];
        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("--- Dosen Paling Muda ---");
        System.out.println("Nama : " + termuda.nama + " (Usia: " + termuda.usia + ")");
    }
}