/*
Nama File : GMain.java
Deskripsi : main class untuk menguji class Garis
Pembuat : Jordan Tenggara
Tanggal : 03 Maret 2026
*/

public class GMain {
    public static void main(String[] args){
        Titik T1 = new Titik(1,2); //membuat objek titik T1
        Titik T2 = new Titik(4,6); //membuat objek titik T2

        Garis G1 = new Garis(T1, T2); //membuat objek garis G1
        G1.PrintGaris(); //menampilkan titik awal dan titik akhir G1

        System.out.println("Panjang garis G1 = " + G1.getPanjang()); //menampilkan panjang garis
        System.out.println("Gradien garis G1 = " + G1.getGradien()); //menampilkan gradien garis

        Titik T3 = G1.getTitikTengah(); //mendapatkan titik tengah garis G1
        System.out.print("Titik tengah G1 = ");
        T3.PrintTitik(); //menampilkan titik tengah

        Titik T4 = new Titik(2,2); //membuat objek titik T4
        Titik T5 = new Titik(5,5); //membuat objek titik T5

        Garis G2 = new Garis(T4, T5); //membuat objek garis G2
        G2.PrintGaris(); //menampilkan titik awal dan titik akhir G2

        //mengecek apakah G1 sejajar dengan G2
        System.out.println("G1 sejajar dengan G2 = " + G1.isSejajar(G2));

        //mengecek apakah G1 tegak lurus dengan G2
        System.out.println("G1 tegak lurus dengan G2 = " + G1.isTegakLurus(G2));

        //menampilkan jumlah objek garis yang telah dibuat
        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris());

        System.out.println("Persamaan garis G1 = " + G1.getPersamaanGaris());   
    }
}