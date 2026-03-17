/*
Nama File : Tendik.java
Deskripsi : subclass dari Pegawai (tenaga kependidikan)
Pembuat : Jordan Tenggara
Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    /***************ATRIBUT***************/
    private String bidang;
    private final int BUP = 55;

    /***************METHOD***************/
    Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
           double gajiPokok, String bidang){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    private double getTunjangan(){
        int tahun = getMasaKerja().getYears();
        return 0.01 * tahun * gajiPokok;
    }

    private LocalDate getTanggalPensiun(){
        LocalDate pensiun = tanggalLahir.plusYears(BUP);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    @Override
    void printInfo(){
        Period mk = getMasaKerja();

        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}