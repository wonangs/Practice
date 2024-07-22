import java.math.*;

class Solution {
    public String solution(String a, String b) {
        // 10만 자리 수의 덧셈은 BigInteger
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger sum = num1.add(num2);
        
        return sum.toString();
    }
}
