class Solution {
    public int findNumbers(int[] nums) {
        int finalcount=0;
        for(int n: nums){
            String numsText=Integer.toString(n);
            int length=numsText.length();
            if(length % 2==0){
                finalcount++;
            }
        }
        return finalcount;
    }
}