/*
Nama File : Datum.java
Deskripsi : class generik penyimpan data
Pembuat : Jordan Tenggara
Tanggal : 11 Mei 2026
*/

public class Datum<T> {
    private T isi;

    public T getIsi(){
        return isi;
    }

    public void setIsi(T isiBaru){
        isi = isiBaru;
    }
}