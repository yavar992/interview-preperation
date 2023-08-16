package interviewprep.ConceptsThatNotCoveredYet;

import java.util.*;

public class Maps {

    public static <T> ArrayList<T> hello(T...t){
        return new ArrayList<>(List.of(t));
    }


    public static void main(String[] args) {
        //HASHMAP IN JAVA
        Map<String , String> map = new HashMap<>();
        var hello = 94;
        System.out.println(hello);
        var hi = "hi";
        System.out.println(hi);
        Arrays.asList();

        System.out.println(5%8);
        Integer a = 349;
      int ad =  a.hashCode();
        System.out.println(ad);
        Object ade = "hello";
        System.out.println(ade.hashCode());
        System.out.println(ade.hashCode());
        Object in = 324;
        System.out.println(in.hashCode());
        HashMap<String , Integer> map1 =  new HashMap<>();
        map1.put("yaavr",4);
        map1.put("ali",2);
        map1.put("khan" ,7);
        map1.put("yaavr",3);
        System.out.println(map1);
        System.out.println("hello".hashCode());
        System.out.println("hello`".hashCode());

        //how to remove the elements while iterating to the array , set , hashmap
        //how load factors work in the hashmap

    }
}
