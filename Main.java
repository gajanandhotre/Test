package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int a[] = new int[]{1,1,1,1,2,1};
        System.out.println(containsDuplicate(a));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
                return true;
            } else {
                hashMap.put(nums[i], 1);

            }
        }
        return false;
    }
}
