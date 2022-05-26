import Sorting.SelectionSort;

public class main {
    public static void selectionSort() {
        final int[] arr = {2, 6, 1, 0, 3, 99, -1, 20};

        SelectionSort list = new SelectionSort(arr);
        list.printList();
        list.sort();
        list.printList();
    }

    public static void main(String[] args) {
        selectionSort();
    }
}
