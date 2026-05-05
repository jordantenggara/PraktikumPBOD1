/*
Nama File : ADHOCOverloading.java
Deskripsi : Polimorifsme dengan adhoc overloading
Pembuat : Jordan Tenggara 
Tanggal : 28 April 2026
*/

/*
Nama Class : Mahasiswa
Deskripsi : Kelas Mahasiswa dengan overloading
*/

class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    /*************** KONSTRUKTOR ***************/
    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    /*************** OVERLOADING ***************/
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String ps) {
        this.programStudi = ps;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    public void printInfo() {
        System.out.println(nim + " | " + nama + " | " + programStudi);
    }
}

/*
Nama File : MainMahasiswa.java
Deskripsi : Aplikasi Mahasiswa
*/

public class ADHOCOverloading {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("24060123", "George", "Informatika");
        Mahasiswa m3 = new Mahasiswa(m2);

        m1.setProgramStudi();
        m2.setProgramStudi("Sistem Informasi");
        m3.setProgramStudi(m2);

        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
    }
}