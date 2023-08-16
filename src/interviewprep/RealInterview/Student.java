package interviewprep.RealInterview;

import java.util.PrimitiveIterator;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Integer salary;

    public Integer id() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer salary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Student() {
    }

    public Student(Integer id, String name, String email, String password, Integer salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                '}';
    }


}
