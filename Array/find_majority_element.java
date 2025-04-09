public class find_majority_element {
    import java.util.Arrays;


    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}


