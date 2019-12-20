package GoogleTechDev.wordsquare;

public class WordSquare {

    boolean wordSquare(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (!checkWord(i, words)) return false;
        }
        return true;
    }

    private boolean checkWord(int index, String[] words) {
        String word = words[index];
        for (int i = 0; i < words.length; i++) {
            int ch = word.charAt(i);
            if (ch != words[i].charAt(index)) return false;
        }
        return true;
    }

}
