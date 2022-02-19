package demo;

/**
 * 不用中间变量交换两个变量的值
 */
public class Demo01 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
      /*  a = a+b;
        b = a-b;
        a = a-b;*/
      a = a^b;
      b = a^b;
      a = a^b;
        System.out.println(a+"--"+b);
    }



}
