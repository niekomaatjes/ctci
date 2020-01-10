package GayleLaakmann.exercises.searchsort;

import java.util.List;

public class Listy {

    int find(int n, List<Integer> arr) {
        int start = 1;
        int end = 1;
        while (end < arr.size()) {
            start = end;
            end = end * 2;
        }
        int size = findSize(start, end, arr);
        return binarySearch(0, size - 1, n, arr);
    }

    private int findSize(int start, int end, List<Integer> arr) {
        int m = (start + end) / 2;
        if (m > arr.size()) return findSize(start, m - 1, arr);
        if (m + 1 > arr.size()) return m;
        return findSize(m + 1, end, arr);
    }

    int binarySearch(int s, int e, int target, List<Integer> arr) {
        if (s > e) return -1;
        int m = (s + e) / 2;
        /*Translated from attempting to access elementAt(i) for i > size, so we don't have to rely on arr internal method and have to try/catch.*/
        int value = arr.get(m);
        if (value == target) return m;
        if (value > target) {
            return binarySearch(s, m - 1, target, arr);
        }
        return binarySearch(m + 1, e, target, arr);
    }

}
