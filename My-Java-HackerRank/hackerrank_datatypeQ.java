import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class hackerrank_datatypeQ {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        PrintStream p = new PrintStream(System.out);
        StringBuffer sr = new StringBuffer();

        int size = sc.nextInt();
        BigInteger[] arr = new BigInteger[size];

        BigInteger bytemin = BigInteger.valueOf(-128);
        BigInteger bytemax = BigInteger.valueOf(127);
        BigInteger shortmin = BigInteger.valueOf(-32768);
        BigInteger shortmax = BigInteger.valueOf(32767);
        BigInteger intmin = BigInteger.valueOf(-2147483648);
        BigInteger intmax = BigInteger.valueOf(2147483647);
        BigInteger longmin = new BigInteger("-9223372036854775808");
        BigInteger longmax = new BigInteger("9223372036854775807");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextBigInteger();
            BigInteger value = arr[i];

            try {
                if (value.compareTo(longmin) < 0 || value.compareTo(longmax) > 0) {
                    p.println(value + " can't be fitted anywhere.");
                    continue;
                }

                if (value.equals(bytemax) || value.equals(bytemin)
                        || value.equals(shortmax) || value.equals(shortmin)
                        || value.equals(intmax) || value.equals(intmin)) {
                    sr.append(value).append("{-truncated-}");
                    p.println(value + "{-truncated-}");
                }

                if (value.compareTo(bytemin) >= 0 && value.compareTo(bytemax) <= 0) {
                    p.println(value + " can be fitted in:");
                    p.println("* byte");
                    p.println("* short");
                    p.println("* int");
                    p.println("* long");
                } else if (value.compareTo(shortmin) >= 0 && value.compareTo(shortmax) <= 0) {
                    p.println(value + " can be fitted in:");
                    p.println("* short");
                    p.println("* int");
                    p.println("* long");
                } else if (value.compareTo(intmin) >= 0 && value.compareTo(intmax) <= 0) {
                    p.println(value + " can be fitted in:");
                    p.println("* int");
                    p.println("* long");
                } else if (value.compareTo(longmin) >= 0 && value.compareTo(longmax) <= 0) {
                    p.println(value + " can be fitted in:");
                    p.println("* long");
                } else {
                    p.println(value + " can't be fitted anywhere.");
                }

            } catch (Exception e) {
                p.println("The reason of exception is: " + e);
            }
        }
    }
}
