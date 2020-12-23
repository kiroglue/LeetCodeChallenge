public class Day4 {

    //807. Max Increase to Keep City Skyline
    //https://leetcode.com/problems/max-increase-to-keep-city-skyline/
    public static void main(String[] args) {
        int [][] grid = new int [][] {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int result = 0;

        int [] rMax =  new int[4];
        int [] cMax =  new int[4];

        for (int i = 0 ; i<grid.length; i++){
            for (int j = 0 ; j < grid[0].length; j++){
                rMax[i] = Math.max(grid[i][j],rMax[i]);
                cMax[j] = Math.max(grid[i][j],cMax[j]);
            }
        }

        for (int i = 0 ; i<grid.length; i++){
            for (int j = 0 ; j < grid[0].length; j++){
                result +=  Math.min(rMax[i],cMax[j]) - grid[i][j];
            }
        }

        System.out.println("Total max increased value " + result );

    }
}

//Time complexity: 2mn => mn
//Space cpmplexity: mn + 2m => mn
