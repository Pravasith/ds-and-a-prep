package Sorting;

public class BubbleSort {
    // Bubble the highest element to the last
    // By bubble, I mean keep swapping each element with its
    // next element, until it reaches the end of the list
    // Repeat this in a loop until there are no swaps left

    // [2, 6, 1, 0, 3, 99, -1]

    // [>> 2, 6 <<, 1, 0, 3, 99, -1]
    // [>> 2, 6 <<, 1, 0, 3, 99, -1]

    // [2,>> 6, 1 <<, 0, 3, 99, -1]
    // [2,>> 1, 6 <<, 0, 3, 99, -1]

    // [2, 1,>> 6, 0 <<, 3, 99, -1]
    // [2, 1,>> 0, 6 <<, 3, 99, -1]

    // [2, 1, 0,>> 6, 3 <<, 99, -1]
    // [2, 1, 0,>> 3, 6 <<, 99, -1]

    int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            int swapFlag = 0;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    final int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapFlag = 1;
                }
            }

            if (swapFlag == 0) break;
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
