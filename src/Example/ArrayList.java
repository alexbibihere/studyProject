package Example;

import java.lang.reflect.Array;
import java.util.Iterator;

/**
 * Created by Ryan on 2019/3/14/0014
 */
public class ArrayList {
    //遍历ArrayList的三种方法

    public static void main(String[] args) {

        java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        list.add("abc");
        list.add("rls");
        list.add("1");

        //第一种方法 ：  用for each遍历list
        for(String str :list){
            System.out.println(str);
        }

        //第二种方法 ：  把链表变为数组相关的内容进行遍历
        String[] strings = new String[list.size()];
        list.toArray(strings);
        for(String str:strings){
            System.out.println(str);
        }

        //第三种方法：  使用迭代器进行相关遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){               //hasNext():  表示是否有下一个元素
            System.out.println(it.next());  // next()； 指向下一个元素
        }
    }
}
