package nieko;

/**
 * 2. Write the following function:
 *    void parentheses(int n);
 *    which prints correctly nested parentheses n levels deep:
 *    1: ()
 *    2: ()(), (())
 *    3: ((())), (()()), ()(()), ()()(), (())()
 *
 *    Let's think about what this means, and divide the problem into the most simplest parts.
 *    It seems to me that at any point inside the iteration one can either open a parenthesis or close one.
 *    Except the first parenthesis, that's always open.
 *    After the first one, then with that configuration we start creating our combinations, if we can open one, we do that,
 *    if we can close one, we do that, in between we recurse with the new configuration of having opened one, when we can't
 *    open or close anymore parenthesis, we print that.
 *    We have to keep track of number of parenthesis I can open, that's gonna be n, and o is the number of parenthesis
 *    currently open ( to be closed ).
 *    Base case then is when n == 0 and o == 0.
 */

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
