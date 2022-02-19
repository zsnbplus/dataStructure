package demo;

/**
 * 递归计算最大公因数
 */
public class Demo03 {
    public static void main(String[] args) {
        System.out.println(maxSon(63, 98));
        System.out.println(minParent(4,16));
    }

    /**
     * 最大公因(约)数
     * @param a
     * @param b
     * @return
     */
    public static int maxSon (int a,int b){
      if (b==0)
          return a;
      return maxSon(b,a%b);
    }

    /**
     * 最小公倍数
     * 两个数的和/最大公约数
     */
    public static int minParent(int a,int b){

        return a*b/maxSon(a,b);
    }



}
