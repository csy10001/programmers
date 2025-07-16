class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        int i;
        for(i=0; i < numbers.length; i++){
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        return average;
    }
}