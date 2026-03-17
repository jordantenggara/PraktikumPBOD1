/*
Nama File : MainBangunDatar.java
Deskripsi : main class untuk mengimplementasikan class BangunDatar dan subclassnya
Pembuat : Jordan Tenggara
Tanggal : 10 Maret 2026
*/

public class Main5 {
    public static void main(String[] args) {

        // membuat objek persegi
        Persegi5 p1 = new Persegi5(5, "Merah", "Hitam");

        // membuat objek lingkaran
        Lingkaran5 l1 = new Lingkaran5(14, "Biru", "Putih");


        // Implementasi Persegi
        System.out.println("Informasi Persegi");

        // memanggil printInfo (override method)
        p1.printInfo();

        // getter
        System.out.println("Jumlah sisi : " + p1.getJmlSisi());
        System.out.println("Warna       : " + p1.getWarna());
        System.out.println("Border      : " + p1.getBorder());
        System.out.println("Sisi        : " + p1.getSisi());

        // method khusus persegi
        System.out.println("Luas        : " + p1.getLuas());
        System.out.println("Keliling    : " + p1.getKeliling());
        System.out.println("Diagonal    : " + p1.getDiagonal());

        // setter
        p1.setWarna("Hijau");
        p1.setBorder("Kuning");
        p1.setSisi(7);

        System.out.println("\nSetelah perubahan atribut:");
        p1.printInfo();

        // IMPLEMENTASI LINGKARAN
        System.out.println("\nInformasi Lingkaran");

        // print info dari superclass
        l1.printInfo();

        // getter
        System.out.println("Jari-jari   : " + l1.getJari());

        // method khusus lingkaran
        System.out.println("Luas        : " + l1.getLuas());
        System.out.println("Keliling    : " + l1.getKeliling());

        // setter
        l1.setJari(10);

        System.out.println("\nSetelah perubahan jari-jari:");
        System.out.println("Jari-jari baru : " + l1.getJari());
        System.out.println("Luas baru      : " + l1.getLuas());

        System.out.println("\nJumlah objek BangunDatar yang dibuat:");
        BangunDatar5.printCounterBangunDatar();
    }
}