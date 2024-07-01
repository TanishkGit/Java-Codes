import java.util.HashSet;
import java.util.Set;

public class common_in_2_array {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Find common elements
        Set<Integer> commonElements = findCommonElements(array1, array2);

        // Output the result
        System.out.println("Common elements: " + commonElements);
    }

    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        // Set to store elements of the first array
        Set<Integer> set1 = new HashSet<>();
        // Set to store common elements
        Set<Integer> common = new HashSet<>();

        // Add elements of the first array to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Check elements of the second array for common elements
        for (int num : array2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        return common;
    }
}
