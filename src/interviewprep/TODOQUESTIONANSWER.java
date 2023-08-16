package interviewprep;

import java.util.*;
import java.util.stream.Collectors;

public class TODOQUESTIONANSWER {

    // * Write a program to find the factorial of a number.

    public static Integer factorialOfNumber(Integer no) {
        Integer factorialNo = 1;
        for (Integer i = no; i > 0; i--) {
            factorialNo = factorialNo * i;
        }
        return factorialNo;
    }

    // Implement a function to check if a string is a palindrome.
    public static Boolean palindromeString(String word) {
        String originalWord = word;
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        System.out.println(" reversed String or word -> " + reversedWord);
        return (reversedWord == originalWord) ? true : false;
    }

    public static boolean isPalindrome(String name) {
        int left = 0;
        int right = name.length() - 1;
        while (left < right) {
            if (name.charAt(left) != name.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Implement a function to reverse a string.
    public static String reverseString(String name) {
        String reversedString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString = reversedString + name.charAt(i);
        }
        return reversedString;
    }

    // Write a program to find the largest element in an array.
    public static Integer largetElement(Integer[] array) {
        Integer largestNo = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNo) {
                largestNo = array[i];
            }
        }
        return largestNo;
    }

    // Implement a function to check if a number is prime.
    public static boolean isPrime(int no) {
        if (no == 1) {
            System.out.println("number is nor prime nor composite");
            return false;
        }

        int temp = 0;
        int count = 2;
        while (no >= count) {
            if (no % count == 0) {
                temp = temp + 1;
            }
            count++;
        }
        return (temp == 1) ? true : false;
    }

    // Write a program to sort an array in ascending order.
    public static List<Integer> sortedList(List<Integer> originalList) {
        List<Integer> sortedList = new ArrayList<>();
        Integer smallestNumber = Integer.MIN_VALUE;
        for (Integer i : originalList) {
            if (i > smallestNumber) {
                sortedList.add(i);
            }
        }
        return sortedList;
    }

    //Write a program to sort an array in ascending order. 
    public static void sortArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }                
            }
        }
    }

    public static void sortedArrayInDescendingOrder(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Implement a function to calculate the sum of digits in a number.
    public static int calculateDigitsSum(int num){

        int sum =0;
        while(num>0){
            int rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        return sum;
    }

    //Write a program to check if two strings are anagrams.
    public static boolean isagrams(String a  , String b){
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        if (a.length() != b.length()) {
            return false;
        }
       boolean ans = Arrays.equals(charA, charB);
       return ans?true:false;
        
    }

    //Implement a function to find the GCD (Greatest Common Divisor) of two numbers.
    

    //write a method to find the return a String that doesn't have reperating character in a String
    public static String notRepeatingCharacter(String input) {
        char[] charArray = input.toCharArray();
        StringBuilder result = new StringBuilder();
    
        for (int i = 0; i < charArray.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < charArray.length; j++) {
                if (i != j && charArray[i] == charArray[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                result.append(charArray[i]);
            }
        }
    
        return result.toString();
    }

    //duplicate method
    public static String repeatWords(String input){
        char[] charA = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < charA.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < charA.length; j++) {
                if(i!=j && charA[i]==charA[j]){
                    isRepeated = true;
                    break;
                }
            }
               if(!isRepeated){
                    stringBuilder.append(charA[i]);
                }
        }
        return stringBuilder.toString();

    }

    //find the occurance of all number in the list\

    
    public static void main(String[] args) {
        Integer factorialNo = factorialOfNumber(5);
        System.out.println(factorialNo);
        /// Implement a function to check if a string is a palindrome.
        Boolean ans = palindromeString("racecar");
        System.out.println(ans);
        boolean answer = isPalindrome("tacocat");
        System.out.println(answer);
        // Implement a function to reverse a string.
        String reversedString = reverseString("actual");
        System.out.println(reversedString);
        // Write a program to find the largest element in an array.
        Integer[] array = { 3, 4323, 423, 3, 23, 87, 31, 3123, 1, 312 };
        Integer largesInteger = largetElement(array);
        System.out.println(largesInteger);
        // Implement a function to check if a number is prime.
        boolean primeNumber = isPrime(3);
        System.out.println(primeNumber);
        // Write a program to sort an array in ascending order.
        List<Integer> sortedIntegers = sortedList(Arrays.asList(34, 2, 3, 423, 23, 23, 21));
        List<Integer> sordedList = sortedIntegers.stream().sorted().collect(Collectors.toList());
        System.out.println(sordedList);
        // sorted the arraylist into descending order
        List<Integer> listOfNo = Arrays.asList(23, 766, 2, 4, 2, 34, 5, 234, 323, 4, 2, 34);
        List<Integer> descendingOrderList = listOfNo.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(descendingOrderList);
        // find the second largest element in a list
        List<Integer> LIST = Arrays.asList(23, 766, 2, 4, 2, 34, 5, 234, 323, 4, 2, 34);
        Integer secondLargestElemet = LIST.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst()
                .get();
        System.out.println(secondLargestElemet);
        // find the largest element from the list
        List<Integer> simpleList = Arrays.asList(23, 766, 2, 4, 2, 34, 5, 234, 323, 4, 2, 34);
        Integer largestNoOfList = simpleList.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(largestNoOfList);
        // SORT A STRING ON THE BEHALF OF THEIR LENTGH
        List<String> randomList = Arrays.asList("hello", "ab", "i", "34", "543", "dwe");
        List<String> sortedString = randomList.stream().sorted(Comparator.comparingInt(String::length)).distinct()
                .collect(Collectors.toList());
        System.out.println(sortedString);
        int s = 4;
        System.out.println(s++ + "3");
        System.out.println(s++);
        //Write a program to sort an array in ascending order. 
        int [] arr = {43,2,5,23,3,42,34};
        sortedArrayInDescendingOrder(arr);
        System.out.println(Arrays.toString(arr));
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

        // Implement a function to calculate the sum of digits in a number.
        int sum = calculateDigitsSum(87);
        System.out.println(sum);
        //Write a program to check if two strings are anagrams.
        boolean anagram = isagrams("listen","silent");
        System.out.println(anagram);
        //write a method to find the return a String that doesn't have reperating character in a String
        String notRepaeatingResult = notRepeatingCharacter("hallowen");
        System.out.println(notRepaeatingResult);

        String repeatedWord = repeatWords("neurologist");
        System.out.println(repeatedWord);
        //lemda expression

    }
}
