package nowcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author yandg
 * @Date 2024/06/02 0002 1:15
 * @Description  List操作类：遍历
 */
public class ListOperation {

    public static void main(String[] args) {
        // ArrayList ,底层是动态数组，连续内存，查询快，增删慢
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");

        // 遍历ArrayList
        // for循环 i
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        // foreach
        for (String i: arrayList) {
            System.out.println(i);
        }
        // 迭代器iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // java8 stream
        arrayList.stream().forEach(s -> {
            System.out.println(s);
        });


        // LinkedList ，底层是双向链表，增删快，查询慢（需要前序和后序遍历）
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");

        // 使用下标索引遍历（性能极差）
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        // 迭代器遍历
        Iterator<String> linkIterator = linkedList.iterator();
        while (linkIterator.hasNext()){
            System.out.printf(linkIterator.next());
        }

        //增强for循环
        for (String s:linkedList) {
            System.out.println(s);
        }

        System.out.println(arrayList);
        System.out.println(linkedList);

    }
}
