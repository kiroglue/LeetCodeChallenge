public class Day5 {

//1395. Count Number of Teams
//https://leetcode.com/problems/count-number-of-teams/
    public static void main(String[] args) {
        int[] rating = {2, 5, 3, 4, 1};
        int[] rating2 = {2, 1, 3};
        System.out.println("numTeams {2, 5, 3, 4, 1}: " + numTeams(rating));
        System.out.println("numTeams {2, 1, 3}: " + numTeams(rating2));

        System.out.println("numTeams {2, 5, 3, 4, 1}: " + numTeams2(rating));
        System.out.println("numTeams {2, 1, 3}: " + numTeams2(rating2));
    }

    //Time complexity O(n^3)
    //Space complexity O(n)
    private static int numTeams(int[] rating) {
        int count = 0;
        for (int i = 0; i < rating.length - 2; i++) {
            for (int j = i + 1; j < rating.length - 1; j++) {
                for (int k = j + 1; k < rating.length; k++) {
                    if ((rating[i] < rating[j] && rating[j] < rating[k]) || (rating[i] > rating[j] && rating[j] > rating[k])) {
                        System.out.println(i + " " + j + " " + k);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //Time complexity O(n(mk)) = O(n2)
    //Space complexity O(n)
    private static int numTeams2(int[] rating) {


        int count = 0;
        //i for middle number
        for (int i = 1; i < rating.length - 1; i++) {

            int leftSmallers = 0;
            int rigthBiggers = 0;

            int leftBiggers = 0;
            int rigthSmallers = 0;

            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    leftSmallers++;
                } else {
                    leftBiggers++;
                }
            }

            for (int k = i + 1; k < rating.length; k++) {
                if (rating[k] < rating[i]) {
                    rigthSmallers++;
                } else {
                    rigthBiggers++;
                }
            }
            count += leftSmallers * rigthBiggers + leftBiggers * rigthSmallers;
        }
        return count;
    }
}
