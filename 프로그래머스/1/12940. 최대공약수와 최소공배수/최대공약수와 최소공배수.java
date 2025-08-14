class Solution {
    public int[] solution(int n, int m) {
        int a = 1;
        int b;   

        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                a = i;
            }
        }

        b = (n * m) / a;

        return new int[]{a, b};
    }
}