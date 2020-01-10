package GayleLaakmann.exercises.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermuteUnique {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<Integer> dups = new HashSet<Integer>();
        List<List<Integer>> toReturn = new ArrayList<>();
        if (nums.length == 1) {
            ArrayList<Integer> permutation = new ArrayList<>();
            permutation.add(nums[0]);
            toReturn.add(permutation);
            return toReturn;
        }
        for (int i = 0; i < nums.length; i ++) {
            int current = nums[i];
            if (dups.add(current)) {
                int[] splitArr = split(i, nums);
                List<List<Integer>> subPermutation = permuteUnique(splitArr);
                for (List<Integer> sub : subPermutation) {
                    ArrayList<Integer> currentPerm = new ArrayList<>(nums[i]);
                    currentPerm.addAll(sub);
                    toReturn.add(currentPerm);
                }
            }
        }
        return toReturn;
    }

    private int[] split(int p, int[] arr){
        int[] toReturn = new int[arr.length - 1];
        for (int i = 0; i < p; i ++) {
            toReturn[i] = arr[i];
        }
        for (int i = p; i < arr.length - 1; i++) {
            toReturn[i] = arr[i + 1];
        }
        return toReturn;
    }

}
