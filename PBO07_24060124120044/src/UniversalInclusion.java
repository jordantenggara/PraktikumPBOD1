/*
Nama File : UniversalInclusion.java
Deskripsi : Universal Inclusion Anabul
Pembuat : Jordan Tenggara 
Tanggal : 28 April 2026
*/

/*
Nama Class : Anabul
Deskripsi: Kelas Abstrak Parent
*/
abstract class Anabul {
    public abstract void bersuara();
    public abstract void bergerak();
}

/*
Nama Class : Kucing
Deskripsi: Kelas Anak 
*/
class Kucing extends Anabul {
    public void bersuara() {
        System.out.println("Meong");
    }

    public void bergerak() {
        System.out.println("Melata");
    }
}

/*
Nama Class : Anjing
Deskripsi: Kelas Anas 
*/
class Anjing extends Anabul {
    public void bersuara() {
        System.out.println("Guk-guk");
    }

    public void bergerak() {
        System.out.println("Melata");
    }
}

/*
Nama Class : Burung
Deskripsi: Kelas Anak 
*/
class Burung extends Anabul {
    public void bersuara() {
        System.out.println("Cuit");
    }

    public void bergerak() {
        System.out.println("Terbang");
    }
}

/*
Nama Class : UniversalInclusion
Deskripsi: Main 
*/
public class UniversalInclusion {
    public static void main(String[] args) {
        Anabul[] hewan = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul a : hewan) {
            a.bersuara();
            a.bergerak();
            System.out.println();
        }
    }
}