class Solution {
public:
    vector<int> grayCode(int n) {
        // Step 1: Create an empty vector to store results
        vector<int> result;
        
        // Step 2: Calculate total numbers needed: 2 raised to power n
        // Using left shift: 1 << n = 2ⁿ
        int total = 1 << n;
        
        // Step 3: Generate Gray codes for all numbers from 0 to total-1
        for (int i = 0; i < total; i++) {
            // Step 4: Apply Gray code formula
            // i >> 1 shifts bits right by 1 (equivalent to i/2)
            // i ^ (i >> 1) XORs i with its right-shifted version
            int gray = i ^ (i >> 1);
            
            // Step 5: Add to result vector
            result.push_back(gray);
        }
        
        // Step 6: Return the complete Gray code sequence
        return result;
    }
};