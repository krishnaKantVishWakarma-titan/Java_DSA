import java.util.Arrays;

// Check if the String is palindrome
// Example 01:
// Input: "madam"
// Output: True

// Example 01:
// Input: "krishna"
// Output: False

public class Main
{
	// 1st Approache
	// Make a copy and sort them and compare both
	// Time: O(n)
	// Space: O(1)
	public static boolean is_palind1(String val) {
		StringBuilder stringBuilder = new StringBuilder(val);
		stringBuilder.reverse();
		String reversedString = stringBuilder.toString();

		if (val.equals(reversedString)) {
			return true;
		} else {
			return false;
		}
	}

	// 2nd Approache
	//
	// Time: O(n/2) -> O(n)
	// Space: O(1)
	public static boolean is_palind2(String val) {
	    int start=0;
	    int end=val.length()-1;
	    boolean res = true;
	    
	    while (start < end) {
	        if (val.charAt(start) != val.charAt(end)) {
	            return false;
	        }
	        start++;
	        end--;
	    }
	    
		return res;
	}

	public static void main(String[] args) {
		String[] arr = {"madam", "krishna"};
		System.out.println("1st Approache:");
		for (int i=0; i<arr.length; i++) {
			boolean res = is_palind1(arr[i]);
			if (res) {
				System.out.println(arr[i] + " is palindrome");
			} else {
				System.out.println(arr[i] + " is not palindrome");
			}
		}
		System.out.println("\n2nd Approache:");
		for (int i=0; i<arr.length; i++) {
			boolean res = is_palind2(arr[i]);
			if (res) {
				System.out.println(arr[i] + " is palindrome");
			} else {
				System.out.println(arr[i] + " is not palindrome");
			}
		}

	}
}
