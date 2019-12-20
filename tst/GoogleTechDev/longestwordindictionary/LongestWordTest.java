package GoogleTechDev.longestwordindictionary;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordTest {

    LongestWord longestWord;

    @Test
    void longestWord() {
        longestWord = new LongestWord();
        long startTime = System.nanoTime();
        Assert.assertEquals("apple", longestWord.longestWord(new LinkedList<>(Arrays.asList("xyUOQQe","PwpmIcB","naxCL8B","XP1mJ0X","eUFxGlw","DdVEZa2","BPCYgXi","w1MJDZj","able", "ale", "apple", "bale", "kangaroo", "m9GgBdE", "ma4rK2M")),"abppplee"));
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    void longestWord_EmptyList_Success() {
        longestWord = new LongestWord();
        Assert.assertEquals("", longestWord.longestWord(new LinkedList<>(),"abppplee"));
    }

    @Test
    void longestWordBS() {
        longestWord = new LongestWord();
        long startTime = System.nanoTime();
        Assert.assertEquals("apple", longestWord.longestWordBS(new LinkedList<>(Arrays.asList("xyUOQQe","PwpmIcB","naxCL8B","XP1mJ0X","eUFxGlw","DdVEZa2","BPCYgXi","w1MJDZj","able", "ale", "apple", "bale", "kangaroo", "m9GgBdE", "ma4rK2M")),"abppplee"));
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    void longestWordBS_EmptyList_Success() {
        longestWord = new LongestWord();
        Assert.assertEquals("", longestWord.longestWordBS(new LinkedList<>(),"abppplee"));
    }
}