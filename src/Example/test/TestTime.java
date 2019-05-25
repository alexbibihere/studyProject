package Example.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: yan
 * @Date: 2018/6/16/0016 9:30
 * @Description:
 */
public class TestTime {


    /**
     * 把long转成date 用calendar计算再换成string
     * @param args
     */
    public static void main(String args[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long longTime = new Date().getTime();
        System.out.println("long为：" + longTime);
        System.out.println("Long转换成日期:");
        System.out.println("longToDate：" + new SimpleDateFormat("yyyy-MM-dd ").format(new Date(longTime)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(longTime));
        calendar.add(Calendar.DAY_OF_MONTH, +75);
        System.out.println("75天后：" + sdf.format(calendar.getTime().getTime()));
    }
}