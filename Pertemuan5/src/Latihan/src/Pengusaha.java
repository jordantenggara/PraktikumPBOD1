/*
Nama File : Pengusaha.java
Deskripsi : berisi atribut dan method dalam class Pengusaha
Pembuat : Jordan Tenggara 
Tanggal : 24 Maret 2026
 */

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    /***************ATRIBUT***************/
    private String npwp;
    private static int counterPengusaha = 0;

    private static final int B = 3;

    /***************METHOD***************/
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    @Override
    public int hitungMasaKerja() {
        return getLamaKerja() + B;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}