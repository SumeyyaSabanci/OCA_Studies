package Q_61_84;

public class Q81 {
}
class Product {
    int id;
    String name;
    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Pen");
        Product p2 = new Product(101, "Pen");
        Product p3 = p1;
        boolean ans1 =  p1 == p2;
        boolean ans2 = p1.name.equals(p2.name);
        System.out.print(ans1 + ":" + ans2);
    }
}

//Answer C => false:true
