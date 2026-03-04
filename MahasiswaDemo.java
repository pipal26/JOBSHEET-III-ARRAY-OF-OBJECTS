public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa14 arrayofMahasiswa14[] = new Mahasiswa14[3];
        arrayofMahasiswa14[0] = new Mahasiswa14();
        arrayofMahasiswa14[0].nim = "244107060033"; 
        arrayofMahasiswa14[0].nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa14[0].kelas = "SIB-1E";
        arrayofMahasiswa14[0].ipk = (float) 3.75;

        arrayofMahasiswa14[1] = new Mahasiswa14(); 
        arrayofMahasiswa14[1].nim = "2341720172";
        arrayofMahasiswa14[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa14[1].kelas = "TI-2A";
        arrayofMahasiswa14[1].ipk = (float) 3.36;
        
        arrayofMahasiswa14[2] = new Mahasiswa14(); 
        arrayofMahasiswa14[2].nim = "241070223006";
        arrayofMahasiswa14[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayofMahasiswa14[2].kelas = "TI-1E";
        arrayofMahasiswa14[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayofMahasiswa14[0].nim);
        System.out.println("Nama    : " + arrayofMahasiswa14[0].nama);
        System.out.println("Kelas   : " + arrayofMahasiswa14[0].kelas);
        System.out.println("IPK     : " + arrayofMahasiswa14[0].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM     : " + arrayofMahasiswa14[1].nim);
        System.out.println("Nama    : " + arrayofMahasiswa14[1].nama);
        System.out.println("Kelas   : " + arrayofMahasiswa14[1].kelas);
        System.out.println("IPK     : " + arrayofMahasiswa14[1].ipk);
        System.out.println("---------------------------------------");   
        System.out.println("NIM     : " + arrayofMahasiswa14[2].nim);
        System.out.println("Nama    : " + arrayofMahasiswa14[2].nama);
        System.out.println("Kelas   : " + arrayofMahasiswa14[2].kelas);
        System.out.println("IPK     : " + arrayofMahasiswa14[2].ipk);   
        System.out.println("---------------------------------------");       
    }
}
