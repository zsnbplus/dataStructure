package JVM;

import java.util.Random;

/**
 * 演示堆内存溢出
 */
public class OOMException {

    public static void main(String[] args) {
        String str = "asdfklajsklf";
        while (true){
            str +=str+new Random().nextInt(888888888)+new Random(999999999);
        }
    }
}
