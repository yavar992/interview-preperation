package interviewprep.ConceptsThatNotCoveredYet;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class FileHandling {

    public static void main(String[] args) {
       SingletonDesignPattern s =  SingletonDesignPattern.getSingletonDesignPattern();
       SingletonDesignPattern s1 = SingletonDesignPattern.getSingletonDesignPattern();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());


        List<Object[]> objects = new ArrayList<>();

        objects.add(new Object[]{1,"yavar",23});
        objects.add(new Object[]{2,"shadab",43});
        objects.add(new Object[]{1,"anas",21});
        objects.add(new Object[]{1,"shahbaz",27});

        for (Object[] objects1 : objects){
            int id = (int)objects1[0];
            String name = (String) objects1[1];
            int age = (int) objects1[2];
            System.out.println("id: " + id + " age: " + age + " name:" + name);
        }

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(LocalDateTime.now(ZoneId.of("GMT")));
        System.out.println(LocalDateTime.now().plusMinutes(15));

        int[] arr = {43,5,7,3,44,3,56,3};
        int secondLargestElment  = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get(); // for primitive data type
        System.out.println(secondLargestElment);
        List<Integer> array = Arrays.asList(43,5,7,3,44,3,56,3);

        int result = array.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get(); //for collection
        System.out.println(result);
        // \u000d System.out.println("yavar");

    }
}
