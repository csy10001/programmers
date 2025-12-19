import java.util.*;
class Solution {
    public int solution(int N, int number) {
        if (N == number) {
            return 1;
        }

        List<Set<Integer>> dp = new ArrayList<>();

        dp.add(new HashSet<>());

        for (int i = 1; i <= 8; i++) {
            Set<Integer> currentSet = new HashSet<>();

            int repeatedN = getRepeatedNumber(N, i);
            currentSet.add(repeatedN);

            for (int j = 1; j < i; j++) {
                Set<Integer> set1 = dp.get(j);
                Set<Integer> set2 = dp.get(i - j);

                for (int num1 : set1) {
                    for (int num2 : set2) {
                        currentSet.add(num1 + num2);

                        currentSet.add(num1 - num2);

                        currentSet.add(num1 * num2);

                        if (num2 != 0) {
                            currentSet.add(num1 / num2);
                        }
                    }
                }
            }
            
            if (currentSet.contains(number)) {
                return i;
            }
            
            dp.add(currentSet);
        }
        
        return -1;
    }
    
    private int getRepeatedNumber(int N, int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result = result * 10 + N;
        }
        return result;
    }
}