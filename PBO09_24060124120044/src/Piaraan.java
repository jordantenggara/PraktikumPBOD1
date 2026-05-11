/*
Nama File : Piaraan.java
Deskripsi : kelas koleksi antrean Anabul 
Pembuat : Jordan Tenggara
Tanggal : 05 Mei 2026
*/

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    /***************ATRIBUT***************/
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /***************METHOD***************/
    // konstruktor
    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // i. jumlah elemen
    public int getNbelm(){
        return nbelm;
    }

    // ii. enqueue (tambah ke belakang)
    public void enqueueAnabul(Anabul a){
        Lanabul.add(a);
        nbelm++;
    }

    // iii. cek member
    public boolean isMember(Anabul a){
        return Lanabul.contains(a);
    }

    // iv. ambil elemen pertama (tanpa hapus)
    public Anabul getAnabul(){
        return Lanabul.peek();
    }

    // v. dequeue (ambil & hapus)
    public Anabul dequeueAnabul(){
        Anabul a = Lanabul.poll();
        if(a != null){
            nbelm--;
        }
        return a;
    }

    // c. tampilkan semua nama
    public void showAnabul(){
        System.out.println("Daftar Anabul:");
        for(Anabul a : Lanabul){
            System.out.println("- " + a.getNama());
        }
    }

    // d. hitung jumlah kucing
    public int countKucing(){
        int count = 0;
        for(Anabul a : Lanabul){
            if(a instanceof Kucing){
                count++;
            }
        }
        return count;
    }

    // e. total bobot kucing
    public double bobotKucing(){
        double total = 0;
        for(Anabul a : Lanabul){
            if(a instanceof Kucing){
                total += ((Kucing)a).getBerat();
            }
        }
        return total;
    }

    // f. tampilkan nama + jenis class
    public void showJenisAnabul(){
        System.out.println("Daftar Anabul + Jenis:");
        for(Anabul a : Lanabul){
            System.out.println(a.getNama() + " - " + a.getClass().getName());
        }
    }
}