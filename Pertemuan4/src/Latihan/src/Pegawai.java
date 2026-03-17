/*
Nama File : Pegawai.java
Deskripsi : superclass untuk semua pegawai
Pembuat : Jordan Tenggara
Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    /***************ATRIBUT***************/
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    /***************METHOD***************/
    Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    //menghitung masa kerja
    protected Period getMasaKerja(){
        return Period.between(tmt, LocalDate.now());
    }

    //format tanggal
    protected String formatTanggal(LocalDate tgl){
        String[] bulan = {"Januari","Februari","Maret","April","Mei","Juni",
                          "Juli","Agustus","September","Oktober","November","Desember"};
        return tgl.getDayOfMonth() + " " + bulan[tgl.getMonthValue()-1] + " " + tgl.getYear();
    }

    //method print (override di subclass)
    void printInfo(){
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
    }

}
