/*
Nama File : DosenTamu.java
Deskripsi : subclass dari Dosen (dosen tamu)
Pembuat : Jordan Tenggara
Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends DosenP4 {
    /***************ATRIBUT***************/
    private String nidk;
    private LocalDate akhirKontrak;

    /***************METHOD***************/
    DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
              double gajiPokok, String fakultas, String nidk, LocalDate akhirKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    private double getTunjangan(){
        return 0.025 * gajiPokok;
    }

    private Period getSisaKontrak(){
        return Period.between(LocalDate.now(), akhirKontrak);
    }

    @Override
    void printInfo(){
        Period kontrak = getSisaKontrak();

        System.out.println("NIP : " + nip);
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Sisa Kontrak : " + kontrak.getMonths() + " bulan");
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}