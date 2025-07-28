import java.util.*;

class Solution {
    public long solution(long n) {
        
        List<Integer> arrStr = new ArrayList<>();
        
        while (n > 0){
            arrStr.add((int)(n % 10));
            n /= 10;
        }
        arrStr.sort(Collections.reverseOrder());
        
        long result = 0;
        for (int number : arrStr) {
            result = result * 10 + number;
        }
        
        return result;
    }
}