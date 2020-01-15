package nieko;

import java.util.HashMap;

public class Sum {

    /**
     * Brute force solution is with indices looping in the array, let's ignore that.
     * One solution would be that for each n we find target - n in logN time. That's O(N *log(N)), even if arr is not sorted, we sort it in O(N *log(N)).
     * The other one is hashing the differences with their indices and checking if n exists where n == diff, return the
     * index associated with the difference and the index of n.
     */
    int[] findSum(int[] elements, int target) {
        for (int i = 0; i < elements.length; i++) {
            int n = elements[i];
            if (n >= target) return new int[]{-1, -1};
            int secondIndex = search(i + 1, elements.length - 1, n, elements, target);
            if (secondIndex > 0) return new int[]{i, secondIndex};
        }
        return new int[]{-1, -1};
    }

    int[] findSumLinear(int[] elements, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            int n = elements[i];
            int diff = target - n;
            int diffIndex = map.getOrDefault(n, -1);
            if (diffIndex >= 0) {
                return new int[]{diffIndex, i};
            }
            map.put(diff,i);
        }
        return new int[]{-1, -1};
    }
    private int search(int s, int e, int element, int[] elements, int target) {
        if (s > e) return -1;
        int m = (s + e) / 2;
        int currentSum = element + elements[m];
        if (currentSum == target) {
            return m;
        } else if (currentSum > target) {
            return search(s, m - 1, element, elements, target);
        }
        return search(m + 1, e, element, elements, target);
    }

}
