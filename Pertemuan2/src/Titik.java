/*
Nama File : Titik.java
Deskripsi : berisi atribut dan method dalam class Titik
Pembuat : Jordan Tenggara 
Tanggal : 24 Februari 2026
 */

public class Titik{
    /***************ATRIBUT***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    Titik(int x, int y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset nilai absis
    void setAbsis(double x){
        absis = x;
    }

    //mengeset nilai ordinat
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 2;
        }else{
            return 0;
        }
    }

    //mencetak koordinat titik
    void PrintTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(counterTitik);
    }
} //end class titik

