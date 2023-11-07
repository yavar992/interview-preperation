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

        Boolean ans = anagramString("alphabat");
        System.out.println(ans);
        int answer = nbYear(1000 ,2.0 ,50 ,1200 );
        int answer2 = noOfYear(1000 ,2.0 ,50 ,1200 );
        System.out.println(answer2);
        System.out.println(answer);
    }

    public static boolean anagramString(String sentence){
        char[] ch = sentence.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            for (int j = 0; j <ch.length ; j++) {
                if (i!=j && ch[j]==ch[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int nbYear(int p0, double percent, int aug, int p){
        percent = percent/100;
        double firstYear = p0*percent + aug;
        int count = 0;
        for (double i = p0; i<=p;  i+=firstYear) {
            count++;
        }
        return count;
    }

    public static int noOfYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            years++;
        }
        return years;
    }

    
}
