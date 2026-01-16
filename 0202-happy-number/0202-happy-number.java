import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        // Ek Diary (HashSet) banayi numbers yaad rakhne ke liye
        HashSet<Integer> diary = new HashSet<>();

        // Jab tak n 1 nahi ho jata aur hum purane numbers repeat nahi karte
        while (n != 1 && !diary.contains(n)) {
            // Is number ko diary mein likh lo
            diary.add(n);
            
            // Agla number nikal lo (digits ke square ka sum)
            n = getNext(n);
        }

        // Agar n 1 par khatam hua toh true, warna false
        return n == 1;
    }

    // Yeh function bas digits ka square karke jodta hai
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n = n / 10;
        }
        return sum;
    }
}