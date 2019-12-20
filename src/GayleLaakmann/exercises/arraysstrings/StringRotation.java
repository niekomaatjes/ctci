package GayleLaakmann.exercises.arraysstrings;

/**
 * 1.9
 * Assume you have a method isSubstringwhich checks if one word is a substring
 * of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
 * call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
 */
public class StringRotation {

    /**
     * Runtime complexity, should be O(S1 + S2) if everything is implemented efficiently.
     * @param s1
     * @param s2
     * @return
     */
    public boolean isSubstring(String s1, String s2) {
        StringBuilder builder = new StringBuilder(s2.length() * 2);
        builder.append(s2).append(s2);
        return builder.toString().contains(s1);
    }

    public boolean isSubstringSmartJVM(String s1, String s2) {
        /**
         * Now, this only flies because the JVM is sufficiently optimized to create a builder, append s1 and s2 efficiently,
         * it's not doing a classic java string concatenation. Otherwise see other method.
         */
        return (s2 + s2).contains(s1);
    }

}
