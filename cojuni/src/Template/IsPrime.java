package Template;

public class IsPrime {

    public boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String arg[]) {
        int num = 7;

        System.out.println(new IsPrime().isPrime(num));
    }
}
