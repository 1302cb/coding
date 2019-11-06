package sort;

/**
 * 归并的思想就是先分再合，分两步走就行。
 */
public class MergeSort {
    public void merge(int[] array, int left, int mid, int right, int length) {
        int i = left, j = mid + 1, k = 0;
        int[] temp = new int[length];
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        if (i == mid + 1) {
            while (j <= right) {
                temp[k++] = array[j++];
            }
        } else {
            while (i <= mid) {
                temp[k++] = array[i++];
            }
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            array[i] = temp[k];
        }
    }

    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            //前一部分是分
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            //后一部分是合
            merge(array, left, mid, right, right - left + 1);
        }
    }

    public void printArray(int[] array) {
        System.out.println("/*\n*归并排序算法\n*/");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
