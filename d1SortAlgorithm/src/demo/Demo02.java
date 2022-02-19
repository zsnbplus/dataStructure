package demo;

/**
 * 十进制转二进制
 */
public class Demo02 {
    public static void main(String[] args) {
        int ten = 4;
        String two = "";
        while (ten!=0){
            two = ten%2 + two;
            ten = ten/2;
        }
        System.out.println(two);
    }

}
