import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args) {

        String ayrac = new String(new char[15]).replace("\0","-");

        Hashtable table = new Hashtable();

        table.put(1836025,"Emre");
        table.put(2346021,"Ömer Faruk");
        table.put(6524786,"Ali İhsan");
        table.put(5584290,"Mert");

        System.out.println(ayrac+"\n< Java Hashtable Metotları >\n"+ayrac);
        System.out.println("-> entrySet() Metot Kullanımı: " + table.entrySet());
        System.out.println("-> remove(5584290) Metot Kullanımı: " + table.remove(5584290));
        System.out.println("-> Get(2346021) Metot Kullanımı: " + table.get(2346021));
        System.out.println("-> \"Ali İhsan\".Equals(\"Ali Kefal\") Metot Kullanımı: " + "Ali İhsan".equals("Ali Kefal"));
        System.out.println("-> containsKey(1836025) Metot Kullanımı: "+ table.containsKey(1836025));
        System.out.println("-> keys() Metot Kullanımı: "+ table.keys());
        System.out.println("-> hashCode() Metot Kullanımı: " + table.hashCode());
        System.out.println("-> elements() Metot Kullanımı: " + table.elements()+"\n"+ayrac);
    }
}
