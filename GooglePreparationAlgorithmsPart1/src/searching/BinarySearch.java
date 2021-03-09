package searching;

/*
Time complexity : O(log N)
 */
public class BinarySearch {

    public int searchElement(int[] inputArray, int elementToBeSearched) {
        int low = 0;
        int high = inputArray.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (elementToBeSearched < inputArray[mid]) {
                high = mid;
            } else if (elementToBeSearched > inputArray[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 19, 23, 34, 45, 56, 67, 78, 89, 90};
        BinarySearch binarySearch = new BinarySearch();
        int number = binarySearch.searchElement(array, 45);
        System.out.println(number);
        number = binarySearch.searchElement(array, 44);
        System.out.println(number);
    }
}
