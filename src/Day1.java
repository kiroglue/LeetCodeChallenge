import java.util.HashSet;
import java.util.Set;

public class Day1 {
    //https://leetcode.com/problems/jewels-and-stones/

    //771. Jewels and Stones
    public static void main(String[] args) {

        System.out.println("numJewelsInStones: " + numJewelsInStones("aA", "aAAbbbb"));
        System.out.println("numJewelsInStones: " + numJewelsInStones("z", "ZZZZZZ"));


        System.out.println("numJewelsInStones2: " + numJewelsInStones2("aA", "aAAbbbb"));
        System.out.println("numJewelsInStones2: " + numJewelsInStones2("z", "ZZZZZZ"));

    }

    public static int numJewelsInStones(String J, String S) {

        if(J == null || J.isEmpty() || S == null || S.isEmpty()){
            return 0;
        }

        int num = 0;
        for(int i = 0; i<S.length(); i++){
            if(J.indexOf(S.charAt(i)) != -1){
                num++;
            }
        }
        return num;
    }



    //to find unique jewels
    public static int numJewelsInStones2(String J, String S) {

        if(J == null || J.isEmpty() || S == null || S.isEmpty()){
            return 0;
        }

        int num = 0;
        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i<S.length(); i++){
            if(J.indexOf(S.charAt(i)) != -1){
                if(!set.contains(S.charAt(i))){
                    set.add(S.charAt(i));
                    num++;
                }

            }
        }//J = ab  S = cdef
        return num;
    }
}


