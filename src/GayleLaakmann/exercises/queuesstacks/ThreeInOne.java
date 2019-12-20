package GayleLaakmann.exercises.queuesstacks;

import java.util.NoSuchElementException;

public class ThreeInOne {

    private int stackSize = 10;
    private int[][] arr = new int[3][10];
    private int[] indexes = new int[]{-1, -1, -1};

    public void push(int pos, int val) {
        if (pos >= 3 || pos < 0) throw new IllegalArgumentException();
        if (indexes[pos] >= stackSize - 1) throw new StackOverflowError();
        int stackIndex = indexes[pos] + 1;
        indexes[pos] = stackIndex;
        arr[pos][stackIndex] = val;
    }

    public int pop(int pos) {
        int toReturn = peek(pos);
        indexes[pos] = indexes[pos] - 1;
        return toReturn;
    }

    public int peek(int pos) {
        if (pos >= 3 || pos < 0) throw new IllegalArgumentException();
        if (indexes[pos] < 0) throw new NoSuchElementException();
        int stackIndex = indexes[pos];
        return arr[pos][stackIndex];
    }

    public boolean isEmpty(int pos) {
        if (pos >= 3 || pos < 0) throw new IllegalArgumentException();
        return indexes[pos] < 0;
    }

}
