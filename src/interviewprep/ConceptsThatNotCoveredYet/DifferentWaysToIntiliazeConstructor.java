package interviewprep.ConceptsThatNotCoveredYet;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DifferentWaysToIntiliazeConstructor {
    private int a;
    private String b;

    public DifferentWaysToIntiliazeConstructor(int a, String b) {
        this.a = a;
        this.b = b;
    }


    {
        System.out.println("Instance initialization block executed");
    }
    static {
        System.out.println("static initialization block executed");
    }

    public DifferentWaysToIntiliazeConstructor() {
        this(1,"hello");
        System.out.println("Constructor executed");
    }

     public static void hello(){
        System.out.println("hello i am in methods");
    }

    public static String reverseString(String name){
        char[] chars = name.toCharArray();
        String answer = "";
        for (int i = name.length()-1; i>=0 ; i--) {
            answer = answer + chars[i];
        }
        return answer;
    }
    public  static void main(String[] args) {
        DifferentWaysToIntiliazeConstructor obj = new DifferentWaysToIntiliazeConstructor();
        hello();
        final Integer a = 23;
        final String name = "yavar";
      String ans = reverseString("yavar");
        System.out.println(ans);

        }
}

//method overriding is a concept in which child class or subclass provide it's own implementation of method which is already define in the parent or superclass
// and the real life example is like -- the way of doing a task by the child is different from it's parent way of doing the task
