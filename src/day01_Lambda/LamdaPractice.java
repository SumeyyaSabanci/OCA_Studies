package day01_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaPractice {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>() {{
            add(new ArrayList<>(Arrays.asList(1,2,3,4)));
            add(new ArrayList<>(Arrays.asList(2,4,6,8)));
            add(new ArrayList<>(Arrays.asList(1,3,5,7)));
        }};
        for (List<Integer> list : lists) {
           list.removeIf(i -> i % 2 == 0);
            System.out.println(list);
        }





    }
}
