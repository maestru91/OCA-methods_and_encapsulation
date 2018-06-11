package MethodOverloading2;

import org.junit.Test;

public class Ex1 {

    /**
     *
     * care este rezultatul ?
     */
    @Test
    public void run1(){
        byte a = 10;
        byte b = 10;
//        calculate(a+b);

    }

    private void calculate(int a){
        System.out.println(a+10);
    }

    private void calculate(short a){
        System.out.println(a+100);
    }

    private void calculate(byte a){
        System.out.println(a+1000);
    }
}
