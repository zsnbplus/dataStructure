package Test;

import java.util.Arrays;

public class test03 {
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
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
