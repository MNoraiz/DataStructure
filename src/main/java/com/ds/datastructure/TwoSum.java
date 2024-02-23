package com.ds.datastructure;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Solution_Two_sum sl = new Solution_Two_sum();
        int [] number = {3,2,4};
        int [] final_result = sl.twoSum(number,6);
        for (int j = 0; j < final_result.length; j++){
            System.out.println(final_result[j]);
        }


    }
}
class Solution_Two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pervMap = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int val_num = nums[i];
            int diff = target - nums[i];
            if (pervMap.containsKey(diff)){
                return new int[]{pervMap.get(diff), i};
            }
            pervMap.put(val_num,i);
        }
        return new int[]{};

    }
}
