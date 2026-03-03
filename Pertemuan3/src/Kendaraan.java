public class Kendaraan {
    /***************ATRIBUT***************/
    String noPlat;
    String jenis;

    /***************METHOD***************/
    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String x, String y){
        noPlat = x;
        jenis = y;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String x){
        noPlat = x;
    }

    public void setJenis(String x){
        jenis = x;
    }
}
