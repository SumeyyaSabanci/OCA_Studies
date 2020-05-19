package Q_61_84;

public class Q84 {
}
class Person {
    String name;
    int age = 25;

    Person(String name){    // line n1
        setName(name);
    }

    public Person(String name, int age){    // line n2
     //  Person(name);

        setAge(age);
    }

    // setter and getter methods go here
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String show(){
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }

}

// Answer B => compilation fails at line n2
/*
Error on console:
Error:(12, 9) java: cannot find symbol
  symbol:   method Person(java.lang.String)
  location: class Q84.Person
 */