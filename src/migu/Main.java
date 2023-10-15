package migu;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        String input = scanner.nextLine();

        String longestPalindrome = findLongestPalindrome(input);
        System.out.println("最长的回文字符串是: " + longestPalindrome);
    }

    public static String findLongestPalindrome(String input) {
        int n = input.length();
        if (n < 2) {
            return input;
        }

        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (input.charAt(i) == input.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (length > maxLength) {
                        start = i;
                        maxLength = length;
                    }
                }
            }
        }

        return input.substring(start, start + maxLength);
    }
}
