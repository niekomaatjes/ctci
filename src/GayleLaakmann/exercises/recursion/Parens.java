package GayleLaakmann.exercises.recursion;

public class Parens {

    void allParentheses(int n) {
        recurse(n, 0,"");
    }

    private void recurse(int n, int o, String p) {
        if (n == 0 && o == 0) {
            System.out.println(p + "  ");
            return;
        }
        if (n > 0) {
            recurse(n - 1, o + 1, p + "(");
        }
        if (o > 0) {
            recurse(n, o - 1, p + ")");
        }
    }

}
