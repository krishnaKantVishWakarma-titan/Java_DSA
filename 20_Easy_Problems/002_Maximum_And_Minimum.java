// Maximum and Minimum
// Return the largest and smallest element in the array.

// One more approache is like:
// Sort the array and return 1st and last indexed value
// But then the Time complexity will be O(nlogn).

public class Main
{
    // 1st Approache
    // Time: O(N)
    // Space: O(1)
    public static int[] maxAndMin(int[] arr) {
        int[] res = new int[2];
        int max = arr[0];
        int min = arr[0];
        
        for (int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min >= arr[i]) {
                min = arr[i];
            }
        }
        res[0] = max;
        res[1] = min;
        
        return res;
    }
	public static void main(String[] args) {
		int[] arr = {2, 4, 45, 1, 3, 6, 10};
		System.out.println("before:");
		for (int i=0; i<arr.length; i++) {
		    System.out.print(arr[i] + "\t");
		}
		System.out.println("\n1st approache:");
		int[] res = maxAndMin(arr);
		System.out.println("Maximum val: "+res[0]);
		System.out.println("Minimum val: "+res[1]);
	}
}
