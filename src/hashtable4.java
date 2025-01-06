import java.util.LinkedList;

public class hashtable4 {
    class HashTable<K, V> {
        private static class Entry<K, V> {
            K key;
            V value;

            Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private LinkedList<Entry<K, V>>[] table;
        private static final int SIZE = 10;

        public HashTable() {
            table = new LinkedList[SIZE];
            for (int i = 0; i < SIZE; i++) {
                table[i] = new LinkedList<>();
            }
        }

        private int hash(K key) {
            return Math.abs(key.hashCode()) % SIZE;
        }

        public void put(K key, V value) {
            int index = hash(key);
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
            }
            table[index].add(new Entry<>(key, value));
        }

        public V get(K key) {
            int index = hash(key);
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
            return null;
        }

        public void remove(K key) {
            int index = hash(key);
            table[index].removeIf(entry -> entry.key.equals(key));
        }
    }
    public void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>();
        hashTable.put("name", "Ali");
        hashTable.put("city", "Istanbul");
        hashTable.put("job", "Engineer");

        System.out.println("Name: " + hashTable.get("name"));
        System.out.println("City: " + hashTable.get("city"));

        hashTable.remove("city");
        System.out.println("City after removal: " + hashTable.get("city"));
    }
}
