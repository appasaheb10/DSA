package arrays;

import java.util.HashMap;

class SumOfLargestSubArrayZero
{
    int maxLen(int arr[], int n)
    {
        int sum = 0, len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                len = i + 1;
            }
            else if (map.containsKey(sum)) {
                len = Math.max(len, i - map.get(sum));
            }
            else {
                map.put(sum, i);
            }
        }
        return len;
    }
}
// TC: O(n), SC: O(n)
