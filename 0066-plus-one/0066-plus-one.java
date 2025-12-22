import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb= new StringBuilder();
        for (int d: digits){
            sb.append(d);
        }
        BigInteger number= new BigInteger(sb.toString());
        number= number.add(BigInteger.ONE);
        String s= number.toString();
        int[] result= new int [s.length()];
        for( int i=0; i<s.length();i++){
            result[i]= Character.getNumericValue(s.charAt(i));
        }
        return result;
    }
}