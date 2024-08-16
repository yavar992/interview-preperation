package interviewprep.java8;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class Sample {

   public static List<Integer> someFunction(final List<Integer> numbers){
       List<Integer> result =  new ArrayList<Integer>();
       for (int i = numbers.size()-1; i >= 0; i--){
           result.add(numbers.get(i));
       }
       return result;
   }
    public static void main(String[] args) {
        System.out.println("hi , this is a sample test");
        System.out.println("this is the second line ");

        List<Integer> list = List.of(1,2,4,4,5,6);
        someFunction(someFunction(list));
        System.out.println(someFunction(list));
    }
}

