/*
Nama File : PNS.java
Deskripsi : berisi atribut dan method dalam class PNS
Pembuat : Jordan Tenggara 
Tanggal : 24 Maret 2026
 */

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    /***************ATRIBUT***************/
    private String nip;
    private static int counterPNS = 0;

    private static final int A = 2;

    /***************METHOD***************/
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * getPendapatan();
    }

    @Override
    public int hitungMasaKerja() {
        return getLamaKerja() + A;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}