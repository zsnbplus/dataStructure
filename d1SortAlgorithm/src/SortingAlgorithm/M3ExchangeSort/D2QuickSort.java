package SortingAlgorithm.M3ExchangeSort;

import java.util.Arrays;

/** 快速排序
 *任取待排序列中的某元素作为基准值，按照该排序码将待排序集合分成两个子序列，
 * 左子序列中所有元素均小于基准值，右子序列中所有元素均大于基准值，
 * 然后左右子序列重复该过程，直到所有元素都排列在响应位置上为止
 */
public class D2QuickSort {
    public static void main(String[] args) {
        int a[] = {5,9,40,7,35,89,2,56,1,25,38};
        quickSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static int partion(int arr[],int left,int right){
        int pivot =  left;
        while (left<right){
            /*右边先走，找比a[pivot]小的*/
            while (left<right&&arr[right]>=arr[pivot]){
                right--;
            }

            /*左边走，找比a[pivot]大的*/
            while (left<right&&arr[left]<=arr[pivot]){
                left++;
            }
            swap(arr,right,left);
        }
        swap(arr,left,pivot);
        return left;
    }

    public static void qSort(int arr[],int left,int right){
        if (left<right){
            System.out.println(Arrays.toString(arr));
            int mid =  partion(arr,left,right);
            qSort(arr,left,mid-1);
            qSort(arr,mid+1,right);
        }
    }

    /**
     * 快速排序入口
     * @param arr
     * @param len
     */
    public static void quickSort(int arr[],int len){
        qSort(arr,0,len-1);
    }


    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
