/**
 * File : Latihan.java
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class Latihan {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124120044", "Jordan Tenggara");
        mahasiswaMap.put("24060124140203", "Wolfie");
        mahasiswaMap.put("24060124140204", "Hotori");

        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}
