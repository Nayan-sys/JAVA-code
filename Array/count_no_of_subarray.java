
import java.util.HashMap;
import java.util.Map;
public class count_no_of_subarray {

    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0;
        long pairs = 0;
        long res = 0;

        for (int right = 0; right < nums.length; right++) {
            int curr = nums[right];
            int freq = count.getOrDefault(curr, 0);
            pairs += freq;
            count.put(curr, freq + 1);

            while (pairs >= k) {
                res += nums.length - right;

                int leftNum = nums[left];
                int leftFreq = count.get(leftNum);
                count.put(leftNum, leftFreq - 1);
                pairs -= (leftFreq - 1);
                left++;
            }
        }

        return res;
    }
}


