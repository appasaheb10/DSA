package arrays;


import java.util.Arrays;

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



