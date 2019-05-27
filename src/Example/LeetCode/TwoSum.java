package Example.LeetCode;

/**
 * @author: yan
 * @Date: 2019/5/26/0026 19:37
 * @Description:
 */
public class TwoSum {

    public static void main(String[] args) {
//        public int[] twoSum(int[] nums, int target) {
            int[] sum = {2,7,11,5};
            int[] abb = {0,0};
            int target = 9;

            //如果要判断数组中两数之和等于目标值

            for(int i=0;i<sum.length-1;i++){
                for(int j=i+1;j<sum.length;j++){
//                    int Su = ;
                    if(sum[i]+sum[j] ==target){
                        abb[0] =i;
                        abb[1] =j;
                        System.out.println("abb[0]:"+i);
                        System.out.println("abb[1]:"+j);
                    }
                }
            }


        }

    }
