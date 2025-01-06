import java.util.HashMap;

public class hashtable3 {
    public static void main(String[] args) {

        // HashMap oluşturma
        HashMap<String, String> hashMap = new HashMap<>();

        // Veriler ekleme
        hashMap.put("name", "Ali");
        hashMap.put("age", "25");
        hashMap.put("city", "Istanbul");

        // Verilere erişim
        System.out.println("Name: " + hashMap.get("name"));
        System.out.println("Age: " + hashMap.get("age"));
        System.out.println("City: " + hashMap.get("city"));

        // Tüm anahtarları ve değerleri döngüyle gezme
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Bir elemanı kaldırma
        hashMap.remove("city");
        System.out.println("Updated HashMap: " + hashMap);
    }
}

