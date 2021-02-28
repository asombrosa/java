package ds.symbolTables.usingArrays;

import java.util.Arrays;

public class SymbolTable<K extends Comparable<K>, V extends Comparable<V>> {
    SymbolTableElement<K, V>[] symbolTable = new SymbolTableElement[10];
    int counter = 0;

    public int rank(K key) {
        int low = 0;
        int high = counter;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int cmp = key.compareTo(symbolTable[mid].key);
            if (cmp < 0) {
                high = mid;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low;
    }

    public V get(K key) {
        if (isEmpty()) {
            return null;
        }
        int i = rank(key);
        if (i < counter && symbolTable[i].key.compareTo(key) == 0) {
            return symbolTable[i].value;
        }
        return null;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public void shiftElementsFrom(int low) {
        SymbolTableElement<K, V> temp = symbolTable[low];
        for (int index = low; index < counter; index++) {
            SymbolTableElement<K, V> temp2 = symbolTable[index + 1];
            symbolTable[index + 1] = temp;
            temp = temp2;
        }
        counter++;
    }

    public void insert(K key, V value) {
        if (counter >= symbolTable.length) {
            return;
        }
        SymbolTableElement<K, V> symbolTableElement = new SymbolTableElement<>(key, value);
        int rank = rank(key);
        if (symbolTable[rank] == null) {
            counter++;
        } else if (symbolTable[rank].key.compareTo(key) != 0) {
            shiftElementsFrom(rank);
        }
        symbolTable[rank] = symbolTableElement;
    }

    public static void main(String[] args) {
        SymbolTable<Integer, Integer> symbolTable = new SymbolTable<>();
        symbolTable.insert(10, 5);
        symbolTable.insert(10, 8);
        symbolTable.insert(11, 11);
        symbolTable.insert(10, 10);
        symbolTable.insert(18, 6);
        symbolTable.insert(12, 6);
        symbolTable.insert(5, 5);
        symbolTable.insert(15, 15);
        symbolTable.insert(2, 2);
        symbolTable.insert(17, 17);
        symbolTable.insert(18, 18);
        symbolTable.insert(12, 12);
        symbolTable.insert(20, 20);
        symbolTable.insert(3, 3);
        System.out.println(symbolTable);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        Arrays.stream(symbolTable).forEach(e -> s.append(e).append(" "));
        return s.toString();
    }
}
