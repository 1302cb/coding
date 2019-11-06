import sort.HeapSort;
import sort.MergeSort;
import sort.QuickSort;

public class Hello {

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 0, 8, 5};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array,0,array.length-1);
        quickSort.printSortedArray(array);
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array,0,array.length-1);
        mergeSort.printArray(array);
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(array);
        heapSort.printArray(array);
    }
}
