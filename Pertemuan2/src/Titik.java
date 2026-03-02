/*
Nama File : Titik.java
Deskripsi : berisi atribut dan method dalam class Titik
Pembuat : Jordan Tenggara 
Tanggal : 02 Maret 2026
 */

public class Titik{
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //mengeset nilai absis
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset nilai ordinat
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengembalikan letak kuadran titik
    public int getKuadran(){
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
    public void PrintTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik(){
        System.out.println(counterTitik);
    }

    //mengembalikan jarak titik ke pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    //mengembalikan jarak antara titik ini dengan titik T
    public double getJarak(Titik T){
        double dx = absis - T.getAbsis();
        double dy = ordinat - T.getOrdinat();
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    //merefleksikan titik terhadap sumbu X (ordinat berubah tanda)
    public void refleksiX(){
        ordinat = ordinat * -1;
    }

    //merefleksikan titik terhadap sumbu Y (absis berubah tanda)
    public void refleksiY(){
        absis = absis * -1;
    }

    //mengembalikan titik hasil refleksi terhadap sumbu X
    public Titik getRefleksiX(){
        Titik T = new Titik();
        T.setAbsis(absis);
        T.setOrdinat(ordinat * -1);
        return T;
    }

    //mengembalikan titik hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY(){
        Titik T = new Titik();
        T.setAbsis(absis * -1);
        T.setOrdinat(ordinat);
        return T;
    }
} //end class titik

