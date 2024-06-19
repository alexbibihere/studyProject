package nowcoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author yandg
 * @Date 2024/06/02 0002 1:15
 * @Description HashMap操作类：遍历、存取值
 */
public class HashMapOperation {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        //遍历hashmap
        // todo 通过键值对遍历(推荐使用)
        for (Map.Entry<String,Integer> entry : hashMap.entrySet() ){
            System.out.println("key" + entry.getKey() + ",value:" + entry.getValue());
        }

        // 使用迭代器遍历
        Iterator<Map.Entry<String,Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println("key:" +next.getKey() );
        }

        // 遍历键
        for (String key : hashMap.keySet()){
            System.out.println("key:" + key);
        }
        // 遍历值
        for (Integer value: hashMap.values()) {
            System.out.println(",value:" + value);
        }

        // 使用lambda表达式遍历hashmap
        hashMap.forEach((key,value)->{
            System.out.println(key + ":" +value);
        });
    }
}
