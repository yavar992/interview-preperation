package interviewprep.ConceptsThatNotCoveredYet;


public class Students {

    private int id;

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
