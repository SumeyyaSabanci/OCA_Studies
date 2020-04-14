package Q_85_127;

public class Q97 {
}
class Animal {
    String type = "Canine";
    int maxSpeed = 60;

    Animal (){

    }

    Animal(String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
}

class WildAnimal extends Animal {
    String bounds;

    WildAnimal(String bounds) {
        //line n1

    }

    WildAnimal(String type, int maxSpeed){
        //line n2
    }
}
/*
       And given the code fragment:

     WildAnimal wolf = new WildAnimal("Long");
     WildAnimal tiger = new WildAnimal("Long", 80, "Short");
     System.out.println(wolf.type+ " " + wolf.maxSpeed + " " + wolf.bounds);
     System.out.println(tiger.type+ " " + tiger.maxSpeed + " " + tiger.bounds);



        Which two modifications enable the code to print the following output? Canine 60 Long Feline 80 Short
            A. Replace line n1 with:super ();this.bounds = bounds;
            B. Replace line n1 with:this.bounds = bounds;super ();
            C. Replace line n2 with:super (type, maxSpeed);this (bounds);
            D. Replace line n1 with:this (“Canine”, 60);this.bounds = bounds
            E. Replace line n2 with:super (type, maxSpeed);this.bounds = bounds;
 */