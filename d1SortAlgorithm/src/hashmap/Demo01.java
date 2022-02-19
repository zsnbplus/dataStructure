package hashmap;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>(12,-1);
        hashMap.put("1","2");
        hashMap.get("1");
    }
}
