class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisors = new int[number + 1];
        
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisors[j]++;
            }
        }
        int totalIron = 0;
        for (int i = 1; i <= number; i++) {
            int attack = divisors[i] > limit ? power : divisors[i];
            totalIron += attack;
        }
        return totalIron;
    }
}
