package Sorting;

public class SelectionSort {
    // Take array of elements
    // [5, 1, 7, 0, -1]
    // Take a pointer at the start
    // at the right of the pointer if there is an element with lesser value, then swap with it
    // Keep swapping with the right element until the heavier element goes to the end
    // Keep doing that until the list is sorted

    int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        // pick each element and swap with the last element of the array

        // [2, 6, 1, 0, 3, 99, -1]

        // [2, 6, 1, 0, 3, >> 99 <<, -1]
        // [2, 6, 1, 0, 3, -1, >> 99 <<]

        // [2, >> 6 <<, 1, 0, 3, -1, 99]
        // [2, -1, 1, 0, 3, >> 6 <<, 99]

        // [2, -1, 1, 0, >> 3 <<, 6, 99]
        // [2, -1, 1, 0, >> 3 <<, 6, 99]


        for (int i = 0; i < arr.length; i++) {
            int largestNumIndex = 0;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] >= arr[largestNumIndex]) {
                    largestNumIndex = j;
                }
            }

            final int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[largestNumIndex];
            arr[largestNumIndex] = temp;
        }
    }

    public void printList() {
        for (int el :
                arr) {
            System.out.print(el + ", ");
        }

        System.out.println("");
    }
}
