package ex1;


import org.junit.Test;

public class Ex1 {

    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();
    {
        System.out.println(rope1.length);
    }

    /**
     * What is the output of the following code?
     */

        @Test
    public void runTest1() {
            rope1.length = 2;
            rope2.length = 8;
            System.out.println(rope1.length);
    }


}
