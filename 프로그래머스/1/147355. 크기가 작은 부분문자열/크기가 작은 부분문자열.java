public class Solution {
    public int solution(String t, String p) {
        int lenP = p.length();
        int count = 0;

        for (int i = 0; i <= t.length() - lenP; i++) {
            String sub = t.substring(i, i + lenP);
            if (sub.compareTo(p) <= 0) {
                count++;
            }
        }
        return count;
    }
}
