package ctci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by d063995 on 15/03/2017.
 * What is the smallest number n by which the given number x must be divided to make it into a perfect square?
 */
public class PowerSquare {

    public int findNumber(int x){
        List<Integer> factors = new ArrayList<>();
        int n = 0;
        int newnumber = 0;
        for(int i = 1; i <= x; i++){
            if( x % i == 0 ){
                newnumber = x / i;
                if(isSquare(newnumber) == true)
                    return i;
            }
        }
        return -1;
    }

    public static boolean isSquare(int number) {
        int n = number;
        Map<Integer, Integer> factors = new HashMap<Integer, Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if(factors.containsKey(i)){
                    int val = factors.get(i);
                    val++;
                    factors.put(i, val);
                } else{
                    factors.put(i, 1);
                }
                n /= i;
            }
        }
        for(Map.Entry<Integer,Integer> entry: factors.entrySet()){
            if(entry.getValue() % 2 != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PowerSquare ps = new PowerSquare();
        int n = ps.findNumber(30);
        System.out.println(n);
    }

}
