package problemset1a;

public class PrimeNumberChecker {
    public static int isPrime(int num) {
        int result = 0;

        for (int i = 2; i < (num / 2); i++) {
            if ((num % i) == 0) {
                return 0;
            } else {
                result = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(100));
        System.out.println(isPrime(101));
    }
}
