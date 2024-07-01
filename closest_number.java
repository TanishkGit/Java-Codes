//To find any 2 elements from given array whose sum is close to zero, array elements are positive and negative also.

import java.util.Arrays;

public class ClosestToZero {
    public static void main(String[] args) {
        int[] array = {1, 60, -10, 70, -80, 85};

        // Find the pair with the sum closest to zero
        int[] result = findClosestToZeroPair(array);

        // Output the result
        System.out.println("The pair whose sum is closest to zero: " + result[0] + " and " + result[1]);
    }

    public static int[] findClosestToZeroPair(int[] array) {
        // Sort the array
        Arrays.sort(array);

        // Initialize variables
        int left = 0;
        int right = array.length - 1;
        int minSum = Integer.MAX_VALUE;
        int[] closestPair = new int[2];

        // Two-pointer technique
        while (left < right) {
            int sum = array[left] + array[right];

            // Check if the current sum is closer to zero
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                closestPair[0] = array[left];
                closestPair[1] = array[right];
            }

            // Move pointers based on the sum
            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return closestPair;
    }
}
