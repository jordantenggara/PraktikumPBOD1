/*
Nama File : Persegi.java
Deskripsi : berisi atribut dan method dalam class Persegi
Pembuat : Jordan Tenggara 
Tanggal : 10 Maret 2026
 */

public class Persegi extends BangunDatar{
    /***************ATRIBUT***************/
    private double sisi;

    /***************METHOD***************/
    public Persegi(){
        setJmlSisi(4);
    }

    // public Persegi (double sisi, String warna, String border){
    //     this.sisi = sisi;
    //     setWarna(warna);
    //     setBorder(border);
    //     setJmlSisi(4);
    // }

    // public Persegi (double sisi, String warna, String border){
    //     this.jmlSisi = sisi;
    //     this.warna = warna;
    //     this.border = border;
    //     this.sisi = sisi;
    // }
    
    //Eksperimen 1 di atas tidak jalan karena atribut bangun datar bersifat private sehingga tidak dapat diakses

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = 4;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // @Override
    // public void printInfo(){
    //     System.out.println("Jumlah sisi:" + getJmlSisi());
    //     System.out.println("Warna:" + getWarna());
    //     System.out.println("Border:" + getBorder());
    //     System.out.println("Sisi:" + sisi);
    // }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return sisi * 4;
    }

    public double getDiagonal(){
        return Math.sqrt(2 * sisi * sisi);
    }
    
}
