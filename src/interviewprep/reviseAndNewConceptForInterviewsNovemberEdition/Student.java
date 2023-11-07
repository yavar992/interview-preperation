package interviewprep.reviseAndNewConceptForInterviewsNovemberEdition;

import java.util.Comparator;

// make a student class with some fields and sort the student data by the salary or by their ages
public class Student implements Comparator<Student> {

//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.age - o2.age;
//    }

    public int compare(Student o1 , Student o2){
        return o1.name.compareTo(o2.name);
    }

    private String name;
    private Integer age;
    private Integer expenditure;

    public Student() {

    }

    public Student(String name, Integer age, Integer expenditure) {
        this.name = name;
        this.age = age;
        this.expenditure = expenditure;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer age() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer expenditure() {
        return expenditure;
    }

    public void setExpenditure(Integer expenditure) {
        this.expenditure = expenditure;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", expenditure=" + expenditure +
                '}';
    }
}
