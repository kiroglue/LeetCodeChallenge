public class Day2 {

    //1342. Number of Steps to Reduce a Number to Zero
    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    public static void main(String[] args) {

        System.out.println("numberOfSteps 14 "+ numberOfSteps(14));
        System.out.println("numberOfSteps 8 "+ numberOfSteps(8));

        System.out.println("numberOfStepsRecursive 14 "+ numberOfStepsRecursive(14));
        System.out.println("numberOfStepsRecursive 8 "+ numberOfStepsRecursive(8));

        System.out.println("numberOfStepsBitmap 14 "+ numberOfStepsBitmap(14));
        System.out.println("numberOfStepsBitmap 8 "+ numberOfStepsBitmap(8));

    }

    static int numberOfSteps(int num){

        if(num<=0){
            return 0;
        }

        int n = 0;

        while (num > 0){
            if(num % 2 == 0){
                num = num/2;
            }else{
                num--;
            }
            n++;
        }
        return n;
    }

    static int numberOfStepsRecursive(int num){

        if(num<=1){
            return 1;
        }else if(num % 2 == 0){
            return numberOfSteps(num/2) + 1;
        }else{
            return numberOfSteps(num - 1) + 1;
        }
    }

    static int numberOfStepsBitmap (int num) {
        if (num == 0) return 0;
        int result = 0;

        while (num != 0) {
            result += ((num & 1) == 0 ? 1 : 2);
            num >>= 1;
        }
        return result - 1;
    }
}
