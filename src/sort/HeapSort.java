package sort;

public class HeapSort {


    /**
     * 进行堆排序
     *
     * @param array
     */
    public void heapSort(int[] array) {
        //第一次需要建立一个大根堆
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, length);
        }
        //将堆顶元素与最后一个元素进行交换，反复调整堆
        for (int i = length - 1; i >= 0; i--) {
            swap(array, 0, i);
            adjustHeap(array, 0, i);
        }
    }

    /**
     * 调整数组的位置使之成为大根堆
     *
     * @param array
     * @param i
     * @param length
     */
    public void adjustHeap(int[] array, int i, int length) {
        int temp = array[i];
        for (int j = 2 * i + 1; j < length; j = j * 2 + 1) {
            if (j + 1 < length && array[j] < array[j + 1]) {
                j++;
            }
            if (array[j] > array[i]) {
                array[i] = array[j];
                i = j;
            } else {
                break;
            }
        }
        array[i] = temp;
    }

    /**
     * 主要用于交换数组中的两个数字
     *
     * @param array 数组
     * @param i     位置1
     * @param j     位置2
     */
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 打印数组
     *
     * @param array
     */
    public void printArray(int[] array) {
        System.out.println("/*\n*堆排序算法\n*/");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
