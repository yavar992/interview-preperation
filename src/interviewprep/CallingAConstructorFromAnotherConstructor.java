package interviewprep;

/**
 * CallingAConstructorFromAnotherConstructor
 */
public class CallingAConstructorFromAnotherConstructor {

    int num;
    String name;

    public CallingAConstructorFromAnotherConstructor(){
        this(0, "yavar");
    }

    public CallingAConstructorFromAnotherConstructor(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public static void main(String[] args) {
        
        CallingAConstructorFromAnotherConstructor callingAConstructorFromAnotherConstructor = new CallingAConstructorFromAnotherConstructor();
        callingAConstructorFromAnotherConstructor.name = "Calling";
        System.out.println(callingAConstructorFromAnotherConstructor.name);

            
    }
}