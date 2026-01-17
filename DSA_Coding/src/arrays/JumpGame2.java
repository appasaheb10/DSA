package arrays;

/*This is the “Jump Game II” problem: find the minimum number of jumps needed to reach the last index.*/

class JumpGame2 {
    public static int jump(int[] nums) {
        if (nums.length <= 1) return 0;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // cannot move forward
            if (i > farthest) {
                return -1; // unreachable
            }

            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return (farthest >= nums.length - 1) ? jumps : -1;
    }

    public static void main(String[] args) {
        System.out.println( jump(new int[] {3, 2, 1, 4, 5}));
    }

}

/* 3 2 1 4 5 */