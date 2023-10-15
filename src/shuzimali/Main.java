package shuzimali;

import java.util.ArrayList;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int[] tw = {225, 235, 245, 255};
        int[] ta = {40, 45, 50, 55, 60};
        int[] tr = {15, 16, 17, 18, 19};
        String query = "马牌22555r16 马牌22555r17";

        ArrayList<String> result = fetchTireSize(tw, ta, tr, query);
        System.out.println(result);
    }


//    public static ArrayList<String> fetchTireSize(int[] tw, int[] ta, int[] tr, String query) {
//        ArrayList<String> result = new ArrayList<>();
//        String regex = "(\\d{3})\\D?(\\d{2})[^a-zA-Z0-9]?[Rr]?(\\d{2})";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(query);
//        while (matcher.find()) {
//            int width = Integer.parseInt(matcher.group(1));
//            int aspectRatio = Integer.parseInt(matcher.group(2));
//            int diameter = Integer.parseInt(matcher.group(3));
//            if (Arrays.binarySearch(tw, width) >= 0 && Arrays.binarySearch(ta, aspectRatio) >= 0 && Arrays.binarySearch(tr, diameter) >= 0) {
//                result.add(width + "/" + aspectRatio + "R" + diameter);
//            }
//        }
//        return result.isEmpty() ? null : result;
//    }
    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        // 初始化第一行和第一列
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // 计算其余位置的最小路径和
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[m - 1][n - 1];
    }


    public static ArrayList<String> fetchTireSize(int[] tw, int[] ta, int[] tr, String query) {
        ArrayList<String> result = new ArrayList<>();
        Arrays.sort(tw);
        Arrays.sort(ta);
        Arrays.sort(tr);
        String regex = "(\\d{3})\\D?(\\d{2})[^a-zA-Z0-9]?[Rr]?(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(query);
        while (matcher.find()) {
            int width = Integer.parseInt(matcher.group(1));
            int aspectRatio = Integer.parseInt(matcher.group(2));
            int diameter = Integer.parseInt(matcher.group(3));
            if (Arrays.binarySearch(tw, width) >= 0 && Arrays.binarySearch(ta, aspectRatio) >= 0 && Arrays.binarySearch(tr, diameter) >= 0) {
                result.add(width + "/" + aspectRatio + "R" + diameter);
            }
        }
        return result.isEmpty() ? null : result;
    }

}