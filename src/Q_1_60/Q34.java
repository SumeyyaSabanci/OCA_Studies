package Q_1_60;

public class Q34 { }
class Animal {
    String type = "Canine";
    int maxSpeed = 60;

    Animal () {}
    Animal (String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
class WildAnimal extends Animal {
    String bounds;
    WildAnimal(String bounds) {
        //line n1
        super(); //can be or not does not matter
        this.bounds = bounds;
    }
    WildAnimal(String type, int maxSpeed, String bounds) {
        //line n2
        super(type, maxSpeed);
        this.bounds = bounds;
    }

    public static void main(String[] args) {
        //And given the code fragment:
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);

        //Output
        // Canine 60 long
        // Feline 80 Short
        //Which two modifications enable the code to print this output?
    }
}


//  super();
//  this.bounds = bounds;

// super(type,maxSpeed);
// this.bounds = bounds;


