package classFibbonacciPrima;

import java.util.ArrayList;
import java.util.List;

public class Prima {
    public static List<Integer> generatePrimes(long limit) {
        List<Integer> primes = new ArrayList<>();
        
        for (int number = 2; number < limit; number++) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        
        return primes;
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        if (number <= 3) {
            return true;
        }
        
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}
