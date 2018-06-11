package OrderOfInitialization;

public class InitializationOrderSimple {

    private String name = "Torchie";
    { System.out.println(name); }

    // static variable
    private static int COUNT = 0;
    // static initializer 1
    static { System.out.println(COUNT); }

    // static initializer 2
    static { COUNT += 10; System.out.println(COUNT); }

    //contructor
    public InitializationOrderSimple() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
    // what will be the result
    // =>   ????????????????
}