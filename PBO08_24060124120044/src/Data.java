/*
Nama File : Data.java
Deskripsi : array generik maksimum 100 elemen
Pembuat : Jordan Tenggara
Tanggal : 11 Mei 2026
*/

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data(){
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int idx, T nilai){
        if(idx >= 1 && idx <= 100){
            ruang[idx-1] = nilai;
            if(idx > banyak){
                banyak = idx;
            }
        }
    }

    public T getIsi(int idx){
        if(idx >= 1 && idx <= banyak){
            return ruang[idx-1];
        }
        return null;
    }

    public int getSize(){
        return banyak;
    }
}