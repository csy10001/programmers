class Solution {
    public int solution(int[] a, int[] b) {
        int num = a.length;
        int answer = 0;
        for(int i = 0; i < num; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}