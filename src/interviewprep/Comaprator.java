package interviewprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comaprator implements Comparator<Comaprator> {
    //COMPARATOR IS FOR MULTIPLE SORTING LOGIC WE CAN COMPARE OUR OBJECT OR SORT OUR OBJECT BY NAME ID OR ANY FIELDS OF THE CLASS 
    int id;
    String name;
    String phone;

    public Comaprator(){

    }

    public Comaprator(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Comaprator [id=" + id + ", name=" + name + ", phone=" + phone + "]";
    }

    @Override    //SORTING THE OBJECT ID WISE
    public int compare(Comaprator o1, Comaprator o2) {
        return o1.id - o2.id;
    }

    // @Override  //COMPARING THE OBJECT NAME WISE 
    // public int compare(Comaprator o1, Comaprator o2) {
    //     return o1.name.compareTo(o2.name);
    // }

    // @Override  //COMPARING THE OBJECT phone WISE 
    // public int compare(Comaprator o1, Comaprator o2) {
    //     return o1.phone.compareTo(o2.phone);
    // }

    public static void main(String[] args) {
        
        Comaprator c4 = new Comaprator(4, "zoo", "34");
        Comaprator c1 = new Comaprator(1, "aman", "434");
        Comaprator c2 = new Comaprator(2, "kuldeep", "456");
        Comaprator c9 = new Comaprator(9, "sharma", "789");
        Comaprator c3 = new Comaprator(3, "nalayak", "9");

        ArrayList<Comaprator> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c9);
        Collections.sort(c, new Comaprator());
        System.out.println(c);


        ArrayList<Comaprator> list2 = new ArrayList<>();
        list2.add(new Comaprator(2, "chahal", "101"));
        list2.add(new Comaprator(1, "sharma", "98"));
        list2.add(new Comaprator(3, "chahal", "83"));
        list2.add(new Comaprator(9, "kohli", "02"));
        list2.add(new Comaprator(4, "kuldeep", "83"));
        list2.add(new Comaprator(5, "raina", "99"));
        Collections.sort(list2, new Comaprator());
        System.out.println( "PHONE WISE SORTING " +  list2);
    }
    
}
