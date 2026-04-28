/*
Nama File : ADHOCCoercion.java
Deskripsi : Demonstrasi polimorfisme ad hoc coercion
Pembuat : Jordan Tenggara 
Tanggal : 28 April 2026
 */



public class ADHOCCoercion {
    public static void main(String[] args) {

        // a. integer ke berbagai tipe
        int angka = 65;

        System.out.println("Integer : " + angka);
        System.out.println("Char    : " + (char) angka);
        System.out.println("Double  : " + (double) angka);

        // b. double ke integer
        double real = 65.9;
        int kembali = (int) real;
        System.out.println("\nDouble ke Integer: " + kembali);

        // c.
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("\nS (concat): " + S);
        System.out.println("Z (jumlah): " + Z);

        // d.
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("\nR (concat): " + R);
        System.out.println("D (jumlah): " + D);

        // e.
        Integer A = Integer.parseInt(S);
        System.out.println("\nA (Integer dari S): " + A);

        // f.
        String T = A.toString();
        System.out.println("T (String dari A): " + T);
    }
}