package Test;

import java.util.Arrays;

public class test02 {
    public static void main(String[] args) {
        int a[] = {5,9,40,7,35,89,2,56,1,25,38};
        selectionSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSort(int[] a, int length) {
        for (int i=0;i<length;i++){
            int min = i;
            for (int j=i+1;j<length;j++){
                if (a[j]<a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
}
