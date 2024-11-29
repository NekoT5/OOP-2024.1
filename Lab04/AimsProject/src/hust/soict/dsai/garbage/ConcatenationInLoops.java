package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    
    public static void main(String[] args) {
        Random r = new Random(123);
        
        // Measuring the time for String concatenation using + operator
        long start = System.currentTimeMillis();
        String S = "";
        for (int i = 0; i < 65536; i++) {
            S += r.nextInt(2); // Appending random integers (0 or 1) as strings
        }
        System.out.println(System.currentTimeMillis() - start); // This prints roughly 4500 ms.
        
        // Measuring the time for StringBuilder concatenation
        r = new Random(123); // Reinitialize the Random object to reset the sequence
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2)); // Appending random integers (0 or 1)
        }
        S = sb.toString();
        System.out.println(System.currentTimeMillis() - start); // This prints 5 ms.
    }
}
