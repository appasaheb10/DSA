package arrays;

/*Sequential Digits
An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
*/


import java.util.ArrayList;
import java.util.List;

class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        String str = "123456789";
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; i + j <= 9; j++) {
                String tmp = str.substring(j, i + j);
                int val = Integer.valueOf(tmp);
                if (val >= low && val <= high) {
                    list.add(val);
                }
            }
        }
        return list;
    }
}
