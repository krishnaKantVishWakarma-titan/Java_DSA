public class LCM {
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 15, b = 20;
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM = " + lcm);
    }
}
