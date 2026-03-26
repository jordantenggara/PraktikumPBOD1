/*
Nama File : Petani.java
Deskripsi : berisi atribut dan method dalam class Petani
Pembuat : Jordan Tenggara 
Tanggal : 24 Maret 2026
 */

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    /***************ATRIBUT***************/
    private String asalKota;
    private static int counterPetani = 0;

    private static final int C = 1;

    /***************METHOD***************/
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public int hitungMasaKerja() {
        return getLamaKerja() + C;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
    }
}