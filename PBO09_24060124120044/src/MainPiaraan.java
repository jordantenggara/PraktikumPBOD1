/*
Nama File : MainPiaraan.java
Deskripsi : aplikasi kelas Piaraan
Pembuat : Jordan Tenggara
Tanggal : 05 Mei 2026
*/

public class MainPiaraan {
    public static void main(String[] args){
        Piaraan p = new Piaraan();

        // enqueue data
        p.enqueueAnabul(new Kucing("Milo", 3.5));
        p.enqueueAnabul(new Kucing("Oyen", 4.2));
        p.enqueueAnabul(new Anjing("Doggo"));
        p.enqueueAnabul(new Kucing("Kitty", 2.8));

        // tampilkan semua
        p.showAnabul();

        // jumlah elemen
        System.out.println("Jumlah anabul: " + p.getNbelm());

        // ambil depan
        System.out.println("Anabul pertama: " + p.getAnabul().getNama());

        // jumlah kucing
        System.out.println("Jumlah kucing: " + p.countKucing());

        // total bobot kucing
        System.out.println("Total bobot kucing: " + p.bobotKucing());

        // tampilkan jenis
        p.showJenisAnabul();

        // dequeue
        System.out.println("Dequeue: " + p.dequeueAnabul().getNama());

        // tampilkan lagi
        p.showAnabul();
    }
}