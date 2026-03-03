/*
Nama File : Dosen.java
Deskripsi : berisi atribut dan method dalam class Dosen
Pembuat : Jordan Tenggara 
Tanggal : 02 Maret 2026
 */

public class Dosen {
    /***************ATRIBUT***************/
    private String NIP;
    private String Nama;
    private String Prodi;

    /***************METHOD***************/
    public Dosen(){
        NIP = "";
        Nama = "";
        Prodi = "";
    }

    public Dosen(String inputNIP, String Nama, String Prodi){
        inputNIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public String setNIM(String iNIP){
        return NIP = iNIP;
    }

    public void setNama(String iNama){
        Nama = iNama;
    }

    public void setProdi(String iProdi){
        Prodi = iProdi;
    }

}
