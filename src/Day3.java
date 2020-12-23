public class Day3 {

    //1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
    //https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
    public static void main(String[] args) {
        System.out.println("minPartitions 32 - 3 " + minPartitions("32"));
        System.out.println("minPartitions 82734 - 8 " + minPartitions("82734"));
    }

    static int minPartitions(String n){
        char ch = '0';
        for(int i = 0; i<n.length(); i++){
            ch = (char) Math.max(ch,n.charAt(i));
        }
        return ch - '0';
    }

}
