package interviewprep.RealInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllInterviewQuestion {
    public static void main(String[] args) {
        //) Print out duplicates character from your name ?
        String name = "Yavar";
        char[] names = name.toCharArray();
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                if (i!=j && names[i]==names[j]){
                    System.out.println(names[i]);
                }
            }
        }
        //7) swap values of a and b without taking third variable?
        int a =4;
        int b =3;
        b = a+b;  //7
        a = b-a;  //4
        b = b-a;  //3
        System.out.println(a);
        System.out.println(b);
        //8) print out 2nd highest number from a list
        List<Integer> list = Arrays.asList(5,8,3,8,64,23);
        int secondLargestNum = list.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().get();
        System.out.println(secondLargestNum);
    }
}
