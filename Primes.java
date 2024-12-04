public class Primes {
    public static void main(String[] args) {
        if (args.length < 1) { 
            System.out.println("Invallid number");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n < 2) { 
            System.out.println("2 is the first prime number");
            return;
        }
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) { 
            isPrime[i] = true;
        }
        int p = 2;
        while (p * p <= n) { 
            if (isPrime[p]) { 
                for (int multiple = p * p; multiple <= n; multiple += p) { 
                    isPrime[multiple] = false;
                }
            }
            p++;
        }
        int primeCount = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) { 
            if (isPrime[i]) { 
                System.out.println(i);
                primeCount++;
            }
        }
        int percentage = (int) Math.round((primeCount * 100.0) / n);
        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)\n", primeCount, n, percentage);
        
    }
}