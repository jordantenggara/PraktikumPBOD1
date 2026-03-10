/*
Nama File : Lingkaran.java
Deskripsi : berisi atribut dan method dalam class Lingkaran
Pembuat : Jordan Tenggara 
Tanggal : 10 Maret 2026
 */

public class Lingkaran extends BangunDatar{
    /***************ATRIBUT***************/
    private double jari;

    /***************METHOD***************/
    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return 3.14 * jari * jari;
    }

    public double getKeliling(){
        return 2 * 3.14 * jari;
    }

    
}
