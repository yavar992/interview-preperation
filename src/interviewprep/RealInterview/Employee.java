package interviewprep.RealInterview;


import java.util.Comparator;

public class Employee implements Comparator<Employee> {

    private Integer id;
    private String name;
    private String email;
    private Integer age;

    public Employee(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee() {
    }

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

    public Integer age() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.name);
//    }

        @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }



//    @Override // sort by the age
//    public int compare(Employee o1, Employee o2) {
//        return o1.age.compareTo(o2.age);
//    }
}
