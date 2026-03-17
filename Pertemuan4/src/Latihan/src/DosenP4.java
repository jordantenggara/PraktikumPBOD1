/*
Nama File : Dosen.java
Deskripsi : superclass untuk dosen
Pembuat : Jordan Tenggara
Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;

public class DosenP4 extends Pegawai {
    /***************ATRIBUT***************/
    protected String fakultas;

    /***************METHOD***************/
    DosenP4(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
          double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}
