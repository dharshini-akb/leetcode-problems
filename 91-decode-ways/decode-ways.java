class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(s, 0, dp);
    }

    int helper(String s, int i, int[] dp) {
        if (i == s.length())
            return 1;

        if (s.charAt(i) == '0')
            return 0;

        if (dp[i] != -1)
            return dp[i];

        // Take single digit
        int ways = helper(s, i + 1, dp);

        // Take two digits if valid
        if (i + 1 < s.length()) {
            int twoDigit = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
            if (twoDigit >= 10 && twoDigit <= 26) {
                ways += helper(s, i + 2, dp);
            }
        }

        return dp[i] = ways;
    }
}