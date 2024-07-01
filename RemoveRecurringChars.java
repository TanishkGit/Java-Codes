//A string is given, if any character recurs, so eliminate it & print remaining string.
package java_program;

import java.util.HashSet;

public class RemoveRecurringChars {
    public static void main(String[] args) {
        String input = "programming";

        // Remove recurring characters
        String result = removeRecurringCharacters(input);

        // Output the result
        System.out.println("String after removing recurring characters: " + result);
    }

    public static String removeRecurringCharacters(String str) {
        // Set to keep track of characters seen so far
        HashSet<Character> seen = new HashSet<>();
        // Set to keep track of recurring characters
        HashSet<Character> recurring = new HashSet<>();
        // StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            // Check if character is recurring
            if (seen.contains(ch)) {
                recurring.add(ch);
            } else {
                seen.add(ch);
            }
        }

        // Build result with non-recurring characters
        for (char ch : str.toCharArray()) {
            if (!recurring.contains(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
