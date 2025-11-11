// Reverse a array

public class Main
{
    // 1st approache
    // Using 1 array
    // Time: O(n)
    // Space: O(n)
    public static int[] reverseArray1 (int[] arr) {
        int[] res = new int[5];
        for (int i=0; i<5; i++) {
            res[4-i] = arr[i];
        }
        return res;
    }
    
    // 2nd approache
    // Without using extra array
    // Time: O(N/2)
    // Space: O(1)
    public static int[] reverseArray2 (int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        return arr;
    }
    
	public static void main(String[] args) {
		int[] inp = {10, 20, 30, 40, 50};
		
		System.out.println("Before reverse: ");
		for (int i=0; i<5; i++) {
		    System.out.print(inp[i] + "\t");
		}
		
		System.out.println("\nApproche 1st: ");
		int[] res1 = reverseArray1(inp);
		
		System.out.println("After reverse: ");
		for (int i=0; i<5; i++) {
		    System.out.print(res1[i] + "\t");
		}
		
		System.out.println("\nApproche 2st: ");
		int[] res2 = reverseArray2(inp);
		System.out.println("After reverse: ");
		for (int i=0; i<5; i++) {
		    System.out.print(res2[i] + "\t");
		}
	}
}
