package demo;

import java.util.Scanner;

/**
 * 分解一个数的所有因数，
 * 一个数对它的因数求余都会为0
 */
public class demo04 {
    public static void main(String[] args) {
        int n = 12;
        System.out.print(n+"=");
        for (int i=2;i<=n;i++) {
            while (n != i) {
                if (n % i == 0) {
                    n = n / i;
                    System.out.print(i + "*");
                }else break;
            }
        }
        System.out.println(n);
    }
}
