package overloadingMethods;

public class ConstructorOverloading {
 private int numTeeth;
 private int numWhiskers;
 private int weight;

    public ConstructorOverloading(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }

    public ConstructorOverloading(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }

    public ConstructorOverloading(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }



    public static void main(String[] args) {
            ConstructorOverloading cons = new ConstructorOverloading(15); cons.print();
    }

}
