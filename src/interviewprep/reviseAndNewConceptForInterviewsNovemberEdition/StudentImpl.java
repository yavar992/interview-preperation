package interviewprep.reviseAndNewConceptForInterviewsNovemberEdition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentImpl {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("yavar",20,5500));
        students.add(new Student("anas",19,3500));
        students.add(new Student("zubair",15,5600));
        students.add(new Student("aasu",23,9800));
        students.sort(new Student());
        System.out.println(students);
    }
}
