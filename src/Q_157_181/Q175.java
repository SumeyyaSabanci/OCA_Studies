package Q_157_181;

public class Q175 {

}

class Employee {
    public int salary;
}

 class Manager extends Employee {
    public int budget;
}

class Director extends Manager {
    public int stockOptions;
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        manager.budget =1_000_000;
        director.stockOptions = 1_000;
        director.salary=80_000;
        employee.salary=50_000;
        //employee.budget=200_000;
        //manager.stockOptions=500;
    }
}


/*
A) employee.salary=50_000;
B) director.salary=80_000;
C) employee.budget=200_000;
D) manager.budget =1_000_000;
E) manager.stockOptions=500;
F) director.stockOptions = 1_000;
 */

