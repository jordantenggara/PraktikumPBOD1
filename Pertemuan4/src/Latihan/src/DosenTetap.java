/*
Nama File : DosenTetap.java
Deskripsi : subclass dari Dosen (dosen tetap)
Pembuat : Jordan Tenggara
Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends DosenP4 {
    /***************ATRIBUT***************/
    private String nidn;
    private final int BUP = 65;

    /***************METHOD***************/
    DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
               double gajiPokok, String fakultas, String nidn){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    //hitung tunjangan
    private double getTunjangan(){
        int tahun = getMasaKerja().getYears();
        return 0.02 * tahun * gajiPokok;
    }

    //hitung tanggal pensiun
    private LocalDate getTanggalPensiun(){
        LocalDate pensiun = tanggalLahir.plusYears(BUP);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    @Override
    void printInfo(){
        Period mk = getMasaKerja();

        System.out.println("NIP : " + nip);
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kerja : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}