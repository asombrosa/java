package ds.stacks.genericIterableCode;

import java.util.Iterator;

public class ResizingArrays implements Iterable<String> {
    String[] array = new String[1];
    int N = 0;

    public Iterator<String> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<String> {
        int current = N;

        @Override
        public boolean hasNext() {
            return current > 0;
        }

        @Override
        public String next() {
            return array[--current];
        }
    }

    public void push(String input) {
        if (N == array.length) {
            array = resize(2 * array.length);
        }
        array[N++] = input;
    }

    private String[] resize(int size) {
        String[] arrayCopy = new String[size];
        if (size > array.length) {
            size = array.length;
        }
        for (int index = 0; index < size; index++) {
            arrayCopy[index] = array[index];
        }
        return arrayCopy;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String element : array) {
            stringBuilder.append(element).append(" --> ");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public String pop() {
        String item = array[--N];
        array[N] = null;
        if (N > 0 && N == array.length / 4) {
            array = resize(array.length / 2);
        }
        return item;
    }

    public static void main(String[] args) {
        ResizingArrays resizingArrays = new ResizingArrays();
        System.out.println(resizingArrays.array.length);
        resizingArrays.push("First Element");
        System.out.println(resizingArrays.array.length);
        resizingArrays.push("Second Element");
        System.out.println(resizingArrays.array.length);
        resizingArrays.push("Third Element");
        System.out.println(resizingArrays.array.length);
        resizingArrays.push("Fourth Element");
        System.out.println(resizingArrays.array.length);
        resizingArrays.push("Fifth Element");
        System.out.println(resizingArrays.array.length);
        resizingArrays.push("Sixth Element");
        System.out.println(resizingArrays.array.length);
        System.out.println(resizingArrays);
        System.out.println("ITERATOR --------------------------------");
        Iterator<String> iterator = resizingArrays.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("ITERATOR END -------------------------");
        String popped = resizingArrays.pop();
        System.out.println(popped);
        System.out.println(resizingArrays.array.length);
        popped = resizingArrays.pop();
        System.out.println(popped);
        System.out.println(resizingArrays.array.length);
        popped = resizingArrays.pop();
        System.out.println(popped);
        System.out.println(resizingArrays.array.length);
        popped = resizingArrays.pop();
        System.out.println(popped);
        System.out.println(resizingArrays.array.length);
        popped = resizingArrays.pop();
        System.out.println(popped);
        System.out.println(resizingArrays.array.length);
        popped = resizingArrays.pop();
        System.out.println(popped);
        System.out.println(resizingArrays.array.length);

        iterator = resizingArrays.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
