package classFibbonacciPrima;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> generateFibonacci(long n) {
        List<Integer> fibonacci = new ArrayList<>();
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            fibonacci.add(first);
            
            int next = first + second;
            first = second;
            second = next;
        }
        return fibonacci;
    }

}
