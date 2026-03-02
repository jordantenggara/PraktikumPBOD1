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

    Titik(double x, double y){
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

    //mengembalikan letak kuadran titik
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

    //mengembalikan jarak titik ke pusat (0,0)
    double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    //mengembalikan jarak antara titik ini dengan titik T
    double getJarak(Titik T){
        double dx = absis - T.getAbsis();
        double dy = ordinat - T.getOrdinat();
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    //merefleksikan titik terhadap sumbu X (ordinat berubah tanda)
    void refleksiX(){
        ordinat = ordinat * -1;
    }

    //merefleksikan titik terhadap sumbu Y (absis berubah tanda)
    void refleksiY(){
        absis = absis * -1;
    }

    //mengembalikan titik hasil refleksi terhadap sumbu X
    Titik getRefleksiX(){
        Titik T = new Titik();
        T.setAbsis(absis);
        T.setOrdinat(ordinat * -1);
        return T;
    }

    //mengembalikan titik hasil refleksi terhadap sumbu Y
    Titik getRefleksiY(){
        Titik T = new Titik();
        T.setAbsis(absis * -1);
        T.setOrdinat(ordinat);
        return T;
    }
} //end class titik

