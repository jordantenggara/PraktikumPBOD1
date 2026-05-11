/*
Nama File : main.java
Deskripsi : aplikasi semua class generik
Pembuat : Jordan Tenggara
Tanggal : 11 Mei 2026
*/

public class main {
    public static void main(String[] args){

        System.out.println("Datum generik");
        Datum<Anabul> d = new Datum<>();
        d.setIsi(new Anjing());
        d.getIsi().suara();

        System.out.println("\nTukar generik");
        Integer[] a = {3};
        Integer[] b = {6};

        System.out.println("Sebelum: a=" + a[0] + " b=" + b[0]);
        OperatorGenerik.tukar(a, b);
        System.out.println("Sesudah: a=" + a[0] + " b=" + b[0]);

        String[] s1 = {"Hello"};
        String[] s2 = {"World"};

        OperatorGenerik.tukar(s1, s2);
        System.out.println("String swap: " + s1[0] + " " + s2[0]);

        Anabul[] x = {new Anjing()};
        Anabul[] y = {new Kucing(2.5)};

        OperatorGenerik.tukar(x, y);
        x[0].suara(); // harus berubah

        System.out.println("\nbobot 2");
        Anggora k1 = new Anggora(3.5);
        KembangTelon k2 = new KembangTelon(4.0);

        double total = OperatorGenerik.bobot2(k1, k2);
        System.out.println("Total bobot = " + total);

        System.out.println("\nData generik");
        Data<Anabul> data = new Data<>();

        data.setIsi(1, new Anjing());
        data.setIsi(2, new Anggora(2.2));
        data.setIsi(3, new Burung());

        System.out.println("Isi index 1:");
        data.getIsi(1).suara();

        System.out.println("Isi index 2:");
        data.getIsi(2).suara();

        System.out.println("Jumlah elemen: " + data.getSize());
    }
}