package SortingAlgorithm.M3ExchangeSort.M1InsertSort;


import java.util.Arrays;

import static java.lang.System.*;

/** 希尔排序
 * 先记住一点：在序列的排序中，元素越少，需要交换的次数越少，排序越快。
 * 希尔排序也称为递减增量排序，每次按增量作为间隔分组，在对组内元素进行插入排序，
 * 当所有组排序完成后，在增量减半，按上面的方法进行排序，
 * 当 gap = 1 时，此时序列已经进行了多次预排序，接近有序。
 * 这时再对序列进行直接插入排序，就能达到优化的效果。
 *
 * 5,8,3,4,2,4,1
 * 以上序列7/2 ，增量为3
 */
public class D2ShellSort {
    public static void main(String[] args) {
        int a[] = {5,9,40,7,35,89,2,56,1,25,38};
        out.println(Arrays.toString(a));
        shellSort(a,a.length);
    }

    public static void shellSort(int a[],int n){
/*        int gap=n/2;
        int j,x=0;
        do{
            out.println(gap);
            for (int i=0;i<n;i++){
                if (i+gap<n){
                   x = a[i+gap];
                }else {
                    break;
                }
                for (j=i;j>=0;j-=gap){
                    if (a[j]>x){
                        a[j+gap] = a[j];
                    }else{
                        break;
                    }
                }
                a[j+gap] = x;
            }
            gap= gap/2 ;
        }while(gap>0);*/

        int gap=n/2;
        int j,x=0;
        do{
            out.println(gap);
            for (int i=0;i<n&&i+gap<n;i++){
                    x = a[i+gap];
                for (j=i;j>=0&&a[j]>x;j-=gap){
                        a[j+gap] = a[j];
                }
                a[j+gap] = x;
            }
            gap= gap/2 ;
            out.println(Arrays.toString(a));
        }while(gap>0);
    }

}
