package Example;

/**
 * Created by Ryan on 2019/3/14/0014
 */
public class Calculator {
    public static void main(String[] args) {
        int i =0 ,total =0;
        do{
            i=i+2;
            System.out.println("i="+i);
            total = total+(i++)*2;
            System.out.println("t="+total);
        }while (i<12);
            System.out.println("count:"+total);
    }
}
