package Example.test;

/**
 * @author: yan
 * @Date: 2019/5/24/0024 22:58
 * @Description:
 */
public class StringInc {

    public static void main(String[] args) {
        int i =1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        System.out.println("k:"+k);

    }
}
