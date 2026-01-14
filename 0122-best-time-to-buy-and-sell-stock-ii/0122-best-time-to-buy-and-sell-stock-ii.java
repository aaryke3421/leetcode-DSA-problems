class Solution {
    public int maxProfit(int[] prices) {
        // Step 1: Ek variable banate hain total profit store karne ke liye
        int totalProfit = 0;

        // Step 2: Loop start karenge index 1 se (kyunki 0th day ka comparison pichle din se nahi ho sakta)
        for (int i = 1; i < prices.length; i++) {
            
            // Step 3: Check karo kya aaj ka price (prices[i]) kal ke price (prices[i-1]) se zyada hai?
            if (prices[i] > prices[i - 1]) {
                
                // Step 4: Agar price badha hai, toh difference ko profit mein add kar lo
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        // Step 5: Last mein total calculated profit return kar do
        return totalProfit;
    }
}