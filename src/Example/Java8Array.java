package Example;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ryan on 2019/5/9/0009
 */
public class Java8Array {
    //test  lambda 表达式

    public static void main(String[] args) {
        String[] te={"1231","123"};
        List<String> pals = Arrays.asList(te);
        pals.forEach((pal)-> System.out.println(pals));
    }
}
