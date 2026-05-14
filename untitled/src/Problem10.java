import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem10 {
    public int summationOfPrimes(int limit, int sum) {

        int sum1 = sum;
        if (limit == 1) {
            return sum;
        }
        if (limit % 2 == 0 && limit != 2) {
            return summationOfPrimes(limit - 1, sum);
        }
        if (limit % 3 == 0 && limit != 3) {
            return summationOfPrimes(limit - 1, sum);
        }

        for (int i = 2; i < Math.sqrt(limit); i += 2) {
            if (limit % i == 0 && limit != i) {
                return summationOfPrimes(limit - 1, sum);
            }
        }
        sum1 += limit;

        return summationOfPrimes(limit - 1, sum1);
    }

    public static int iterativeSummationOfPrimes(int limit) {
        List<Integer> primes = new LinkedList<>();

        for (int i = 2; i < limit; i++) {

            if (i % 2 == 0 && i != 2) {
                continue;
            } else if (i == 2) {
                primes.add(2);
            }

            if (i % 3 == 0 && i != 3) {
                continue;
            } else if (i == 3) {
                primes.add(3);
            }

            boolean isPrime = true;
            for (int j = 5; j < Math.sqrt(i); j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return listSum(primes);
    }

    private static int listSum(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
