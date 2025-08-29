class Solution {
    public String solution(int a, int b) {
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};

        int totalDays = 0;
        for(int i=0; i<a-1; i++){
            totalDays += days[i];
        }
        totalDays += b - 1; 

        int dayIndex = (5 + totalDays) % 7;

        return week[dayIndex];
    }
}