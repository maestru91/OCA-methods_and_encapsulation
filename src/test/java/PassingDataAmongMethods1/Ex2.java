package PassingDataAmongMethods1;

import org.junit.Test;

public class Ex2 {

    @Test
    public void run1(){
        String name = "NoName";
        speak(name);
        System.out.println(name);

    }

    @Test
    public void run2(){
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name);
    }

    public static void speak(Object name){
        if(name instanceof String) {
            name = "MyName";
        }
        else if(name instanceof StringBuilder){
            ((StringBuilder) name).append("MyName");
        }
    }
}
