package interviewprep.RealInterview;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainMethod implements InterfaceA , InterfaceTwo{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"yavar","yavarkhan892300@gmail.com","pass1",5000));
        students.add(new Student(1,"yavar","yavarkhan892300@gmail.com","pass1",4000));
        students.add(new Student(1,"yavar","yavarkhan892300@gmail.com","pass1",3000));
        students.add(new Student(1,"yavar","yavarkhan892300@gmail.com","pass1",5000));
        students.add(new Student(1,"yavar","yavarkhan892300@gmail.com","pass1",2000));
        students.add(new Student(1,"yavar","yavarkhan892300@gmail.com","pass1",7000));
        // Increase the salary of all the student by 10 percent
     Student students1 = students.stream().filter(student -> student.salary()>3000).map(student -> new Student(
                student.id() ,
                student.name() ,
                student.email(),
                student.password() ,
                student.salary()*110/100
        ))
             .findFirst().orElse(null);
        System.out.println(students1);

        Student students2 = students.stream().filter(student -> student.salary()>3000).map(student -> new Student(
                        student.id() ,
                        student.name() ,
                        student.email(),
                        student.password() ,
                        student.salary()*110/100
                )).skip(1)
                .findFirst().orElse(null);
        System.out.println(students2);


        List<Integer> list = Arrays.asList(3,4,23,4,2,42,4,2,3);
        List<Integer> resultString  = list.stream().filter(a-> a>10).skip(0).limit(2).collect(Collectors.toList());
        System.out.println(resultString);
    }

    @Override
    public void doSomething() {

    }
}
