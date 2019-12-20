package main.Exercises;

import com.sun.xml.internal.stream.buffer.stax.StreamWriterBufferCreator;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Candies {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] c = new int[n];
        Arrays.fill(c, 1);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if (c[i - 1] <= c[i]) {
                    c[i - 1] = c[i] + 1;
                }
            }
            if (arr[i] > arr[i - 1]) {
                c[i] = c[i - 1] + 1;
            }
        }
        return Arrays.stream(c).sum();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
