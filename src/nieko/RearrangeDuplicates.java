package nieko;

/**
 * Ok so let's observe an example -->
 * "aaabb" --> "ababa"
 * If we want to redistribute a around the string, we need to make sure that we have the appropriate space.
 * So, if when check every other character, we basically check half of the string. We can then say that half of the string
 * length, which represents the filler space, has to be greater or equals the frequency of the most frequent character.
 * We have to remember to check into account the character "eaten" by the integer division.
 */
public class RearrangeDuplicates {

    public boolean rearrange(String s) {
        int[] counts = new int[26];
        int max = 0;
        for (Character c : s.toCharArray()) {
            int index = c - 'a';
            counts[index]++;
            max = Math.max(counts[index], max);
        }
        int numOfFillers = s.length() / 2 + s.length() % 2;
        return numOfFillers >= max;
    }

}
