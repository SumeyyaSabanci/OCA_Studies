package day01_Lambda;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PERMU {

    public static void main(String[] args) {
        String s="abcd";
        permutation(s).forEach(x->System.out.println(x));
    }

    public static Stream<String> permutation(String str){
        if(str.isEmpty()) {
            return Stream.of("");
        }

        return IntStream.range(0,str.length())
                .boxed()
                .flatMap(i->permutation(str.substring(0, i)+str.substring(i+1))
                        .map(t->str.charAt(i)+t));
    }
}


