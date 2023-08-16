package interviewprep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericType {
    

    public static <T> T genericsMethod(T input){
        return input;
    }

    public static <T , R> R anotherGenericMethod(T input){
        return null;
    }

   

    public static void main(String[] args) {
        
        //GENRIC TYPES CLASS AND METHOD IN JAVA
        List<Integer> list = new ArrayList<>();
        list.add(3);

        String ans = genericsMethod("hello");
        System.out.println(ans);
        Integer num = genericsMethod(43);
        System.out.println(num);
        List<LinkedList<String>> arrayLists = genericsMethod(new LinkedList<>());
        System.out.println(arrayLists);

        String x = "yavar";
        Integer result = anotherGenericMethod(x);
    }
}
