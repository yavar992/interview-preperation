package interviewprep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgrammingQuestion {
    public static void main(String[] args) {

        // FIND THE SECOND GRATEST NUMBER FROM THE ARRAY OR LIST
        List<Integer> listOfNo = Arrays.asList(23, 766, 2, 4, 2, 34, 5, 234, 323, 4, 2, 34);
        List<Integer> reversedOrderOfListOfNo = listOfNo.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("this is thr reversed order of the listOfNo " + reversedOrderOfListOfNo);
        int secondMaxNo = listOfNo.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("this is the second max no from the list " + secondMaxNo);

        // FIND THE MAXIMUM NO FROM THE LIST
        List<Integer> nos = Arrays.asList(42, 32, 32, 1, 54, 32, 654, 4, 2, 4, 2, 54, 4343, 23);
        List<Integer> reversedListOfnos = nos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("this is the reversed list of the nos " + reversedListOfnos);
        int maxNO = nos.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(" this is the maximum no from the list " + maxNO);

        // FIND THE 3RD LARGET NO FROM THE LIST
        List<Integer> no = Arrays.asList(854, 45, 2, 4, 3, 4, 54, 66, 52, 5, 3, 2, 5, 66, 62, 52, 6, 5, 35);
        List<Integer> reversedList = no.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("this is the revrsed order of the list " + reversedList);
        int thirdLargestNo = no.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().get();
        System.out.println("this is the third largest no from the list " + thirdLargestNo);

        //SORTED A LIST OF STRING 
        List<String> listofString = Arrays.asList("hello", "world" , "my" , "name" , "is" , "yavar" , "ali" , "khan");
        List<String> sortedList = listofString.stream().sorted().collect(Collectors.toList());
        System.out.println("this list is sorted  "  + sortedList);

        //SORT A STRING ON THE BEHALF OF THEIR LENTGH
        List<String> randomList = Arrays.asList("hello" , "ab" , "i" , "34" , "543","dwe");
        List<String> sortedStringOnBehalfOfLength = randomList.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println("this is the sorted string on the behalf of length " + sortedStringOnBehalfOfLength);

        //SORT A LIST OF STRING WITH THE SPACE 
        List<String> listofStringWithSpace = Arrays.asList(" apple" , "apple" , "apple" , "banana" , " banana" , "banana");
                List<String> sortedListWithSpace = listofStringWithSpace.stream().sorted().collect(Collectors.toList());
                System.out.println("this list is sorted  "  + sortedListWithSpace);

                int initialNo = 5;
                System.out.println(initialNo++ + ++initialNo  - initialNo-- - --initialNo);
                System.out.println(initialNo-- - --initialNo);

                String num = "43";
                int result = Integer.parseInt(num);
                System.out.println(result);

    }
}
