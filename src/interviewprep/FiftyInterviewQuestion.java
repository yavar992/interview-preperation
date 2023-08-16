package interviewprep;

public class FiftyInterviewQuestion {

    //TO DO QUESTION
    //1-Write a Java program to find the factorial of a number using recursion.
    // Write a Java program to implement a binary search algorithm.
    // Write a Java program to sort a list of integers using the bubble sort algorithm.
    //Write a Java program to implement a stack data structure.
    //Write a Java program to implement a queue data structure.
    //Write a Java program to implement a binary tree data structure.
    //Write a Java program to implement a linked list data structure.
    //Write a Java program to find the GCD of two numbers.
    //Write a Java program to implement a hash table data structure.
    //Write a Java program to find the Fibonacci sequence up to a given number.
    //Write a Java program to find the Armstrong number between two given numbers.
    //Write a Java program to implement a priority queue data structure.
    //Write a Java program to find the LCM of two numbers.
    //What is the output of the following code snippet: System.out.println(Integer.toHexString(255));?
    //Write a Java program to implement a binary heap data structure.
    //Write a Java program to find the roots of a quadratic equation.
    //Write a Java program to implement a radix sort algorithm.
    //Write a Java program to implement a binary search tree data structure.
    //Write a Java program to find the prime numbers up to a given number.
    //Write a Java program to implement a red-black tree data structure.


    //THEORTICAL PARTS
    //What is the difference between wait and sleep methods in Java?
    //What is the difference between notify and notifyAll methods in Java?
    //What is a lambda expression in Java?
    //What is the difference between forEach and map methods in Java?
    //What is the difference between streams and collections in Java?
    //What is the difference between instanceof and isInstance methods in Java
    //What is the difference between hashCode and equals methods in Java?
    //What is the difference between ConcurrentHashMap and HashMap in Java?
    //What is the difference between ConcurrentHashMap and Hashtable in Java?
    //What is the difference between ConcurrentHashMap and SynchronizedMap in Java?
    //What is a class loader in Java?
    //What is reflection in Java?
    //What is the difference between annotation and comment in Java?
    //What is the difference between Callable and Runnable interfaces in Java?
    //What is the difference between Executor and ExecutorService in Java?
    //What is the difference between synchronized and volatile keywords in Java?
    //What is the difference between CopyOnWriteArrayList and ArrayList in Java?


    //What is a volatile keyword in Java?
    //What is the difference between a lambda expression and an anonymous class in Java?
    //What is a method reference in Java?
    //What is a hash table in Java?
    //What is a hash map in Java?
    //What is the purpose of the Java Native Interface (JNI)?
    //What are the different ways to create threads in Java?
    //What is the difference between composition and inheritance?
    //Explain the concept of the Factory design pattern in Java.
    //Explain the concept of serialization and deserialization in Java.
    //What are the different types of references in Java?
    //What are the different ways to handle concurrent modifications in Java?
    //Explain the concept of the Fork/Join framework in Java.
    //Explain the concept of method references in Java.
    //Explain the concept of the Observer design pattern in Java.
    //Explain the concept of the Adapter design pattern in Java.
    //Explain the concept of the Proxy design pattern in Java.
    //Explain the concept of the Builder design pattern in Java.



    //SPRING BOOT
    //Explain the concept of dependency injection in Spring Boot.
    //What are the different ways to configure properties in Spring Boot?
    //What is the purpose of the Spring Boot Starter POM?
    //Explain the concept of Spring Boot Logging.
    //Explain the concept of Spring Boot Bean Scopes.


    //MYSQL
    //What are the different data types supported by MySQL?
    //Explain the concept of ACID properties in database systems.
    //What is the purpose of indexing in MySQL?
    //What is the purpose of the GROUP BY clause in SQL?
    //Explain the difference between the CHAR and VARCHAR data types in MySQL.
    //What is the purpose of the HAVING clause in SQL?
    //Explain the concept of database normalization.
    //What is the purpose of the JOIN clause in SQL?
    // Explain the difference between INNER JOIN and OUTER JOIN in MySQL.
    //What is the purpose of the UNION operator in SQL?
    //Explain the concept of transactions in MySQL.
    //What is the purpose of the ORDER BY clause in SQL?
    //What is the purpose of the CASCADE keyword in MySQL?
    //What is the purpose of the ALTER TABLE statement in SQL?

    










    public static void main(String[] args) {
        System.out.println(5 / 2);//
        int x = 5;
        x += 3;
        System.out.println(x);
        double b = 3.14;
        System.out.println((int) b);
        System.out.println("hello".substring(2, 4));

        String name = "yavar";
        String reversedString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString = reversedString + name.charAt(i);
        }
        System.out.println(reversedString);
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = arr1;
        arr2[0] = 4;
        System.out.println(arr1[0]);

        //SUM OF AN ARRAY
        Integer[] numbers = {2,3,4,3,5,6,64,5,5,3,6,3};
        int sum = 0;
        for(int i = 0; i <numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("sum " + sum);


        //Write a Java program to find the largest number in an array.
        int[] laregstNo = {4,34,5,3,53,2,3};
        int maxNo = 0;
        for(int i=0; i <laregstNo.length; i++){
            if(laregstNo[i]>maxNo){
                maxNo = laregstNo[i];
            }
        }
        System.out.println("maxNo="+maxNo);
        //What is the output of the following code snippet: int x = 5; System.out.println(x++);?
        int xy = 5;
        System.out.println(xy++);
        //What is the output of the following code snippet: System.out.println(Math.round(2.5));?
        System.out.println(Math.round(2.5));

        //What is the output of the following code snippet: System.out.println("Hello".charAt(4));?
        System.out.println("hello".charAt(4));

        //Write a Java program to find the sum of the digits of a number.
        int num = 23;
        int sumOfDigit = 0;
        while(num>0){
            int rem = num%10;
            sumOfDigit = sumOfDigit+rem;
            num = num/10;
        }
        System.out.println( "sum of digit " + sumOfDigit);

        // What is the output of the following code snippet: System.out.println(Integer.parseInt("1010", 2));
        System.out.println(Integer.parseInt("1010", 2));
        //What is the output of the following code snippet: System.out.println("Hello".equals("hello"));?
         System.out.println("Hello".equals("hello"));
         //What is the output of the following code snippet: System.out.println("Hello World".toUpperCase());?
         System.out.println("Hello World".toUpperCase());
         //What is the output of the following code snippet: System.out.println("Hello World".replaceAll("l", "x"));?
         System.out.println("Hello World".replaceAll("l", "x"));







    }
}
