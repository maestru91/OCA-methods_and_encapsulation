package PassingDataAmongMethods1;

import org.junit.Test;

public class Ex1 {

    @Test
    public void run1(){

        String test = "ABC";
        modifyString(test);
        System.out.println(test);

    }

    @Test
    public void run2(){
        StringBuilder stringBuilder = new StringBuilder("ABC");
        modifyStringBuilder(stringBuilder);
        System.out.println(stringBuilder.toString());

    }

    public static String modifyString(String a){
        a += a;
        return a;
    }

    public static StringBuilder modifyStringBuilder(StringBuilder a){
        a.append(a);
        return a;
    }


}
