class Solution {
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        int minDist = Math.abs(x - r) + Math.abs(y - c);

        if (k < minDist || (k - minDist) % 2 == 1) {
            return "impossible";
        }
        
        StringBuilder path = new StringBuilder();
        int curX = x, curY = y;

        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};
        char[] dir = {'d', 'l', 'r', 'u'};
        
        for (int step = 0; step < k; step++) {
            boolean moved = false;

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx < 1 || nx > n || ny < 1 || ny > m) {
                    continue;
                }

                int remainSteps = k - step - 1;
                int remainDist = Math.abs(nx - r) + Math.abs(ny - c);
                
                if (remainSteps >= remainDist && (remainSteps - remainDist) % 2 == 0) {
                    path.append(dir[i]);
                    curX = nx;
                    curY = ny;
                    moved = true;
                    break;
                }
            }
            
            if (!moved) {
                return "impossible";
            }
        }
        
        return path.toString();
    }
}