import java.util.ArrayList;

public class Mahasiswa {
    /***************ATRIBUT***************/
    private String NIM;
    private String Nama;
    private String Prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***************METHOD***************/
    public Mahasiswa(){
        NIM = "";
        Nama = "";
        Prodi = "";
        listMatKul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    public Mahasiswa(String NIM, String Nama, String Prodi, Dosen dosenWali, Kendaraan kendaraan){
        this.NIM = NIM;
        this.Nama = Nama;
        listMatKul = new ArrayList<>();
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return listMatKul;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }  

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNIM(String x){
        NIM = x;
    }

    public void setNama(String x){
        Nama = x;
    }

    public void setProdi(String x){
        Prodi = x;
    }

    public void setDosenWali(Dosen x){
        dosenWali = x;
    }

    public void setKendaraan(Kendaraan x){
        kendaraan = x;
    }

    public void addMatKul(MataKuliah x){
        listMatKul.add(x);
    }

    public int getJumlahSks(){
        int JumlahSks = 0;
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            JumlahSks += listMatKul.get(i).getSks();
        }
        return JumlahSks;
    }

    public int getJumlahMatKul(){
        int JumlahMatKul = 0;
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            JumlahMatKul++;
        }
        return JumlahMatKul;
    }

    public void printMhs(){
        System.out.println(NIM);
        System.out.println(Nama);
        System.out.println(Prodi);
    }

    public void printDetailMhs(){
        System.out.println(NIM);
        System.out.println(Nama);
        System.out.println(Prodi);

        int i;
        for(i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }

        System.out.println(dosenWali);
        System.out.println(kendaraan);
    }




}
