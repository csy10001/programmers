class Solution {
    public double solution(int[] arr) {
        double results = 0;
        for(int i=0; i<arr.length; i++){
            results += arr[i];
        }
        return results / arr.length;
    }
}