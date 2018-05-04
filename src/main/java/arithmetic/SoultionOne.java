package arithmetic;

import java.util.HashMap;
import java.util.Map;

/**
 * 算法
 *  给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

    你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * @author zhangjiayu zhangjiayu
 * @create 2018/5/3
 */
public class SoultionOne {

    /**
     * 我的版本（优化版） 傻傻的双层遍历 29ms
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 高阶优化版本 6-7ms
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumBetter(int[] nums, int target){

        Map<Integer, Integer> utilMap = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++){
            if (utilMap.containsKey(nums[i])){
                return new int[]{utilMap.get(nums[i]), i};
            }
            utilMap.put(target - nums[i], i);
        }
        return null;

    }

    public static void main(String[] args) {

        int[] res = twoSumBetter(new int[]{3,2,4}, 6);
        System.out.println(res[0] + ":" + res[1]);
    }
}
