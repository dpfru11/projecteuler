public class problem0 {
    long sumOfOddSquares(long squareLim) {
        long sum = 0;
        for (long i = 1; i < squareLim; i++) {
            long power = Math.powExact(i, 2);
            if (power % 2 != 0) {
                sum += power;
            }
        }
        return sum;
    }
}

