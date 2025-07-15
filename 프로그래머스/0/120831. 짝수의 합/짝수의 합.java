class Solution {
    public int solution(int n) {
        int number = n / 2;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum * 2;
    }
}
