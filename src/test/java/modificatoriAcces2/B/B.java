package modificatoriAcces2.B;

import modificatoriAcces2.A.A;
import org.junit.Test;

public class B extends A {

    @Test
    public void method1(){
        System.out.println(variabilaProtected);
    }

    @Test
    public void method2(){
        A a = new A();
        /** se poate? */
        //System.out.println(a.variabilaProtected);

        /** se poate? */
        B b = new B();
        //System.out.println(b.variabilaProtected);

        /** se poate? */
        A a1 = new B();
        //System.out.println(a1.variabilaProtected);




    }
}
