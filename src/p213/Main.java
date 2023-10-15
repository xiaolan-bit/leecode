package p213;

public class Main {
    public static void main(String[] args) {

        int[] rooms = {1,2,3};
        System.out.println(rob(rooms));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];
        int[] dp2 = new int[n+1];
        dp2[0] = 0;
        dp2[1] = nums[1];
        for(int k=2;k<n;k++){
            dp[k] = Math.max(dp[k-1],dp[k-2]+nums[k-1]);
        }
        for(int k=2;k<n;k++){
            dp2[k] = Math.max(dp2[k-1],dp2[k-2]+nums[k]);
        }
        return Math.max(dp[n-1],dp2[n]);
    }
}