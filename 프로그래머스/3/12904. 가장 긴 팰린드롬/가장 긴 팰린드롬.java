class Solution {
    public int solution(String s) {
        if (s == null || s.length() < 1) return 0;
        
        int maxLength = 1;
        
        for (int i = 0; i < s.length(); i++) {
            // 홀수
            int len1 = expandAroundCenter(s, i, i);
            // 짝수
            int len2 = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            maxLength = Math.max(maxLength, len);
        }
        
        return maxLength;
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() 
               && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}