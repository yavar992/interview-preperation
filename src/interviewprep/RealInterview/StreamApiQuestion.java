package interviewprep.RealInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiQuestion {
    public static void main(String[] args) {
        //Given a list of integers, write a program to find and print the squares of all even numbers from the list using the Stream API.
        //Write a program that takes a list of strings and returns a new list containing all the strings in uppercase, sorted in descending order of their lengths.
        List<Integer> integerList = Arrays.asList(3,4,2,65,4,6,3,6,324,7,7);
        List<Integer> squareOfAllIntegerNumebrs = integerList.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println(squareOfAllIntegerNumebrs);
        List<String> strings = Arrays.asList("hello", "MY","name","IS","yavar" ,"ALI","khan");
        List<String> resultStrings = strings.stream()
                .filter(str->str.chars().allMatch(Character::isUpperCase)).sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
        System.out.println(resultStrings);
        //CONVERT ALL THE ELEMENTS OF THE LIST IN UPPARCASE AND RETURN THE LIST IN THEIR REVERSED ORDER
        List<String> list = Arrays.asList("hello", "MY","name","IS","yavar" ,"ALI","khan");
        List<String>upparCaseList = list.stream().map(String::toUpperCase).sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
        System.out.println(upparCaseList);
        //Given a list of strings, find and print the first string that has more than five characters using the Stream API.
        List<String> question = Arrays.asList("ENGINEER","hello", "MY","name","IS","yavar" ,"ALI","khan","ENGINEERING","computer","Science");
        String resultString = question.stream().filter(str->str.length()>5).findFirst().toString();
        System.out.println(resultString);
        //Create a program that takes a list of integers and calculates the sum of all prime numbers in the list using the Stream API.
        List<Integer> question5 = Arrays.asList(3,4,2,65,4,6,3,6,324,7,7);
        IntStream answer5 = question5.stream().filter(i->i%i==0).mapToInt(i->i);
        System.out.println(answer5);
        //Write a program to remove duplicate elements from a list of integers using the Stream API.
        List<Integer> question6 = Arrays.asList(3,4,2,65,4,6,3,6,324,7,7);
        List<Integer> answer6 = question6.stream().distinct().collect(Collectors.toList());
        System.out.println(answer6);
        //Given a list of names, create a program that generates a comma-separated string of names using the Stream API.
        List<String> question7 = Arrays.asList("ENGINEER","hello", "MY","name","IS","yavar" ,"ALI","khan","ENGINEERING","computer","Science");
        String answer8 = String.join(",", question7);
        System.out.println(answer8);
        List<String> answer_8 = question7.stream().map(a->a.replaceAll(",","")).collect(Collectors.toList());
        System.out.println(answer_8);
        String result = String.join(" ",answer_8);
        System.out.println(result);
        //Create a program that reads a list of words and prints a map where the keys are word lengths, and the values are the counts of words with that length.

    }
}
