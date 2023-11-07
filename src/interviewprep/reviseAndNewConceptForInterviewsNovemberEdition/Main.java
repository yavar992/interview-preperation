package interviewprep.reviseAndNewConceptForInterviewsNovemberEdition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("shams",25,4543));
        students.add(new Student("aasu",24,4543));
        students.add(new Student("anas",12,4543));
        students.add(new Student("shadab",52,4543));
        students.add(new Student("yavar",42,6543));

        System.out.println(students.stream().map(std->std.age()>24).collect(Collectors.toList()));
    }
}
