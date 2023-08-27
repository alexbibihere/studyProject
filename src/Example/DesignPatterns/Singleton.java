package Example.DesignPatterns;

/**
 * @author: yan
 * @Date: 2019/5/25/0025 15:40
 * @Description:单例模式
 */
public class Singleton {

//    //私有的静态变量
//    private static final Singleton INSTANCE = new Singleton();
//
//    //构造器私有化
//    private Singleton(){
//
//    }

    private static  Singleton instance = null;

    public static synchronized  Singleton getInstance(){
        if (instance ==null ) {
            instance  = new Singleton() ;
        }

            return instance;
    }


}
