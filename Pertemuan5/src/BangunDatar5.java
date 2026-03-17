/*
Nama File : BangunDatar5.java
Deskripsi : berisi atribut dan method dalam class BangunDatar5
Pembuat : Jordan Tenggara 
Tanggal : 17 Maret 2026
 */
public abstract class BangunDatar5 {
    /***************ATRIBUT***************/
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /***************METHOD***************/
    public BangunDatar5(){
        counterBangunDatar++;
    }

    public BangunDatar5(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar5 X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar5 X){
        return this.getKeliling() == X.getKeliling();
    }
}