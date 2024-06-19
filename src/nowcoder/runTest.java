package nowcoder;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Arrays;

/**
 * Created by Ryan on 2019/4/15/0015
 */
public class runTest {

    public static void main(String[] args){

    selectSort();
//    getVideoFiles();
//            int sum =0;
//            for(int i=1;i<=5;i++){
//                sum += i;
//                System.out.println( 11) ;
//            }
//        System.out.println( sum) ;
        }

    private static void getVideoFiles() {

    }


    public static int[] selectSort(){
            // selectSort 选择排序
            int arr[] = new int[]{3, 6, 4, 7, 1, 23,9};
            for (int x=0;x<arr.length-1;x++){
                for (int y=x+1;y<arr.length;y++){
                    if(arr[x] >  arr[y]){    // x>y
                        int temp  = arr[x];
                        arr[x]  =  arr[y];
                        arr[y]   = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr)); //输出排序后的数组
            return arr;
        }
    }

