package ex2;

import org.junit.Test;

public class Squares {
    public static long square(int x) {
        long y = x * (long) x; x = -1;
        return y;
    }

    @Test
    public void runTest2() {
        int value = 9;
        long result = square(value);
        System.out.println(value);
    }
}
