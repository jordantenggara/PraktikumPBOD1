/*
Nama File : Kucing.java
Deskripsi : subclass dari Anabul
Pembuat : Jordan Tenggara
Tanggal : 05 Mei 2026
*/

public class Kucing extends Anabul {
    /***************ATRIBUT***************/
    private double berat;

    /***************METHOD***************/
    public Kucing(String nama, double berat){
        super(nama);
        this.berat = berat;
    }

    public double getBerat(){
        return berat;
    }
}