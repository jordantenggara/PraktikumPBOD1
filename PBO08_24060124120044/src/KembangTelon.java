/*
Nama File : KembangTelon.java
Deskripsi : turunan Kucing
Pembuat : Jordan Tenggara
Tanggal : 11 Mei 2026
*/

public class KembangTelon extends Kucing {

    public KembangTelon(double bobot){
        super(bobot);
    }

    @Override
    public void suara(){
        System.out.println("Meong KembangTelon");
    }
}