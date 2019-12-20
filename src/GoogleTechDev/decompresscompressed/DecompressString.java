package GoogleTechDev.decompresscompressed;

/**
 * In this exercise, you're going to decompress a compressed string.
 * <p>
 * Your input is a compressed string of the format number[string] and the decompressed output form should be the string written number times. For example:
 * <p>
 * The input
 * <p>
 * 3[abc]4[ab]c
 * <p>
 * Would be output as
 * <p>
 * abcabcabcababababc
 */
public class DecompressString {

    public String decompress(String s) {
        String toReturn = "";
        String toRepeat = "";
        /**
         * Iterating over the entire string.
         */
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            /**
             * While we encounter digits, we store them in a string, that is going to represent the N times a sub string will be
             * repeated.
             */
            if (Character.isDigit(c)) {
                toRepeat += c;
            } else {
                /**
                 * Every time we see an opening bracket, it means that we have encountered a sub string to be repeated.
                 * Since that string can contain other sub strings, (so other opening brackets). We keep track of how many
                 * brackets have been closed, if we close the same amount of brackets that we have opened, it means that we have
                 * reached the end of the top most substring.
                 */
                int brackets = 0;
                if (c == '[') {
                    brackets++;
                    String sub = "";
                    while (brackets > 0) {
                        i++;
                        c = s.charAt(i);
                        if (c == ']') brackets--;
                        if (brackets == 0) continue;
                        if (c == '[') brackets++;
                        sub += c;
                    }
                    String decompressed = decompress(sub);
                    int toRepeatValue = Integer.parseInt(toRepeat);
                    while (toRepeatValue > 0) {
                        toRepeatValue--;
                        toReturn += decompressed;
                    }
                    toRepeat = "";
                } else {
                    toReturn += c;
                }
            }
        }
        return toReturn;
    }

}
