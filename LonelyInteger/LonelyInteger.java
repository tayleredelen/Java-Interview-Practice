package LonelyInteger;

    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class LonelyInteger {

//    class Result {

        /*
         * Complete the 'lonelyinteger' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

    public static int lonelyinteger(List<Integer> a) {
        // Initialize the result variable to store the lonely integer
        int result = 0;

        // Iterate through the list of integers
        for (int i = 0; i < a.size(); i++) {
            // XOR operation to find the lonely integer
            result ^= a.get(i); // XOR operation: result = result ^ a[i]
        }

        // Return the lonely integer
        return result;
    }


}

//    public class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .collect(toList());
//
//            int result = LonelyInteger.lonelyinteger(a);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }


