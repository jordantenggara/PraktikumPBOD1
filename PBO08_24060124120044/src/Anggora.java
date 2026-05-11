/*
Nama File : Anggora.java
Deskripsi : turunan Kucing
Pembuat : Jordan Tenggara
Tanggal : 11 Mei 2026
*/

public class Anggora extends Kucing {

    public Anggora(double bobot){
        super(bobot);
    }

    @Override
    public void suara(){
        System.out.println("Meong Anggora");
    }
}