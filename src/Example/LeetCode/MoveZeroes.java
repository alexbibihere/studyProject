package Example.LeetCode;

/**
 * @Author yandg
 * @Date 2024/07/05 0005 15:55
 * @Description 移动零，给定一个数组，把所有0 移到数组末尾，同时保持非0元素的相对顺序
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int sums[] ={0,1,0,3,12};
        moveZero(sums);
        System.out.println(sums.toString());
    }

    /**
     * 把给定数组的 所有0 移动到数组末尾,同时保持非0元素的相对顺序
     * @param nums
     * @return
     */
    public static int[] moveZero(int[] nums){
        if(nums ==null){
            return null;
        }
        // 1.选择排序，循环两层遍历比对然后移动元素
//        for(int i = 0; i< nums.length;i++){
//            for (int j =i +1;j< nums.length; j++){
//                if(nums[i] ==0 ||nums[j] ==0){
//                    // 两个数之间有一个为0 ，才会移动元素
//
//                    // 假如 i=0,i给temp，i和j互换
//                    int temp = nums[i];
//                    nums[i] =nums[j];
//                    nums[j] =temp;
//                }
//            }
//        }
        // 一次遍历 ，只判断不为0 就交换两边数字 {0,1,0,3,12};   预期  {1,3,12,0,0}
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j++] = temp;
            }
        }
        return nums;
    }
}
