package SortingAlgorithm.M3ExchangeSort.M2SelectionSort;

import java.util.Arrays;

/**直接选择排序
 * 每一次从待排序的数据元素中选出最小(最大)的元素，存放在序列的起始(末尾)位置，直到全部的待排序元素排完
 */
public class D1SelectionSort {
    public static void main(String[] args) {
        int a[] = {5,9,40,7,35,89,2,56,1,25,38};
        selectionSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(int a[],int n){
        int i,j,min;
        for (i=0;i<n;i++){
            min = i;
            for (j=i;j<n;j++){
                if (a[j]<a[min]){
                    min = j;
                }
            }
            int temp;
            temp = a[i];
            a[i]=a[min];
            a[min] = temp;
        }
    }
}
