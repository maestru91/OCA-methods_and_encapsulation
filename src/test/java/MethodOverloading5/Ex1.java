package MethodOverloading5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    @Test
    public void run1(){
        List<Integer> lista = new ArrayList<>();
        int a = 32;
        lista.add(a);
        test(lista.get(0));

        Integer s = 5;
        for(int i=0; i<s; i++){
            test(i);
        }
    }


    private void test(Integer i){
        System.out.println("A fost apelat Integer i");
    }

    private void test(int i){
        System.out.println("a fost apelat int i");
    }
}
