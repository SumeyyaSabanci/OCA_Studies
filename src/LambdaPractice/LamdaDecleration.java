package LambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface WebPage {

    void header(String value, int year);
}


public class LamdaDecleration {

    public static void main(String[] args) {
        WebPage w1 = new WebPage() {
            @Override
            public void header(String value, int year) {

                System.out.println("Hello " + value);
            }
        };

        WebPage w2 = (x, y) -> {
            System.out.println("Hello " + x.toUpperCase() + "happy " + y + " year!");
        };


        w2.header("Google ", 25);





}

}