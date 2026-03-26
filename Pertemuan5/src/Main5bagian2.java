public class Main5bagian2 {
    public static void main(String[] args) {

        BangunDatar5 P1 = new Persegi5(10, "a", "a");
        Persegi5 P2 = new Persegi5(5, "a", "a");
        BangunDatar5 L1 = new Lingkaran5(7, "a", "a");
        Lingkaran5 L2 = new Lingkaran5(14, "a", "a");

        // // cek luas
        // System.out.println("P1 vs P2 (luas): " + P1.isEqualLuas(P2));
        // System.out.println("P2 vs L1 (luas): " + P2.isEqualLuas(L1));

        // // cek keliling
        // System.out.println("L1 vs L2 (keliling): " + L1.isEqualKeliling(L2));
        // System.out.println("P1 vs L1 (keliling): " + P1.isEqualKeliling(L1));
    
    
        Persegi5 p = new Persegi5(10, "b", "b");
        Lingkaran5 l = new Lingkaran5(7, "b", "b");

        System.out.println("Sebelum resize");
        System.out.println("Luas Persegi: " + p.getLuas());
        System.out.println("Luas Lingkaran: " + l.getLuas());

        // zoom in (tambah 10%)
        p.zoomIn();
        l.zoomIn();

        System.out.println("\nSetelah zoomIn");
        System.out.println("Luas Persegi: " + p.getLuas());
        System.out.println("Luas Lingkaran: " + l.getLuas());

        // zoom out (kurang 10%)
        p.zoomOut();
        l.zoomOut();

        System.out.println("\nSetelah zoomOut");
        System.out.println("Luas Persegi: " + p.getLuas());
        System.out.println("Luas Lingkaran: " + l.getLuas());

        // zoom custom
        p.zoom(200); // jadi 200%
        l.zoom(50);  // jadi 50%

        System.out.println("\nSetelah zoom custom");
        System.out.println("Luas Persegi: " + p.getLuas());
        System.out.println("Luas Lingkaran: " + l.getLuas());




        System.out.println(P2.isEqualLuas(L2));
        
    }

// Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek bangun datar yang berbeda?
// Bisa untuk selain yang menggunakan new BangunDatar

// Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas() dan isEqualKeliling pada class BangunDatar? Mengapa? 
// Bisa cuma kurang rapi karena harus membuat algoritma isequalluas dan keliling di class bangundatar

// Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
//mencegah membuat bangun datar (tidak jelas bangun apa)

// Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar? 
// bisa digunakan karena implements sekaligus extend, tidak bisa double extend  


    





}