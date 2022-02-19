package SortingAlgorithm.M3ExchangeSort.M2SelectionSort;

import java.util.Arrays;

/**堆排序：本质上堆就是一个完全二叉树，下标为i的节点的父节点的下标为(i-1)/2,下标为i的节点的左孩子的下标为i*2+1,下标为i的节点的右孩子的下标为i*2+2
 * 小堆根上的元素是堆中最小的元素，大堆根上的元素是堆中最大的元素
 * 先将待排序列建成小(大)堆，
 * 每次获得堆根上的元素，这样就达到了选出待排序列中最小(大)元素的目的
 * 以大堆根为例通俗的说就是先将待排序列建成大堆根，
 * 然后在将大堆根取出，即和最后一个节点的值进行交换，然后下标减一，
 * 依次类推，最后得到的就是一个有序序列
 */
public class D2HeapSort {
    public static void main(String[] args) {
        int a[] = {5,9,40,7,35,89,2,56,1,25,38};
        heap_sort(a,11 );
        System.out.println(Arrays.toString(a));
    }

    /**
     * 维护堆的性质(使其为大顶堆，或小顶堆)
     * @param arr   存储堆的数组
     * @param n     数组的长度
     * @param i     待维护节点的下标
     */
    public static void heapify(int arr[],int n,int i){
        int largest = i;
        int lson = i * 2 + 1; //堆首先是一颗完全二叉树满足，父节点为(i-1)/2,做孩子为i*2+1,右孩子为i*2+2
        int rson = i * 2 + 2;
        if (lson < n && arr[largest] < arr[lson]){
            largest = lson;
        }
        if (rson < n && arr[largest] < arr[rson]){
            largest = rson;
        }
        if (largest != i){
            swap(arr,largest,i);
            heapify(arr,n,largest);  //需要继续对该节点进行维护
        }
    }

    /**
     * 堆排序的入口
     * @param arr
     * @param n
     */
    public static void heap_sort(int arr[],int n){
        int i;//要维护的第一个节点(假设它是某个节点的父节点)
        //建堆
        for (i=(n-1-1)/2;i>=0;i--){ //父节点的下标为(i-1)/2，然而这里n代表数组长度，堆的下标排序从0开始与数组相同，所以堆的最大下标为n-1
            heapify(arr,n,i);
        }

        //排序
        for (i=n-1;i>0;i--){
            swap(arr,i,0);
            heapify(arr,i,0);
        }
    }

    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
