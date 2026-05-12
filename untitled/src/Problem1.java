public class Problem1 {
    public int sumMultiples3or5(int limit) {
        int sum = 0;
        for (int i = 3; i < limit; i++) {
             if (i %3 == 0 || i % 5 == 0) {
                 sum += i;
             }
        }
        return sum;
    }
}

