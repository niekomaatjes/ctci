package GayleLaakmann.exercises.arraysstrings;

/**
 * 1.6
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class StringCompression {

    public String compress(String s) {
        char current = s.charAt(0);
        int countForCurrent = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            char newC = s.charAt(i);
            if (newC == current) countForCurrent++;
            if (newC != current || i == s.length() - 1) {
                builder.append(current).append(countForCurrent);
                current = newC;
                countForCurrent = 1;
            }
        }
        return builder.toString();
    }

}
