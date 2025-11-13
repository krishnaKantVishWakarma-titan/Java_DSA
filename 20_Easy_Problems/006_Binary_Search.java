// Binary Search: Search an element in a sorted array using divide-and-conquer
// Using Brute force

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        int target = 10;
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                System.out.println("Found at index: " + mid);
                return;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else end = mid - 1;
        }
        System.out.println("Not Found");
    }
}
