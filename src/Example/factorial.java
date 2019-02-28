package Example;

/**
 * @author: yan
 * @Date: 2018/1/13/0013 19:54
 * @Description: 递归 斐波那契数列
 */
public class factorial {

    public static void main(String args[]) {
        System.out.println(fibonacci(4));

    }

    //递归
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //斐波那契数列   0 1 1 2 3 5 8 13 21 34 55
    public static long fibonacci(long index){
        if (index ==0){
            return 0;
        }else if (index ==1){
            return 1;
        } else{
            return fibonacci(index -1)+fibonacci(index-2);
        }

    }
}
