// Find the Sum of Digits of a Number
// Input = 1234 → Output = 1+2+3+4 = 10

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234, sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
