// Remove Duplicates from an Array
// Using linked list to keep the order and set to not insert the duplicate value

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,4,2};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr) set.add(num);
        System.out.println(set);
    }
}
