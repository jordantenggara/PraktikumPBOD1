/*
Nama File : Kucing.java
Deskripsi : subclass Anabul dengan atribut bobot
Pembuat : Jordan Tenggara
Tanggal : 11 Mei 2026
*/

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(double bobot){
        this.bobot = bobot;
    }

    public double getBobot(){
        return bobot;
    }

    @Override
    public void suara(){
        System.out.println("Meong");
    }
}