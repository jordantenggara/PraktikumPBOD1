/*
Nama File : Main4.java
Deskripsi : main class untuk menguji class Pegawai, Dosen, dan Tendik
Pembuat : Jordan Tenggara
Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;

public class Main4 {
    public static void main(String[] args){

        /***************MEMBUAT OBJEK DOSEN TETAP***************/
        DosenTetap dTetap = new DosenTetap(
            "9545647548",
            "Andi",
            LocalDate.of(1990,5,5),
            LocalDate.of(2015,1,1),
            5000000,
            "Fakultas Sains dan Matematika",
            "78647324"
        );

        /***************MEMBUAT OBJEK DOSEN TAMU***************/
        DosenTamu dTamu = new DosenTamu(
            "1234567890",
            "Budi",
            LocalDate.of(1985,3,10),
            LocalDate.of(2020,2,1),
            4000000,
            "Fakultas Teknik",
            "99887766",
            LocalDate.of(2026,12,31)
        );

        /***************MEMBUAT OBJEK TENDIK***************/
        Tendik t1 = new Tendik(
            "5678901234",
            "Siti",
            LocalDate.of(1992,7,15),
            LocalDate.of(2018,6,1),
            3000000,
            "Akademik"
        );

        /***************MENAMPILKAN DATA***************/
        System.out.println("Data Dosen Tetap");
        dTetap.printInfo();

        System.out.println();
        System.out.println("Data Dosen Tamu");
        dTamu.printInfo();

        System.out.println();
        System.out.println("Data Tendik");
        t1.printInfo();
    }
}