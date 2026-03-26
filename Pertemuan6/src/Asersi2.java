class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }

}

public class Asersi2 {
    // double jariJari;
    public static void main(String[] args){
        double jariJari = 7;
        assert(jariJari > 0):"jari - jari tidak boleh nol!!!";
        Lingkaran L1 = new Lingkaran(jariJari);
        double kelilingLingkaran = L1.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }

//     PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
// // Jelaskan pada lembar laporan praktikum!
//     jawaban = nilai jari-jari belum di inisialisasi atau beri nilai;
//     nama variabel lingkaran tidak boleh hanya angka, harus ada huruf;
}
