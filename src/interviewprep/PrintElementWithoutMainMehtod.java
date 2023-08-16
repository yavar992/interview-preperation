package interviewprep;

public class PrintElementWithoutMainMehtod {
public static void main(String[] args) {
    
String name1 = "yavar";
String name2 = "yavar";
String name3 = new String("yavar");

System.out.println("comparing the value assign to the each variable in the programm using the == operator " + name1==name3);
System.out.println("comparing the value assign to the each variable in the programm using the == operator " + name1==name2);
System.out.println("comparing the refence variable of the variable in the programm using the .equal method " + name1.equals(name3));


}
}
