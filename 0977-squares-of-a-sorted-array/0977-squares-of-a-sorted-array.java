class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int k=0;k<n;k++){
            nums[k]= nums[k]* nums[k];
        }
        int[] res= new int[n];
        int i=0;
        int j=n-1;
        int id=n-1;
        while(i<=j){
            if(nums[i]>= nums[j]){
                res [id]= nums[i];
                i++;
            }else{
                res[id]= nums[j];
                j--;
            }
            id--;
        }
        return res;
    }
}