package GoogleTechDev.wordsquare;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class WordSquareTest {

    @Test
    public void testWordSquare_Success() {
        WordSquare wordSquare = new WordSquare();
        Assert.assertTrue(wordSquare.wordSquare(new String[]{"BALL","AREA","LEAD","LADY"}));
    }

    @Test
    public void testWordSquare_Fail() {
        WordSquare wordSquare = new WordSquare();
        Assert.assertFalse(wordSquare.wordSquare(new String[]{"BALL","ARzA","LEAD","LADY"}));
    }

}