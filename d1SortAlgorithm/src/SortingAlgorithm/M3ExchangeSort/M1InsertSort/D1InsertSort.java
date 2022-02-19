package SortingAlgorithm.M3ExchangeSort.M1InsertSort;

import java.util.Arrays;

/**
 * 直接插入排序
 * 基本思想
 * 每次从一个有序序列开始，将待排元素与有序序列中的元素从后往前逐个比较，
 * 若有序序列中的元素大于待排元素，则将较大的元素往后覆盖；
 * 否则，将待排元素插入其后面，并结束此轮比较。
 *
 * 5,8,3,4,2,4,1
 * 从5开始，5为一个排好序的集合，从8开始与5比较，8比5大位置不变
 * 然后从3开始，与8比较，8比3大，向后移动一位
 *
 */
public class D1InsertSort {

    public static void main(String[] args) {
        int a[] = {5,9,40,7,35,89,2,56,1,25,38};
        insertSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void insertSort(int a[], int n) { //n为数组的长度
    /*    for (int i = 1; i < n ; i++) {
            int end = i;
            int x = a[end + 1];
            while (end >= 0) {
                if (a[end] > x) {
                    a[end + 1] = a[end];
                    end--;
                } else
                    break;
            }
            a[end + 1] = x;
        }*/
 /*
    for(int i=1;i<n;i++){
        int x = a[i];  //要插入的元素
        for (j=i-1;j>=0;j--){
            if (a[j]>x){     //序列元素大于待排序元素
                a[j+1]=a[j];  //序列元素向后覆盖
            }
            else{
                break;
            }
        }
        a[j+1]=x;
    }*/
        int j ;
        for(int i=1;i<n;i++){
            int x = a[i];  //要插入的元素
            for (j=i-1;j>=0&&a[j]>x;j--){
                    a[j+1]=a[j];  //序列元素向后覆盖
            }
            a[j+1]=x;
        }
    }


}

