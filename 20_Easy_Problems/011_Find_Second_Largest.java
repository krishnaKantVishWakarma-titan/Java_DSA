public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10, 20, 4, 45, 99};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            } else if(num > secondMax && num != max){
                secondMax = num;
            }
        }
        System.out.println("Second Largest: " + secondMax);
    }
}
