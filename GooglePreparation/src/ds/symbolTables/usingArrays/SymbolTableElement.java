package ds.symbolTables.usingArrays;

public class SymbolTableElement<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<K> {
    K key;
    V value;

    SymbolTableElement(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(K o) {
        return this.key.compareTo(o);
    }

    public String toString() {
        return "[ Key : " + key + ", Value : " + value + " ]\n";
    }
}
