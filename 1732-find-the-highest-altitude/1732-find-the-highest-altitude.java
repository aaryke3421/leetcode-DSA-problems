class Solution {
    public int largestAltitude(int[] gain) {
        int currentheight=0;
        int maxaltitude=0;
        for(int i=0;i<gain.length;i++){
            currentheight=currentheight+gain[i];
            if(currentheight>maxaltitude){
                maxaltitude=currentheight;
            }
        }
        return maxaltitude;
        
    }
}