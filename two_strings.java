import java.util.HashSet;
import java.util.Set;

public class two_strings {
    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "ring";

        // Eliminate characters from str1 that are present in str2
        String result = eliminateCharacters(str1, str2);

        // Output the result
        System.out.println("Resulting string: " + result);
    }

    public static String eliminateCharacters(String str1, String str2) {
        // Set to store characters of the second string
        Set<Character> charSet = new HashSet<>();

        // Add characters of the second string to the set
        for (char ch : str2.toCharArray()) {
            charSet.add(ch);
        }

        // StringBuilder to build the resulting string
        StringBuilder result = new StringBuilder();

        // Iterate through the first string
        for (char ch : str1.toCharArray()) {
            // Append character to result if it's not in the set
            if (!charSet.contains(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
