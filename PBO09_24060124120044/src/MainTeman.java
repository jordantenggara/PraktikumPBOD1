/*
Nama File : MainTeman.java
Deskripsi : aplikasi class Teman 
Pembuat : Jordan Tenggara
Tanggal : 05 Mei 2026
*/

public class MainTeman {
    public static void main(String[] args){
        Teman t = new Teman();

        // tambah data
        t.addNama("Andi");
        t.addNama("Budi");
        t.addNama("Citra");
        t.addNama("Dina");
        t.addNama("Eka");
        t.addNama("Fajar");
        t.addNama("Gina");
        t.addNama("Hadi");
        t.addNama("Indra");
        t.addNama("Joko");

        // mencoba melebihi kapasitas
        t.addNama("Kiki"); // harus muncul "Array penuh!"

        // tampilkan
        t.showTeman();

        // akses elemen
        System.out.println("Elemen indeks 2: " + t.getNama(2));

        // ubah nama
        t.setNama(2, "Cici");
        t.showTeman();

        // cek member
        System.out.println("Apakah Budi ada? " + t.isMember("Budi"));

        // hitung kemunculan
        System.out.println("Jumlah Andi: " + t.countNama("Andi"));

        // ganti nama
        t.gantiNama("Dina", "Dini");
        t.showTeman();

        // hapus nama (cek shifting array)
        t.delNama("Budi");
        t.showTeman();

        // jumlah elemen akhir
        System.out.println("Jumlah elemen: " + t.getNbelm());
    }
}