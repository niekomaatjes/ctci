package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.createLinkedList;

class PalindromeTest {

    @Test
    void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        final Node list1 = createLinkedList(1, 2, 2, 3, 2, 2, 1);
        Assert.assertTrue(palindrome.isPalindrome(list1));
        final Node list2 = createLinkedList(1, 2, 2, 1, 2, 2, 3);
        Assert.assertFalse(palindrome.isPalindrome(list2));
        final Node list3 = createLinkedList(3, 2, 2, 1, 2, 2, 1);
        Assert.assertFalse(palindrome.isPalindrome(list3));
        final Node list4 = createLinkedList(1, 2, 2, 2, 2, 1);
        Assert.assertTrue(palindrome.isPalindrome(list4));
        final Node list5 = createLinkedList(2, 2, 2, 2, 2, 1);
        Assert.assertFalse(palindrome.isPalindrome(list5));
        final Node list6 = createLinkedList(2, 2);
        Assert.assertTrue(palindrome.isPalindrome(list6));
        final Node list7 = createLinkedList(1, 2);
        Assert.assertFalse(palindrome.isPalindrome(list7));
    }
}