/*
Nama File : MTitik.java
Deskripsi : berisi atribut dan method dalam class Titik
Pembuat : Jordan Tenggara 
Tanggal : 02 Maret 2026
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

        System.out.println("Letak kuadran titik T2 = " + T2.getKuadran());

        Titik T5 = new Titik(); 
        T5.setAbsis(6); 
        T5.setOrdinat(8); 
        T5.PrintTitik(); 

        System.out.println("Jarak T5 ke pusat = " + T5.getJarakPusat());

        Titik T6 = new Titik(); 
        T6.setAbsis(2); 
        T6.setOrdinat(1); 
        T6.PrintTitik(); 

        System.out.println("Jarak T5 ke T6 = " + T5.getJarak(T6));

        T5.refleksiX(); 
        T5.PrintTitik(); 
        
        T6.refleksiY(); 
        T6.PrintTitik(); 
        
        Titik T7 = T5.getRefleksiX(); 
        T7.PrintTitik(); 
        
        Titik T8 = T6.getRefleksiY(); 
        T8.PrintTitik(); 
    }
}
