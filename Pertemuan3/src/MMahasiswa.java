public class MMahasiswa {
    public static void main(String[] args) {

        // buat dosen wali
        DosenP4 d1 = new DosenP4("D001", "Pak Budi", "Informatika");

        // buat kendaraan
        Kendaraan k1 = new Kendaraan("Motor", "B 1234 CD");

        // buat mahasiswa
        Mahasiswa m1 = new Mahasiswa("220001", "Andi", "Informatika", d1, k1);

        // buat mata kuliah
        MataKuliah mk1 = new MataKuliah("IF101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Struktur Data", 4);

        // tambahkan mata kuliah ke mahasiswa
        m1.addMatKul(mk1);
        m1.addMatKul(mk2);
        m1.addMatKul(mk3);

        // tampilkan data mahasiswa
        System.out.println("Data Mahasiswa");
        m1.printMhs();

        System.out.println("\nJumlah Mata Kuliah : " + m1.getJumlahMatKul());
        System.out.println("Jumlah SKS         : " + m1.getJumlahSks());

        System.out.println("\nDetail Mahasiswa");
        m1.printDetailMhs();
    }
}