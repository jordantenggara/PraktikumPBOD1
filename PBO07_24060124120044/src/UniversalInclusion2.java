/*
Nama File : UniversalInclusion2.java
Deskripsi : Universal Inclusion CivitasAkademika
Pembuat : Jordan Tenggara 
Tanggal : 28 April 2026
*/

/*
Nama Class : CivitasAkademika
Deskripsi: Kelas Abstrak Parent
*/
abstract class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getNomor();
}

/*
Nama Class : Dosen
Deskripsi: Kelas Anak
*/
class Dosen extends CivitasAkademika {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public String getNomor() {
        return nip;
    }
}

/*
Nama Class : Mahasiswa2
Deskripsi: Kelas Abstrak Parent
*/
class Mahasiswa2 extends CivitasAkademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa2(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println(nim + " | " + nama + " | Wali: " + dosenWali.getNama());
    }
}

/*
Nama Class : Seminar
Deskripsi: Kelas Abstrak Parent
*/
class Seminar {
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    public void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta++] = c;
        }
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " | " + pesertas[i].getNama());
        }
    }
}

public class UniversalInclusion2 {
    public static void main(String[] args) {

        Seminar s = new Seminar();

        Dosen d1 = new Dosen("Pak A", "D001");
        Dosen d2 = new Dosen("Pak B", "D002");

        Mahasiswa2 m1 = new Mahasiswa2("Andi", "M001");
        Mahasiswa2 m2 = new Mahasiswa2("Budi", "M002");
        Mahasiswa2 m3 = new Mahasiswa2("Cici", "M003");
        Mahasiswa2 m4 = new Mahasiswa2("Dedi", "M004");
        Mahasiswa2 m5 = new Mahasiswa2("Eka", "M005");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Total Peserta: " + s.countPeserta());
        System.out.println("Jumlah Mahasiswa: " + s.countMahasiswa());

        System.out.println("\nDaftar Peserta:");
        s.tampilPeserta();

        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}