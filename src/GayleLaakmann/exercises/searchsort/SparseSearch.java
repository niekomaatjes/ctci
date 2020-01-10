package GayleLaakmann.exercises.searchsort;

import java.util.List;

public class SparseSearch {

    int search(String s, List<String> list) {
        return binarySearch(0, list.size() - 1, s, list);
    }

    private int binarySearch(int s, int e, String str, List<String> list) {
        if (s > e) return -1;
        int m = (s + e) / 2;
        if (list.get(m).isEmpty()) {
            int leftSearch = binarySearch(s, m - 1, str, list);
            if (leftSearch < 0) return binarySearch(m + 1, e, str, list);
            return leftSearch;
        }
        int comparison = list.get(m).compareTo(str);
        if (comparison > 0) {
            return binarySearch(s, m - 1, str, list);
        } else if (comparison < 0) return binarySearch(m + 1, e, str, list);
        return m;
    }

}
