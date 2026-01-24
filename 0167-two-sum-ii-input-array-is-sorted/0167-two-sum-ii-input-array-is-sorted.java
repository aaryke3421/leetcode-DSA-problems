import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Function call
        int[] result = sol.twoSum(nums, target);
        
        // Output print karna
        System.out.println(Arrays.toString(result)); 
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Indices + 1 return karna hai
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++; // Sum chota hai toh left badhao
            } else {
                right--; // Sum bada hai toh right ghatao
            }
        }
        return new int[]{}; 
    }
}