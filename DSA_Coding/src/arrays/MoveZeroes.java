package arrays;


import java.util.Arrays;


/*283. Move Zeroes

Given an integer array nums, move all 0’s to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1

Input:
nums = [0,1,0,3,12]

Output:
[1,3,12,0,0]

Example 2

Input:
nums = [0]

Output:
[0]*/

class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }

        // from index: left to nums.length-1, fill with 0's
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }

    }


    public static void main(String[] args) {
        MoveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}



