import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class hashtable2 {
    public static void main(String[] args) {
        String ayrac = new String(new char[15]).replace("\0","-");

        Hashtable<String, String> sozluk = new Hashtable<>();

        sozluk.put("Apple","Elma");
        sozluk.put("Table","Masa");
        sozluk.put("Chair","Sandalye");
        sozluk.put("Newspaper","Gazete");
        sozluk.put("Banana","Muz");

        int puan = 0, dogru = 0, yanlis = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(ayrac+"\n < Hashtable Örnekleri > \n"+ayrac);
        System.out.println("-> Karşınıza Türkçe - İngilizce rastgele bazı kelimeler çıkacak.\n-> Lütfen gelen kelimenin karşılığını yazın.\n"+ayrac);
        Enumeration keys = sozluk.keys();
        while(keys.hasMoreElements()){
            String key = (String) keys.nextElement();
            String value = sozluk.get(key);
            System.out.print("-> ["+key+"] Metinin Karşılığını Yazın: ");
            String scan = scanner.next();
            if(scan.equals(value) == true) {
                puan += 10;
                dogru += 1;
            }
            else{
                puan -= 10;
                yanlis += 1;
            }
            System.out.println(ayrac);
        }
        System.out.println("-> Puanınız: "+puan+"\n-> Doğru Sayınız: "+dogru+"\n-> Yanlış Sayınız: "+yanlis+"\n"+ayrac);
    }
}
