package interviewprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator implements Comparable<ComparableAndComparator> {
    //WE USE COMPARABLE OPERATOR WHEN WE ARE USING ONLY SINGLE LOGIC  && AND WE CAN SORT OUR OBJECT USING ONLY SINGLE LOGIC
    int id;
    String name;
    String phone;

    public ComparableAndComparator(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public ComparableAndComparator() {
    }

    @Override
    public String toString() {
        return "ComparableAndComparator [id=" + id + ", name=" + name + ", phone=" + phone + "]";
    }

    //implements Comparable<ComparableAndComparator>


    public static void main(String[] args) {

        List<ComparableAndComparator> comparators = new ArrayList<ComparableAndComparator>();
        comparators.add(new ComparableAndComparator(1, "yavar", "8765"));
        comparators.add(new  ComparableAndComparator(43, "ali ", "8765") );
        comparators.add(new ComparableAndComparator(23, "anas", "6754543"));
        comparators.add(new ComparableAndComparator(12, "anuj", "7689"));
        Collections.sort(comparators);
        System.out.println(comparators);
    }

    @Override
    public int compareTo(ComparableAndComparator o) {
        return this.id - o.id;
    }
    
    
}
