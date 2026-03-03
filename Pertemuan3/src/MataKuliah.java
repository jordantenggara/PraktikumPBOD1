public class MataKuliah {
    /***************ATRIBUT***************/
    private String idMatKul;
    private String Nama;
    private int sks;

    /***************METHOD***************/
    public MataKuliah(){
        idMatKul = "";
        Nama = "";
        sks = 3;
    }

    public MataKuliah(String iidMatKul,  String iNama, int isks){
        idMatKul = iidMatKul;
        Nama = iNama;
        sks = isks;
    }

    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return Nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatKul(String iIdMatKul){
        idMatKul = iIdMatKul;
    }

    public void setNama(String iNama){
        Nama = iNama;
    }

    public void setSks(int iSks){
        sks = iSks;
    }
}
