package com.ds.datastructure;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution_Contain_Duplicate dup_contain = new Solution_Contain_Duplicate();
        int [] nums = {1, 2, 5 ,4};
        boolean result =  dup_contain.containsDuplicates(nums);
        System.out.println(result);

    }

}
class Solution_Contain_Duplicate{
    public boolean containsDuplicates(int[] num){
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i< num.length; i++){
            if(uniques.contains(num[i])){
                return true;
            }
            uniques.add(num[i]);
        }
        return false;
    }

}

