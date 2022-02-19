package SortingAlgorithm.M3ExchangeSort;

import java.util.Arrays;

/**冒泡排序
 * 从待排序列的首元素开始，从前往后依次进行比较
 * 若大于则交换，将其继续与后面元素比较，直到被放至到正确位置
 *重复以上步骤，直到所有元素排序完成
 *
 */
public class D1BubbleSort {
    public static void main(String[] args) {
        int a[] = {5,9,40,7,35,89,2,56,1,25,38};
        bubbleSort(a,11 );
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int arr[],int n){
        int i,j;
        for (i=0;i<n-3;i++){
            for (j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
