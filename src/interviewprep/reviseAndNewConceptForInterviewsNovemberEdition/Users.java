package interviewprep.reviseAndNewConceptForInterviewsNovemberEdition;

import java.util.PrimitiveIterator;

public class Users implements Comparable<Users>{

    private Integer age;
    private String name;
    private Integer expenditure;

    public Users(Integer age, String name, Integer expenditure) {
        this.age = age;
        this.name = name;
        this.expenditure = expenditure;
    }

    public Users(){

    }

    public Integer age() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer expenditure() {
        return expenditure;
    }

    public void setExpenditure(Integer expenditure) {
        this.expenditure = expenditure;
    }

    @Override
    public String toString() {
        return "Users{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", expenditure=" + expenditure +
                '}';
    }

    @Override
    public int compareTo(Users o) {
        return this.expenditure - o.expenditure;
    }
}
