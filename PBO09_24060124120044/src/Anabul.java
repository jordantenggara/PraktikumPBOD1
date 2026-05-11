/*
Nama File : Anabul.java
Deskripsi : superclass Anabul
Pembuat : Jordan Tenggara
Tanggal : 05 Mei 2026
*/

public class Anabul {
    /***************ATRIBUT***************/
    protected String nama; // nama panggilan

    /***************METHOD***************/
    // konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    // getter
    public String getNama(){
        return nama;
    }

    // setter
    public void setNama(String nama){
        this.nama = nama;
    }
}