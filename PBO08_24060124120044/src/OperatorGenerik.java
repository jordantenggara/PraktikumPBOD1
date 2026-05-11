/*
Nama File : OperatorGenerik.java
Deskripsi : operasi generik
Pembuat : Jordan Tenggara
Tanggal : 11 Mei 2026
*/

public class OperatorGenerik {

    // Tukar dengan array wrapper
    public static <T> void tukar(T[] a, T[] b){
        T temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    // Fungsi Bobot2 khusus turunan Kucing
    public static <T extends Kucing> double bobot2(T k1, T k2){
        return k1.getBobot() + k2.getBobot();
    }
}