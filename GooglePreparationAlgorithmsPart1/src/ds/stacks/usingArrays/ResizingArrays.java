package ds.stacks.usingArrays;
/*
If array is full, double its size
If array is 3/4 empty, decrease size by half
 */
public class ResizingArrays {
    String[] array = new String[1];
    int current = 0;

    public void push(String input) {
        if (current == array.length) {
            array = resize(2 * array.length);
        }
        array[current++] = input;
    }

    private String[] resize(int size) {
        String[] arrayCopy = new String[size];
        for (int index = 0; index < current; index++) {
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
        String item = array[--current];
        array[current] = null;
        if (current > 0 && current == array.length / 4) {
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
    }
}
