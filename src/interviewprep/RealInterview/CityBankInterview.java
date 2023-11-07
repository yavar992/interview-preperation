package interviewprep.RealInterview;

import java.util.*;

public class CityBankInterview {


    //7 year experience

    public static void main(String[] args) {

        //what is base class and diff b/ interface and the abstract class
        //functional interface
        //diff b/w int i = 9 and int i =09; ans-- you will get the compilation error because byDefault java use the decimal number system and 09 is a octal number and even this is not a octal number
        //becoz octal number is from the 0-7 only
        //internal implementation of the hashmap
        //what is rehashing in java and what is the criteria for the hashmap , can string or StringBuilder can be key in the hashmap
        //what is the fail-fast and fail fast in the collection
        //what will happen when we update the key in the hashmap when we are using the StingBuilder as key
        // how long stack and the heap memory remains - ? stack memory automatically reclaims when the method return coz method calls or frane stores in the stack memory and
        //once the jvm  stopped the heap memory will be released from the heap area and also when  some reference variable are not using in the program they will be removed by the garbage collector from the heap
        // WHAT IS THE MARKER INTERFACE IN THE JAVA - ?
        //marker interface is the interface which doesn't have any method in the interface and is used for the
        //internal implementation of the hashmap -- it internally use the linkdedlist To store the key and values
        //diff b/w hashmap and the concurrent-hashmap
        //11 - why do we prefer String as key in the hashmap - ?
        // diff scopes in the spring

        int i = 9;
        // 09 will give the compilation error
        int b = 05;


        int decimal = 9;

        int s= 94_2342;
        System.out.println(s);
        HashMap<StringBuilder , Integer> hashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder("Yavar");
        hashMap.put(stringBuilder ,3);
        hashMap.put(stringBuilder.append("Yavar") , 5);
        hashMap.put(stringBuilder.append("") , 4);
        System.out.printf(String.valueOf(hashMap));

        Integer ac = 34;
        String cd ="434";
        String acd = String.valueOf(ac);
        Integer AS = Integer.valueOf(cd);
        int[] originalArray = {3,5,3,5,6,1,6,7};
        int[] answer = findDuplicateCharacter(originalArray);
        System.out.println(Arrays.toString(answer));
        duplicate(originalArray);


        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(5);
        integers.add(46);
        integers.add(47);
        integers.add(48);
        integers.add(4);

        Set<Integer> set = new HashSet<>(integers);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        int[] arr = {1, 2, 3, 1, 2, 5};
        int duplicateCount = countDuplicates(arr);
        System.out.println("The number of duplicate elements is: " + duplicateCount);
        List<Integer> list1 = Arrays.asList(53,5,6,2,75,77,34,73,12,89);
        Integer ans = list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(ans);
        //factorial of a number


        //syntex of the hashmap
//        HashMap<keyType , valueType> hashMap = new HashMap<keyType, valueType>();
//        HashMap<StringBuilder ,Integer> hashMap = new HashMap<>();
//        we can use the StringBuilder as the keyType in the hashMap but it's not recommanded to use the StringBuilder as the keyType becoz StringBuilder can be modified and the don't override the equal and hascode method of the object class
        //hashmap - in the hashmap evey key should be unique and the key can be unique and value also can be unique and String can be key in the hashmap

        // suppose if uh have the any object assign with the null value so now tell me how much space it will takeof the memory -?
        // 4 bytes on the 32 b-bit system and 8 bytes on the 64 bits system

        //q - why do we use wrapper class with the collection not the primtive
        //        ans- becoz collection doesn't support the primitive data types , colllection onkly works with the objects that's why


    }
    //find all duplicate character in an array
    public static int[] findDuplicateCharacter(int[] array){
       //create a list to store the duplicate the elements
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]==array[j] && !list.contains(array[i])){
                    list.add(array[i]);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            result[i]= list.get(i);
        }
        return result.length>0 ?result : null;
    }

    //count of duplicate values in array
    public static int countDuplicatesCharacters(int[] array , int targetElements){
        int count = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]==targetElements){
                    count++;
                }
            }
        }
        return count;
    }

    //duplicate elements
    public static void duplicate(int[] array){
        int count = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]){
                    count++;
                    System.out.println("duplicate element " + array[i]);
                }
            }
        }
        System.out.println(count);
    }

    //remove duplicate elements from list
    public static List<Integer> removeDuplicates(List<Integer> integers){

        integers.add(4);
        integers.add(5);
        integers.add(46);
        integers.add(47);
        integers.add(48);
        integers.add(4);

        Set<Integer> set = new HashSet<>(integers);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        return list;
    }

    public static int countDuplicates(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();

        return 0;
    }

    //write a program to find the closest number




}
