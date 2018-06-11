package MethodOverloading4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    @Test
    public void run1(){
//        int a = 32;
//        test(a);
//        test("haha");



    }


    private void test(Object o){
        System.out.println("a fost apelat Object o");
    }

    private void test(String o){
        System.out.println("a fost apelat String o ");
    }

    private void test(Short o){
        System.out.println("a fost apelat Short o");
    }


}
