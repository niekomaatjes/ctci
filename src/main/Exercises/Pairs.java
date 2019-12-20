package main.Exercises;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pairs {
    static int pairs(int k, int[] arr) {
        final List<Integer> incrementedArr = Arrays.stream(arr).boxed().map(integer -> integer + k).collect(Collectors.toList());
        final HashMap<Integer, Integer> occurrencesArr = new HashMap<>();
        final HashMap<Integer, Integer> occurrencesIncrementedArr = new HashMap<>();
        for (int integer : arr) {
            if (!occurrencesArr.containsKey(integer)) {
                occurrencesArr.put(integer, 0);
            }
            final Integer newOccurrence = occurrencesArr.get(integer) + 1;
            occurrencesArr.put(integer, newOccurrence);
        }
        for (Integer integer : incrementedArr) {
            if (occurrencesArr.containsKey(integer)) {
                if (!occurrencesIncrementedArr.containsKey(integer)) {
                    occurrencesIncrementedArr.put(integer, 0);
                }
                final Integer newOccurrence = occurrencesIncrementedArr.get(integer) + 1;
                occurrencesIncrementedArr.put(integer, newOccurrence);
            }
        }
        int pairs = 0;
        for (Integer key : occurrencesIncrementedArr.keySet()) {
            final Integer value1 = occurrencesIncrementedArr.get(key);
            final Integer value2 = occurrencesArr.get(key);
            pairs += value1 * value2;
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
