package com.myjava.ocp.lab04;

import java.util.Arrays;

public class ForLoopDemo {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8};
        // for-loop
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        // for-each
        for (int x : nums) {
            System.out.print(x);
        }
        System.out.println();
        // Java 8
        Arrays.stream(nums).forEach(x -> System.out.print(x));
        System.out.println();
        Arrays.stream(nums).forEach(System.out::print);
    }
}
