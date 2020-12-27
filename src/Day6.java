
//74. Search a 2D Matrix
//https://leetcode.com/problems/search-a-2d-matrix/
public class Day6 {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println("Search 16 should be true " + searchMatrix(matrix, 16));
        System.out.println("Search 17 should be false " + searchMatrix(matrix, 17));
        System.out.println("Search 60 should be true " + searchMatrix(matrix, 60));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int s = 0;
        int e = rows * columns - 1;


        while (s <= e) {
            int m = s + (e - s) / 2;
            int m2DValue = matrix[m / rows - 1][m % columns];
            if (m2DValue == target) {
                return true;
            } else if (m2DValue > target) {
                e = m - 1;
            } else if (m2DValue < target) {
                s = m + 1;
            }
        }
        return false;
    }

}



