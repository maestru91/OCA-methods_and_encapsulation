package overloadingMethods;

public class MethodsOverloading {

    // All this examples are taken from OCA book and are valid example of how a method can be overloaded
    public void fly(int numMiles) { }

    public void fly(short numFeet) { }

    public boolean fly() { return false; }

    void fly(int numMiles, short numFeet) { }

    public void fly(short numFeet, int numMiles) throws Exception { }
}
