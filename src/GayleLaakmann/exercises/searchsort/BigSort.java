package GayleLaakmann.exercises.searchsort;

import java.util.List;

public class BigSort {

    void sort(List<String> list) {
        int last = 0;
        for (; last < list.size() - 1; last++) {
            sort(last, last + 1, list);
        }
    }

    private void sort(int last, int at, List<String> list) {
        String lastValue = list.get(last);
        String currentValue = list.get(at);
        if (currentValue.compareTo(lastValue) < 0) {
            String swap = binaryInsert(0, last, currentValue, list);
            currentValue = swap;
            while (currentValue.compareTo(lastValue) < 0) {
                swap = binaryInsert(0, last, currentValue, list);
                currentValue = swap;
            }
            list.set(at, currentValue);
        }
    }

    private String binaryInsert(int s, int e, String target, List<String> list) {
        if (s == e) {
            String swap = list.get(s);
            list.set(s, target);
            return swap;
        }
        int m = (s + e) / 2;
        String curr = list.get(m);
        if (target.compareTo(curr) > 0) return binaryInsert(m + 1, e, target, list);
        return binaryInsert(s, m, target, list);
    }

}
