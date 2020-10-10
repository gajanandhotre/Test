package com.company;

import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        int a[] = new int[]{1,1,1,1,2,1,3,3,3,4,4};
        System.out.println(containsDuplicate(a));
        System.out.println("Found Duplicate ") ;
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
                return false;
            } else {
                hashMap.put(nums[i], 1);

            }
        }
        return false;
    }
}
