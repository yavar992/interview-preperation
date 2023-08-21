package interviewprep.ConceptsThatNotCoveredYet;

import java.io.LineNumberInputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashmap extends Object {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        ConcurrentHashMap<String , Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("foo", 1);
        concurrentHashMap.put("bar", 2);
        concurrentHashMap.put("baz", 3);
        concurrentHashMap.put("qux", 4);
        System.out.println(concurrentHashMap);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        Iterator<Integer> iterators = numbers.iterator();
        while (iterators.hasNext()){
            Integer integer = iterators.next();
            if (integer==3){
                iterators.remove();
            }
        }
        System.out.println(iterators.toString());

        List<Integer> number = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (Integer i: number){
            if (number.get(i)%2==0){
                number.remove(i);
            }
        }
        System.out.println(number);

        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add(null);
        set.add("banana");
        set.add("orange");
        set.add("orange");
        set.add(null); //
        set.add(null);
        System.out.println(
                set
        );

    }
}
