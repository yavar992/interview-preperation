package interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class iterator {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        Iterator<String> names = list.iterator();
        while (names.hasNext()) {
            String name = names.next();
            System.out.println(name);
        }

        // ITERATOR USING THE LINKEDLIST

        // LinkedList<Integer> list1 = new LinkedList<>();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(5);
        // list1.add(6);

        // Iterator<Integer> newList = list1.iterator();
        // while (newList.hasNext()) {
        //     Integer items = newList.next();
        //     System.out.println(items);
        // }

        // ITERATOR USING THE HASHSET
        HashSet<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("c");
        set.add("java");

        Iterator<String> iteratorItems = set.iterator();
        while (iteratorItems.hasNext()) {
            String setItems = iteratorItems.next();
            System.out.println(setItems);
        }

        // HOW TO PRINT A LIST IN A SINGLE LINE
        System.out.println(Arrays.asList("a", "b", "hello", "c", "d", "e", "f", "g", "h", "i"));

        // STREAM API
        // List<String> fruits = Arrays.asList("Apple", "Anar" , "Banana", "Orange",
        // "Mango");
        // List<String> filterFruits = fruits.stream()
        // .filter(fruits -> fruits.startsWith("a"))
        // .collect(Collectors.toList());

        // EXAMPLE OF LAMDA EXPRESSOM
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .reduce(0, (acc, number) -> acc + number);

        System.out.println( "sum " +sum);

        //PRINT EVEN NUMBERS FROM THE LIST USING STREAM AND WITHOUT STREAM API 

        //STANDARD FORMAT
        List<Integer> evenNumbera = Arrays.asList(1,2,4,2,4,22,9,4,2,4,2,2,4);
        for(Integer i : evenNumbera){
            if(i%2==1){
                System.out.println(" odd numbers " + i);
            }
        }

        //NOW DO THIS WITH THE HELP OF STREAM API
        List<Integer> num =  List.of(2,3, 24,54,4,2,4,2,2,4,23,4,2);
        List<Integer> oddNum = num.stream().filter(i ->i % 2 == 1).collect(Collectors.toList());
        System.out.println("even numbers " + oddNum);

        //FILTER ALL THE NUMBERS THAT ARE GREATER THAN 20
        List<Integer> noGreaterThan50 = num.stream().filter(a -> a>20)
        .sorted()
        .map(a-> a*2)
        .collect(Collectors.toList());
        System.out.println( "here is all th numbers greater than 20  " +  noGreaterThan50);

        //RETURN UNIQUE ELEMENT FROM THE LIST 
         List<Integer> numa =  List.of(2,3, 24,54,4,2,4,2,2,4,23,4,2);
        List<Integer> uniqueNumber = numa.stream().distinct().collect(Collectors.toList());
        System.out.println( " uniqueNumbets " + uniqueNumber);

        //FILTER ALL THE NAME THAT IS STARTING WITH THE A AND B
        List<String> names2 = Arrays.asList("hello", "world", "my" , " name " , "is " , "Yavar" , "Aladdin" , "Dummy" , "DATA" , "Dummy" , "Dummy");
        List<String> filterNames = names2.stream().filter(i -> i.length()>4).collect(Collectors.toList());
        System.out.println("filter names  : " + filterNames);

        //FILTER ALL THE NAME THAT IS STARTING WITH THE A AND B
        List<String> names3 = Arrays.asList("hello", "world", "my", " name ", "is ", "Yavar", "Aladdin", "Dummy", "DATA", "Dummy", "Dummy");
        List<String> filterNames2 = names3.stream().filter(i -> i.startsWith("Y")).collect(Collectors.toList());
        System.out.println("filter names " + filterNames2);

        //MULTIPLY EVERY NUMBR BY2

        List<Integer> items = Arrays.asList(3,4,3,23,2,34,32,3,432);
        List<Integer> multiplied = items.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(multiplied);

        //LIMIT
        List<Integer> items2 = Arrays.asList(3,4,3,23,2,34,32,3,432);
        List<Integer> limited = items2.stream().limit(4)
        .sorted()
        .collect(Collectors.toList());
        System.out.println( "LIMITED NUMBERS " + limited);

        //SKIP METHOD IN STREAM

        List<String> skipNames = Arrays.asList("name", "name2", "names3", "names");
        List<String> skipNames2 = skipNames.stream().skip(2).collect(Collectors.toList());
        System.out.println("modified list " + skipNames2);

        //FOR EACH
                List<Integer> foreach = Arrays.asList(3,4,3,23,2,34,32,3,432);
                 foreach.stream().forEach(System.out::println);

        //COLLECTING WITH JOINING
                List<String> skipNa = Arrays.asList("name", "name2", "names3", "names");
                String skipNa2 = skipNa.stream()
                .collect(Collectors.joining(","));
                System.out.println("skipNa: {} " + skipNa2);


                //STREAM INTERFCE

                String[] namesOfBoys = { " students" , " students1" , "yavar " , "ali " , "khan" , "new delhi"};
                Stream<String> namesOfStudent = Stream.of(namesOfBoys);
                namesOfStudent.forEach(e->{
                    System.out.println( e);
                });

                 List<Integer> distnict = Arrays.asList(3,4,3,23,2,34,32,3,432);
                    distnict.stream().distinct().forEach(e->{
                        System.out.println(e);
                    });

                    //CHECK IF THE NAME IS STARTING WITH A AND B
                     List<String> NAMES = Arrays.asList("name", "name2", "yavar", "abuzar");
                     List<String> newnewList = NAMES.stream().filter(e -> e.startsWith("a") || e.startsWith("y")).collect(Collectors.toList());
                     System.out.println(newnewList);

                     //REVRSE THE ORDER OF A NUMBER

                     int original_number = 45678;

                     int reversed_number = 0;
                     while(original_number>0){
                        int remainder = original_number%10;
                        reversed_number = reversed_number*10 + remainder;
                        original_number = original_number/10;
                     }
                     System.out.println("here is the reversed number " + reversed_number);

                   // MAKE A METHOD OF GEENRIC TYPE
                   EnumExtendingInterface.VALUE2.doSomething();

                        
    }


   //THIS IS A EXAMPLE OF WILDCARD GENERIC TYPE (UNBOUNDED WILDCARDS)
    public static void getResult(List<?> list){
        for(Object i : list){
            System.out.println(i);
        }
    }
}
