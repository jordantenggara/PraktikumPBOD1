/*
Nama File : Lingkaran5.java
Deskripsi : berisi atribut dan method dalam class Lingkaran5
Pembuat : Jordan Tenggara 
Tanggal : 17 Maret 2026
 */

public class Lingkaran5 extends BangunDatar5 implements IResize{
    /***************ATRIBUT***************/
    private double jari;

    /***************METHOD***************/
    public Lingkaran5(){
        setJmlSisi(1);
    }

    public Lingkaran5(double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    // public double getLuas(){
    //     return 3.14 * jari * jari;
    // }

    // public double getKeliling(){
    //     return 2 * 3.14 * jari;
    // }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }



    public double getLuas(){
        return 3.14 * jari * jari;
    }

    public double getKeliling(){
        return 2 * 3.14 * jari;
    }

    
}
