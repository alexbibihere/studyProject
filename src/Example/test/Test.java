package Example.test;

/**
 * Created by Ryan on 2019/4/3/0003
 */
public class Test {

    public static void main(String[] args) {

        int[] arr={5,4,6,3,9,12,35,42,18,29,30};
        int m1,m2;//存储两个最小值
        m1=arr[0];
        m2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<m1){
                m2=m1;
                m1=arr[i];
            }else if(arr[i]<m2){
                m2=arr[i];
            }
        }
        System.out.println(m1+","+m2);


//        String x ="fmn";
//        x.toUpperCase();
//        System.out.println(x);
//        String y = x.replace('f','F');
//        y =y+"wxy";
//        System.out.println(y);
    }
}
