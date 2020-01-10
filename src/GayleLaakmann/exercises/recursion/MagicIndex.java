package GayleLaakmann.exercises.recursion;

public class MagicIndex {

    int findMagicIndex(int[] arr) {
        return recurse(0, arr.length - 1, arr);
    }

    int recurse(int s, int e, int[] arr) {
        if (s > e) return -1;
        int m = (s + e) / 2;
        int value = arr[m];
        if (value == m) return m;
        if (value > m) {
            if (value < arr.length) {
                if (arr[value] == value) return value;
            }
            return recurse(s,m - 1, arr);
        }
        if (value > 0) {
            if (arr[value] == value) return value;
        }
        return recurse(m + 1,e,arr);
    }

}
