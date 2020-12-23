import java.util.Arrays;

public class Day4 {


    public static void main(String[] args) {
        int[][] grid = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        maxIncreaseKeepingSkyline(grid);

        int[][] points = new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        maxWidthOfVerticalArea(points);

    }


    //807. Max Increase to Keep City Skyline
    //https://leetcode.com/problems/max-increase-to-keep-city-skyline/
    //Time complexity: 2mn => mn //Space cpmplexity: mn + 2m => mn
    public static void maxIncreaseKeepingSkyline(int[][] grid) {

        int result = 0;

        int[] rMax = new int[4];
        int[] cMax = new int[4];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                rMax[i] = Math.max(grid[i][j], rMax[i]);
                cMax[j] = Math.max(grid[i][j], cMax[j]);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result += Math.min(rMax[i], cMax[j]) - grid[i][j];
            }
        }
        System.out.println("Total max increased value: " + result);
    }


    //1637. Widest Vertical Area Between Two Points Containing No Points
    //https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
    public static void maxWidthOfVerticalArea(int[][] grid) {
        int[] dots = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            dots[i] = grid[i][0];
        }

        Arrays.sort(dots);
        int maxArea = 0;
        for (int i = 0; i < dots.length - 1; i++) {
            if (dots[i + 1] - dots[i] > maxArea) {
                maxArea = dots[i + 1] - dots[i];
            }
        }
        System.out.println("Max area: " + maxArea);
    }

}

