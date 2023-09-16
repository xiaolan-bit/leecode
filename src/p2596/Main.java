package p2596;

public class Main {
    public static void main(String[] args) {

        //int[][] [[0,11,16,5,20],[17,4,19,10,15],[12,1,8,21,6],[3,18,23,14,9],[24,13,2,7,22]]
        //int[][] a = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        //[[8,3,6],[5,0,1],[2,7,4]]
        int[][] a = {{8,3,6},{5,0,1},{2,7,4}};
        //int[][] a = {{0,3,6},{5,8,1},{2,7,4}};
        System.out.println(checkValidGrid(a));
    }

















    public static boolean checkValidGrid(int[][] grid){
        int n = grid.length;
        int allN = n*n-1;

        //四种可能
        int row =0;
        int col =0;
        int start = 0;
        boolean result = true;
        for(int i=0;i<allN;i++){
            int check = 0;
            if(row-1>=0){
                if(col-2>=0){
                    if(grid[row-1][col-2]==start+1){
                        check = 1;
                        row=row-1;
                        col=col-2;
                        start++;
                        continue;
                    }
                }
                if(col+2<n){
                    if(grid[row-1][col+2]==start+1){
                        check = 1;
                        row=row-1;
                        col=col+2;
                        start++;
                        continue;
                    }
                }
            }
            if(row-2>=0){
                if(col-1>=0){
                    if(grid[row-2][col-1]==start+1){
                        check = 1;
                        row=row-2;
                        col=col-1;
                        start++;
                        continue;
                    }
                }
                if(col+1<n){
                    if(grid[row-2][col+1]==start+1){
                        check = 1;
                        row=row-2;
                        col=col+1;
                        start++;
                        continue;
                    }
                }
            }
            if(row+2<n){
                if(col-1>=0){
                    if(grid[row+2][col-1]==start+1){
                        check = 1;
                        row=row+2;
                        col=col-1;
                        start++;
                        continue;
                    }
                }
                if(col+1<n){
                    if(grid[row+2][col+1]==start+1){
                        check = 1;
                        row=row+2;
                        col=col+1;
                        start++;
                        continue;
                    }
                }
            }
            if(row+1<n){
                if(col-2>=0){
                    if(grid[row+1][col-2]==start+1){
                        check = 1;
                        row=row+1;
                        col=col-2;
                        start++;
                        continue;
                    }
                }
                if(col+2<n){
                    if(grid[row+1][col+2]==start+1){
                        check = 1;
                        row=row+1;
                        col=col+2;
                        start++;
                        continue;
                    }
                }
            }

            if(check !=1){
                return false;
            }
        }
        return result;
    }
}