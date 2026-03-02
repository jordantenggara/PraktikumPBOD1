/*
Nama File : Garis.java
Deskripsi : berisi atribut dan method dalam class Garis
Pembuat : Jordan Tenggara
Tanggal : 03 Maret 2026
*/

public class Garis {
    /***************ATRIBUT***************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris;

    /***************METHOD***************/
    //konstruktor tanpa parameter
    Garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    //konstruktor dengan parameter titik awal dan titik akhir
    Garis(Titik t1, Titik t2){
        titikAwal = t1;
        titikAkhir = t2;
        counterGaris++;
    }

    //mengembalikan titik awal
    Titik getTitikAwal(){
        return titikAwal;
    }

    //mengembalikan titik akhir
    Titik getTitikAkhir(){
        return titikAkhir;
    }

    //mengeset titik awal
    void setTitikAwal(Titik t){
        titikAwal = t;
    }

    //mengeset titik akhir
    void setTitikAkhir(Titik t){
        titikAkhir = t;
    }

    //mengembalikan nilai counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    //mengembalikan panjang garis
    double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    //mengembalikan gradien garis
    double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) /
               (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    //mengembalikan titik tengah garis
    Titik getTitikTengah(){
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    //mengecek apakah garis sejajar dengan garis G
    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    //mengecek apakah garis tegak lurus dengan garis G
    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    //mencetak titik awal dan titik akhir garis
    void PrintGaris(){
        System.out.print("Titik Awal = ");
        titikAwal.PrintTitik();
        System.out.print("Titik Akhir = ");
        titikAkhir.PrintTitik();
    }

    //mengembalikan persamaan garis dalam bentuk string y = mx + c
    String getPersamaanGaris(){
        double m = getGradien(); 
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis()); //konstanta

        return "y = " + m + "x + " + c;
    }

} //end class Garis