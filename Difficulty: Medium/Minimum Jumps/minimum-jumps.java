class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;

        if (n <= 1)
            return 0;
        if (arr[0] == 0)
            return -1;

        int maxjump = arr[0];
        int count = 1;
        int steps = arr[0];

        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return count;

            maxjump = Math.max(maxjump, i + arr[i]);
            steps--;

            if (steps == 0) {
                count++;
                if (i >= maxjump)
                    return -1;
                steps = maxjump - i;
            }
        }
        return -1;
    }
}
