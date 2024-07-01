//WAJP to find largest and smallest number in unsorted array 
package java_program;

public class FindMinMax {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 4, 2, 9, 6};

        // Initial call to find the min and max values
        int[] minMax = findMinMax(array);

        // Output the results
        System.out.println("Minimum value: " + minMax[0]);
        System.out.println("Maximum value: " + minMax[1]);
    }

    public static int[] findMinMax(int[] array) {
        // Initialize min and max with the first element of the array
        int min = array[0];
        int max = array[0];

        // Loop through the array
        for (int i = 1; i < array.length; i++) {
            // Update min and max if current element is less or greater
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        // Return the min and max values as an array
        return new int[]{min, max};
    }
}
