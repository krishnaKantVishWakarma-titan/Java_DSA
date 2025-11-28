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
        // 2-types
        // 1. Fixed-length Sliding window (window size=k)
        int windowSum = 0;

        // Build the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Process the rest
        for (int end = k; end < n; end++) {

            // ---- windowSum is valid for window (end-k .. end-1) ----

            // Add the next element
            windowSum += arr[end];

            // Remove the leftmost element
            windowSum -= arr[end - k];

            // ---- Now window is (end-k+1 .. end) ----
            // ---- Use windowSum to update result ----
        }

        // When to use:
        // Maximum sum of a subarray of size k
        // Average of each window
        // Number of vowels in a window of size k
        // Highest/lowest K-length segment/problems

        // 2. Variable-Length Sliding Window (Increase/Decrease window)
        int left = 0;

        for (int right = 0; right < n; right++) {

            // Expand the window
            // ---- include arr[right] into the window ----

            // Shrink while window is invalid
            while (windowIsInvalid) {
                // ---- remove arr[left] from window ----
                left++;
            }

            // Now window (left..right) is valid
            // ---- compute result from this window ----
        }

        // When to use:
        // Longest substring without repeating characters
        // Smallest subarray sum ≥ target
        // Longest subarray with at most K distinct characters
        // Fruit into baskets
        // Any “find longest/shortest subarray meeting condition” problem

        // Prefix Sum Array Template
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Prefix Max / Prefix Min
        // Max
        int[] prefixMax = new int[n];

        prefixMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }

        // Min
        int[] prefixMin = new int[n];

        prefixMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixMin[i] = Math.min(prefixMin[i - 1], arr[i]);
        }

        // Suffix Sum Array
        int n = arr.length;
        int[] suffix = new int[n];

        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        // Suffix Maximum
        int[] suffixMax = new int[n];

        suffixMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
        }

        // Suffix Minimum
        int[] suffixMin = new int[n];

        suffixMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], arr[i]);
        }

        // Next greater/smaller from right
        // Maximum points to the right
        // Constraint checking from right

        // Prefix Difference Array
        // Diff. array
        int[] diff = new int[n + 1];

        // Increase arr[l..r] by val
        diff[l] += val;
        diff[r + 1] -= val;

        // Build the Actual Array
        int[] res = new int[n];
        int curr = 0;

        for (int i = 0; i < n; i++) {
            curr += diff[i];
            res[i] = curr;
        }

        // Prefix XOR / Suffix XOR
        // Prefix XOR
        int[] prefixXor = new int[n];
        prefixXor[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ arr[i];
        }
        // Suffix XOR
        int val = prefixXor[r] ^ (l > 0 ? prefixXor[l - 1] : 0);

        // Prefix Products
        long[] prefixProd = new long[n];
        prefixProd[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixProd[i] = prefixProd[i - 1] * arr[i];
        }

        // Suffix Products
        long[] suffixProd = new long[n];
        suffixProd[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixProd[i] = suffixProd[i + 1] * arr[i];
        }

    }
}
