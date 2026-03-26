/*
Nama File : Manusia.java
Deskripsi : berisi atribut dan method dalam class Manusia
Pembuat : Jordan Tenggara 
Tanggal : 24 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
    /***************ATRIBUT***************/
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /***************METHOD***************/
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public Manusia(String nama, LocalDate tglMulaiKerja, double pendapatan) {
        this(nama, tglMulaiKerja, "-", pendapatan);
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    protected int getLamaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears();
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

}
