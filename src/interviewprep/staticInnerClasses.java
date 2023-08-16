package interviewprep;


public class staticInnerClasses {
    
    static String getText(){
        return "hello";
    }

    static class innerClass extends staticInnerClasses{
        static String getText(){
            return "world";
        }
    }

    public static void main(String[] args) {
        staticInnerClasses staticInnerClass = new staticInnerClasses();
        innerClass iClass = null;
        System.out.println(staticInnerClass.getText() + " " + iClass.getText());

        int a = 5;
        System.out.println(a++);
        System.out.println(++a);
    }
}
