package Example;

/**
 * @author: yan
 * @Date: 2017/12/21/0021 22:37
 * @Description:
 */
public class demo {
    //选择排序
    public static void main(String args[]) {

        int arr[] = {1, 12, 23, 123, 12, 3, 12, 31, 23, 1, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        for (int num : arr) {
            System.out.println(num + "");
        }
    }

//    private static int getValue(int i){
//        int result =0;
//        switch (i){
//            case 1:
//                result = result+i;
//            case 2:
//                result = result+i*2;
//            case 3:
//                result= result +i*3;
//        }
//        System.out.println(result);
//        return result;
//    }
}


