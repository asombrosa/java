package ds.graphs;

import java.util.Iterator;

public class Bag<T extends Comparable<T>> implements Iterable<T>{
    T[] array;
    int counter = 0;

    public Bag() {
        array = (T[])new Comparable[10];
    }

    public void add(T v){
        array[counter] = v;
        counter++;
    }
    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator {
        int val;
        @Override
        public boolean hasNext() {
            return array[val] != null;
        }

        @Override
        public Object next() {
            return array[val++];
        }
    }
}
