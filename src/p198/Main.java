package p198;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        if(n==0){
            return 0;
        }
        dp[0] = 0;
        dp[1] = nums[0];
        int max = 0;
        for(int k =2;k<=n;k++){
            dp[k] = Math.max(dp[k-1],dp[k-2]+nums[k-1]);
        }



        return dp[n];
    }
}