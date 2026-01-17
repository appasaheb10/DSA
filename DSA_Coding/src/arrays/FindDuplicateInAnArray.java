package arrays;


import java.util.ArrayList;
import java.util.List;

/*
Find All Duplicates in an Array

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appear twice.
*/


class FindDuplicateInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                list.add(index + 1);
            }

            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }

        return list;
    }
}
// TC: O(n), SC: O(1)

