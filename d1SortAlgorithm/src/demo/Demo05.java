package demo;

/**
 * 两个罗马数字相加，输出和
 */
public class Demo05 {
    public static void main(String[] args) {
        String x = "DD";

        System.out.println(romanToInt(x));

    }

    public static int romanToInt(String s) {
        /*注意：只提交函数内代码即可*/

        int sum = 0;

        if (s.length() == 1) {// 只有一个字符时

            if (s.charAt(0) == 'I')

                sum = 1;

            else if (s.charAt(0) == 'V')

                sum += 5;

            else if (s.charAt(0) == 'X')

                sum += 10;

            else if (s.charAt(0) == 'L')

                sum += 50;

            else if (s.charAt(0) == 'C')

                sum += 100;

            else if (s.charAt(0) == 'D')

                sum += 500;

            else if (s.charAt(0) == 'M')

                sum += 1000;

        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'I') {
                if (s.charAt(i + 1) == 'V') {
                    sum += 4;

                    i++;

                } else if (s.charAt(i + 1) == 'X') {
                    sum += 9;

                    i++;

                } else

                    sum += 1;

            } else if (s.charAt(i) == 'X') {
                if (s.charAt(i + 1) == 'L') {
                    sum += 40;

                    i++;

                } else if (s.charAt(i + 1) == 'C') {
                    sum += 90;

                    i++;

                } else

                    sum += 10;

            } else if (s.charAt(i) == 'C') {
                if (s.charAt(i + 1) == 'D') {
                    sum += 400;

                    i++;

                } else if (s.charAt(i + 1) == 'M') {
                    sum += 900;

                    i++;

                } else

                    sum += 100;

            } else if (s.charAt(i) == 'V')

                sum += 5;

            else if (s.charAt(i) == 'L')

                sum += 50;

            else if (s.charAt(i) == 'D')

                sum += 500;

            else if (s.charAt(i) == 'M')

                sum += 1000;

        }

        if (s.length() > 1) {
            if (s.charAt(s.length() - 1) == 'I')

                sum++;

            else if (s.charAt(s.length() - 1) == 'V' && s.charAt(s.length() - 2) != 'I')

                sum += 5;

            else if (s.charAt(s.length() - 1) == 'X' && s.charAt(s.length() - 2) != 'I')

                sum += 10;

            else if (s.charAt(s.length() - 1) == 'L' && s.charAt(s.length() - 2) != 'X')

                sum += 50;

            else if (s.charAt(s.length() - 1) == 'C' && s.charAt(s.length() - 2) != 'X')

                sum += 100;

            else if (s.charAt(s.length() - 1) == 'D' && s.charAt(s.length() - 2) != 'C')

                sum += 500;

            else if (s.charAt(s.length() - 1) == 'M' && s.charAt(s.length() - 2) != 'C')

                sum += 1000;

        }

        return sum;

    }
}
