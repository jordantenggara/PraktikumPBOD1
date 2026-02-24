/*
Nama File : MTitik.java
Deskripsi : berisi atribut dan method dalam class Titik
Pembuat : Jordan Tenggara 
Tanggal : 24 Februari 2026
 */
public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.PrintTitik(); //mencetak koordinat T1 ke layar 
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.PrintTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.PrintTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.PrintTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());

        System.out.println(T2.getKuadran());
    }
}
