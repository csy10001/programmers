import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hall = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            hall.add(score[i]);
            hall.sort(Collections.reverseOrder());

            if (hall.size() > k) {
                hall = hall.subList(0, k);
            }
            answer[i] = hall.get(hall.size() - 1);
        }
        return answer;
    }
}
