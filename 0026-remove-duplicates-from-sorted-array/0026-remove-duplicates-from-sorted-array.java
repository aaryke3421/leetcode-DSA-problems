class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int officer=1;
        int unique=1;
        int cm=1;
        while(cm<nums.length){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            nums[officer]=nums[cm];
            officer++;
            cm++;
            unique++;
        }
        return unique;
        
    }
}