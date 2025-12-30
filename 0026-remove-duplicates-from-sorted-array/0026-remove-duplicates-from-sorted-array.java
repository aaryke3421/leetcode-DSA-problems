class Solution {
    public int removeDuplicates(int[] nums) {
        // Agar array khali hai toh length 0 return karein
        if (nums.length == 0) {
            return 0;
        }

        int i = 0; // Pehla element hamesha unique hota hai
        
        for (int j = 1; j < nums.length; j++) {
            // Agar current element pichle unique element se alag hai
            if (nums[j] != nums[i]) {
                i++;           // Unique spot ko aage badhao
                nums[i] = nums[j]; // Naya unique element wahan rakh do
            }
        }
        
        // i index hai, length return karne ke liye +1 karein
        return i + 1;
    }
}