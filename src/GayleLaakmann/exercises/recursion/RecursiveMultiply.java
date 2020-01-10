package GayleLaakmann.exercises.recursion;

public class RecursiveMultiply {

    int multiply(int a, int b) {
        int outcome = recurse(Math.abs(a), Math.abs(b));
        if (a < 0 && b < 0) return outcome;
        if (a < 0 || b < 0) return -outcome;
        return outcome;
    }

    private int recurse(int a, int b) {
        if (b == 0 || a == 0) return 0;
        return a + multiply(a, b - 1);
    }

}
