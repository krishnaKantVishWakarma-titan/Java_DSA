import java.util.*;
public class MergeSortedArrays {
    public static void main(String[] args) {
        int a[] = {1,3,5,7};
        int b[] = {2,4,6,8};
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while(i < a.length && j < b.length){
            if(a[i] < b[j]) result.add(a[i++]);
            else result.add(b[j++]);
        }

        while(i < a.length) result.add(a[i++]);
        while(j < b.length) result.add(b[j++]);

        System.out.println(result);
    }
}
