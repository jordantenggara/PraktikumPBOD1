/*
Nama File : Teman.java
Deskripsi : berisi atribut dan method dalam class Teman
Pembuat : Jordan Tenggara
Tanggal : 05 Mei 2026
*/

import java.util.*; 

public class Teman {
    /***************ATRIBUT***************/
    private int nbelm;
    private ArrayList<String> Lnama;

    /***************METHOD***************/
    // konstruktor
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // getter jumlah elemen
    public int getNbelm(){
        return nbelm;
    }

    // ambil nama berdasarkan indeks
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    // set nama pada indeks tertentu
    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }

    // tambah nama
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    // hapus nama
    public void delNama(String nama){
        if(Lnama.remove(nama)){
            nbelm--;
        }
    }

    // cek apakah nama ada
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    // ganti nama
    public void gantiNama(String nama, String namaBaru){
        int idx = Lnama.indexOf(nama);
        if(idx != -1){
            Lnama.set(idx, namaBaru);
        }
    }

    // hitung kemunculan nama
    public int countNama(String nama){
        int count = 0;
        for(String n : Lnama){
            if(n.equals(nama)){
                count++;
            }
        }
        return count;
    }

    // tampilkan semua teman
    public void showTeman(){
        System.out.println("Daftar Teman:");
        for(String n : Lnama){
            System.out.println("- " + n);
        }
    }
}