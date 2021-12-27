public class PrimeNumbers {
    private static final int FINALNUMBER = 50;

    public static int sumPrimes(int n) {
        int sum = 0;
        int i = 2;
        while (i < n) {
            if (isPrime(i)) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static int[] primes(int n) {
        int[] primes = new int[n];
        int i = 0;
        int j = 2;
        while (i < n) {
            if (isPrime(j)) {
                primes[i] = j;
                i++;
            }
            j++;
        }
        return primes;
    }

    private static boolean isPrime(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i % 2 == 0) {
            return false;
        }
        for (int j = 3; j <= Math.sqrt(i); j += 2) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static int lastPrime(int n) {
        int[] primes = primes(n);
        return primes[primes.length - 1];
    }

    public static void main(String[] args) {
        System.out.println("La suma de los números primos que hay entre los 50 primeros números es " + sumPrimes(FINALNUMBER));
        System.out.println("La suma de los 50 primeros números primos es " + sumPrimes(lastPrime(FINALNUMBER)));
    }
}