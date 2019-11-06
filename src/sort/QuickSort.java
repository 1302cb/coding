package sort;

public class QuickSort {
    public void quickSort(int[] array,int first,int last){
        int i = first, j = last,temp = array[first];
        while(i<j){
            while (i<j&&array[j]>=temp)j--;
            array[i] = array[j];
            while(i<j&&array[i]<=temp)i++;
            array[j] = array[i];
        }
        array[i] = temp;
        if(first<i-1)quickSort(array,first,i-1);
        if(i+1<last)quickSort(array,i+1,last);
    }
    public void printSortedArray(int[] array){
        System.out.println("/*\n*快速排序算法\n*/");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
