package modificatoriAcces1;


import org.junit.Test;

public class X
{

    /**
     * Do you think the below program is written correctly? If yes, what will be the output?
     */
    @Test
    public void runModificatoriAcces1 ()
    {

        Y x = new Y();
        System.out.println(x.i);
        x.methodOfX();


    }
}

class Y
{
    protected int i = 1221;

    protected void methodOfX()
    {
        System.out.println(i);
    }
}


