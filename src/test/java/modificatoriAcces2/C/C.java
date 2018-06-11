package modificatoriAcces2.C;

import modificatoriAcces2.B.B;
import org.junit.Test;

public class C extends B {

    @Test
    public void run1(){
        B b = new B();
        /** se poate? */
//        System.out.println(b.variabilaProtected);

        C c = new C();
        B b1 = c;
    }
}
