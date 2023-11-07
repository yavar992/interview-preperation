package interviewprep.RealInterview;

import interviewprep.Comaprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Infosysinterview {
    public static void main(String[] args) {
        // 1- use of this keyword and super keyword in java
        // ans - this keywords refers to the current class data member and super class refers to the super class or parents class data members
        // 2 - objects class method - equal , clone , hashcode and toString , wait and notify
        //3 - can uh override a private or static method in java - no we cannot override the private or static method in java becoz static belongs to the class and the private method limit the method to be overridden
        //4 -use of final , finally and finalize keyword in java --- final is a keyword that prevent the method variable modification , and also final keyword prevent the extending og the class to the child clas and finally is the keyword of exception in the java which finally is a block in the exception which where we tell in the exception what to do in the finally block and it will execute after the throw of exception
        // or finally is used with the try and catch block and it used to define the code of block that will be execute regardless of whether a exception throws or not and finalize is the method which will execute when the garbage collector free ups the memory it or it is used by the garbage collector before reclaming the memory
        // 5 - why string is immutable in java
        //6 - what is generics in java - generics enhance the type safety and resuability of the code , generics allow uh to work with the classes , interface and method with the other types of method , class and method bascailly geenricd enable uh tow work with the diff types class , methods and intrface perameter it makes our prorgamm more modular and resuaable and more readable
        //7- diff b/w normal hashmap and the concurrent hashmap in java
        //8 -default size of the arrayList is 10
        //9 - how dp uh sort the collection
        //10- diff b/w StringBuilder , String and StringBuffer - String -> String is the immutable so we used String to store the array of char and since it's immutable it's is more secure and safe and coming to the StringBuilder so StringBuilder is mutable and is not thread safe and nor synchronization bt it's fast becoz of bot being synchronization and now coming to the StringBuffer it's thread safe and synchrnization so when uh are oring in a multiple thread environmnt it's better to use StringBufffer bt being synchronization this make ut slow
        //11 - why do we prefer String as key in the hashmap - ?
        //you have a list of employee with some fields like id , name , email aga and many more nor uh have to find out the all employee whose age is more than 35;


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"yavar","yavarhkhan8923@gmail",34));
        employees.add(new Employee(1,"aamir","yavarhkhan8923@gmail",43));
        employees.add(new Employee(1,"anas","yavarhkhan8923@gmail",23));
        employees.add(new Employee(1,"shameem","yavarhkhan8923@gmail",21));
        employees.add(new Employee(1,"julfikar","yavarhkhan8923@gmail",54));
        employees.add(new Employee(1,"cat","yavarhkhan8923@gmail",12));
        employees.sort(new Employee());
        System.out.println(employees);
        List<Employee> employees1 = employees.stream().filter(i->i.age()<34).collect(Collectors.toList());
        System.out.println(employees1);

        //why do we use the functional Expression
        // which feature of interface introduced in java
        // suppose you have the two interface with the same method now tell me when uh implements the both the interface in a class so what will happened and which one interface will executed - java will implements the only methods of both the class , basically java treats them as the same method during the implementation
        // diff scopes in the spring and how u will implement
        // what are the advantages of spring boot when  already we have spring framework
        // restController
        //how do uh change the server port = server.port = ?

    }
}
