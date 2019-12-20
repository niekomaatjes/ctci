package GoogleTechDev.longestwordindictionary;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LongestWord {

    public String longestWord(List<String> dictionary, String s) {
        String longestWord = "";
        for (String word : dictionary) {
            if (word.length() < longestWord.length() || word.length() > s.length()) continue;
            int wI = 0;
            int sI = 0;
            while (wI < word.length() && sI < s.length()) {
                if (word.charAt(wI) == s.charAt(sI)) {
                    wI++;
                }
                sI++;
            }
            if (wI >= word.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public String longestWordBS(List<String> dictionary, String s) {
        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            final List<Integer> occ = map.getOrDefault(s.charAt(i), new LinkedList<>());
            occ.add(i);
            if (!occ.contains(s.charAt(i))) map.put(s.charAt(i),occ);
        }
        String longestWord = "";
        for (String word : dictionary) {
            int wordIndex = 0;
            int stringIndex = -1;
            char c = word.charAt(wordIndex);
            if (map.containsKey(c)) {
                boolean stringEnd = false;
                while (!stringEnd) {
                    c = word.charAt(wordIndex);
                    final List<Integer> occ = map.getOrDefault(c, null);
                    if (occ == null) break;
                    if (occ.get(0) > stringIndex) {
                        stringIndex = occ.get(0);
                    } else {
                        final int foundIndex = Collections.binarySearch(occ, wordIndex);
                        if (foundIndex < 0) break;
                        if (foundIndex == occ.size() - 1) break;
                        if (occ.get(foundIndex) == stringIndex) stringIndex = foundIndex + 1;
                        else stringIndex = foundIndex;
                    }
                    wordIndex++;
                    if (wordIndex >= word.length()) stringEnd = true;
                }
                if (stringEnd) longestWord = longestWord.length() > word.length() ? longestWord : word;
            }
        }
        return longestWord;
    }
}
