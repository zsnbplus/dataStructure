package Test;

import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        int a[] = {5,9,40,7,35,89,2,56,1,25,38};
        insertSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void insertSort(int a[],int n){
        int j;
        for (int i=1;i<n;i++){
            int x = a[i];
            for (j=i-1;j>=0&&a[j]>x;j--){
                a[j+1] = a[j];
            }
            a[j+1]=x;
        }
    }
}
