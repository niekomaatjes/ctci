package GayleLaakmann.exercises.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParensTest {

    @Test
    void allParentheses() {
        Parens parens = new Parens();
        parens.allParentheses(3);
        System.out.println("****");
        parens.allParentheses(2);
        System.out.println("****");
        parens.allParentheses(1);
        System.out.println("****");
    }
}