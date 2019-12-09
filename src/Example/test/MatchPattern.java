package Example.test;

/**
 * @author: yan
 * @Date: 2019/7/24/0024 23:52
 * @Description:
 */
public class MatchPattern {


    //匹配0-99  两位数的正整数
    public static void main(String[] args) {
        String pattern="1";
        String pattern1="0";
        String pattern2="00";
        String pattern3="06";
        String pattern4="15.4";
        String pattern5="1";






        System.out.println(pattern.matches("0|(^[1-9]\\d*$)" ));///^[1-9]\d*$/
        System.out.println(pattern1.matches("0|(^[1-9]\\d*$)" ));///^[1-9]\d*$/

        System.out.println(pattern2.matches("0|(^[1-9]\\d*$)" ));///^[1-9]\d*$/


        System.out.println(pattern3.matches("0|(^[1-9]\\d*$)" ));///^[1-9]\d*$/

        System.out.println(pattern4.matches("0|(^[1-9]\\d*$)" ));///^[1-9]\d*$/

        System.out.println(pattern5.matches("0|(^[1-9]\\d*$)" ));///^[1-9]\d*$/



    }
}
