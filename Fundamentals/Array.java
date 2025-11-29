import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Array
        // An array is an important linear data structure that allows us to store multiple values of the same type.

        // Arrays in Java are objects, like all other objects in Java, arrays implicitly inherit from the java.lang.Object class.
        // This allows you to invoke methods defined in Object (such as toString(), equals() and hashCode()).
        // Arrays have a built-in length property, which provides the number of elements in the array.

        // Fixed size, Index starts with 0, stored in continuous memory, can store primitive types and objects.

        // Array Declaration
        int[] arr;   // Recommended
        int arr2[];  // Also valid - C-style array type declaration

        // Array Initialization
        int[] marks = {90, 85, 88, 92}; // Java: Creates the array, Sets its size, Fills the values

        // Dynamic Initialization - You only know the size, not values.
        int[] arr3 = new int[5];
        // int → 0
        // double → 0.0
        // boolean → false
        // String/Object → null

        // Array length
        System.out.println(arr3.length);

        // Traverse by for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Traverse by enhanced for loop
        for (int num : marks) {
            System.out.println(num);
        }

        // 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Dynamic 2D array
        int[][] arr4 = new int[3][2];

        // Useful methods from Array class
        int[] arr = {1, 5, 3, 5, 2, 8, 4, 6};

        for (int ele: arr) {
            System.out.print(ele + " ");
        }

        // Sort the entire array
        Arrays.sort(arr);
        System.out.println("\n After sorting: ");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }

        int[] arr2 = {1, 5, 3, 5, 2, 8, 4, 6};

        // Sort the given range of the array
        Arrays.sort(arr2, 2, 4);
        System.out.println("\n After range sorting: ");
        for (int ele: arr2) {
            System.out.print(ele + " ");
        }

        // Binary search implementation
        System.out.println("\n" + Arrays.binarySearch(arr, 10));
        // If found then return index else negative value or less than zero value

        Arrays.fill(arr, 5);  // fills entire array with 5
        Arrays.fill(arr, 1, 3, 10);  // fills a range

        // Convert Array to String
        System.out.println(Arrays.toString(arr2));

        // Compare two arrays
        System.out.println(Arrays.equals(arr, arr2));

        // Arrays.deepEquals(arr1, arr2); For multi-dimensional array

        // Convert array to list
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list);

        // Set all the elements
        Arrays.setAll(arr, i -> i * 2);

        // Sum all the elements using streams api
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        

        // Two pointer technique
        // 2-types:
        // 1. Same Direction - Scanning data in single pass, Fast-slow pointer to use cycle's in linked list.
        // Template:
        int left = 0;
        for (int right = 0; right < n; right++) {

            // Expand window using right pointer
            // ---- process arr[right] here ----

            // Shrink window if needed
            while (conditionToShrinkWindow) {
                // ---- remove arr[left] from window ----
                left++;
            }

            // Now current window is valid (left..right)
            // ---- compute result from this window ----
        }

        // 2. Opposite Direction - Finding pairs or compair-ing elements from opposite direction.
        // Template:
        int left1 = 0;
        int right = n - 1;

        while (left < right) {

            int value = arr3[left1] + arr3[right];

            if (value == target) {
                // ---- found the pair ----
                break;
            }

            if (value < target) {
                left1++;     // need a bigger sum
            } else {
                right--;    // need a smaller sum
            }
        }

        // 3. Variation: Opposite Direction but both pointers move to center (Palindrome)
        left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

        // 4. Variation: Compressing / Removing duplicates
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Sliding window
        // It is a technique used to process a range (window) of elements in an array or string.

        // You move the window left → right without starting over each time.
        // Type of Slidng window

        // 1. Fixed-size window
        // Window size is given (e.g., window of size 3).

        // left = 0
        // for right in 0..n:
        //     add arr[right] to window
        //
        //     if window size > k:
        //        remove arr[left]
        //        left++
        //
        //    process the window

        // Example 01: Find max sum of any subarray of size 3.
        int[] arr = {2, 3, 5, 1, 6};
        int k = 3;

        // [2, 3, 5] → sum = 10
        // [3, 5, 1] → sum = 9
        // [5, 1, 6] → sum = 12

        int windowSum = 0;
        int maxSum = 0;

        int left = 0;

        for(int right=0; right < arr.length; right++) {
            windowSum += arr[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(windowSum, maxSum);

                windowSum -= arr[left]; // remove left element
                left++;                 // Slide the window
            }
        }

        System.out.println("Max sum is "+maxSum);

        // 2. Variable-size window
        // Window grows or shrinks based on conditions.

        // left = 0
        // for right in 0..n:
        //    add arr[right]
        //
        //    while condition is violated:
        //        remove arr[left]
        //        left++
        //
        //    update answer

        // Example 02: Longest substring without repeating characters

        String s = "abcabcbb";
        left = 0;
        int maxLen = 0;

        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If duplicate, shrink window
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Max length = " + maxLen);

        

    }
}
