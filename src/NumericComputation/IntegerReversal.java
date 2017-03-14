package NumericComputation;

/**
 * Created by d063995 on 12/03/2017.
 */
public class IntegerReversal {
    public static int reverse(int x) {
        int xnew = (x > 0) ? x : -x;
        String in = Integer.toString(xnew);
        int len = in.length();
        long input = 0;
        for(int  i = len - 1; i >= 0; i--){
            char num = in.charAt(len - 1 - i);
            int curr = Character.getNumericValue(num);
            input  = input + (long) Math.pow(10, len - 1 - i) * curr;
            if(input > (Math.pow(2, 31) - 1) && x > 0){
                input = 0;
                break;
            } else if(input > (Math.pow(2, 31) ) && x < 0){
                input = 0;
                break;
            }
        }
        if(x < 0)
            input = -input;

        return (int)input;
    }

    public static void main(String[] args) {
        int test = IntegerReversal.reverse(-123);
        System.out.println(test);
    }
}
