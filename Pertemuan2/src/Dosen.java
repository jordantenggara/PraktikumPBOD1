/*
Nama File : Dosen.java
Deskripsi : superclass untuk dosen
Pembuat : Jordan Tenggara
Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {
    /***************ATRIBUT***************/
    protected String fakultas;

    /***************METHOD***************/
    Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
          double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}