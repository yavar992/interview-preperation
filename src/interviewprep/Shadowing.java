package interviewprep;

public class Shadowing {
    
            int a = 20;  // VARIABE WITH THE LOW LEVEL SCOPE 

    public static void main(String[] args) {
        
        {
            int a = 30;  // VARIABE WITH THE HIGH LEVEL SCOPE 
            System.out.println(a);
            // THIS IS CALLED SHADWING IN THE JAVA LOW LEVEL SCOPE IS SHADOWED BY THE HIGH LEVEL SCOPE
            // System.out.println(a);
            String s = "java";
            System.out.println(s=="ja"+"va");
            System.out.println(s.equals("ja"+"va"));
            System.out.println("ja" +"va");

            String d = "ja";
            String e = "va";
            System.out.println(d+e);
            System.out.println("ja"+"va");
        }
    }
}
