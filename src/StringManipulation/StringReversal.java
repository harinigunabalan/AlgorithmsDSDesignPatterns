package StringManipulation;

/**
 * Created by d063995 on 12/03/2017.
 */
public class StringReversal {
    public static String reverse(String in){
        int len = in.length();
        char[] input = in.toCharArray();
        for(int i = 0; i < len/2; i++){
            char temp = input[i];
            input[i] = input[len - 1 - i];
            input[len - 1 - i] = temp;
        }

        return String.valueOf(input);
    }

    public static void main(String[] args) {
       String test = StringReversal.reverse("HEllo world1");
        System.out.println(test);
    }

}
