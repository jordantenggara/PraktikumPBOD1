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

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
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

    //mencetak koordinat titik
    void PrintTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }
    
} //end class titik