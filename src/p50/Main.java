package p50;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //gem = [3,1,2], operations = [[0,2],[2,1],[2,0]]
        int[] gem = {0,2,5,4};
        //operations = [[3,2],[3,2],[1,3],[0,2],[3,0],[3,1],[0,3],[2,1],[3,0]]
        int[][] operations = {{3,2},{3,2},{1,3},{0,2},{3,0},{3,1},{0,3},{2,1},{3,0}};
        //int[][] operations = {{1,2},{3,1},{1,2}};
        System.out.println(giveGem(gem,operations));

    }

    public static int giveGem(int[] gem, int[][] operations) {
        int n = gem.length;
        int op = operations.length;
        System.out.println(n);
        for(int i=0;i<op;i++){
            int a = operations[i][0];
            int b = operations[i][1];

            int give = gem[a]/2;
            gem[a] = gem[a] -give;
            gem[b] += give;
        }

        //Arrays.stream(gem).sorted();
        //sort gem
        Arrays.sort(gem);
//        System.out.println(gem[0]-gem[n-1]);
        return gem[0]-gem[n-1];
    }
}