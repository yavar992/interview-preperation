package interviewprep;

public abstract class DiffBwInterfaceAndAbstractClass {
 
    int a;
    String name;

    public DiffBwInterfaceAndAbstractClass(int a, String name) {
        this.a = a;
        this.name = name;
    }
    
    public DiffBwInterfaceAndAbstractClass(){

    }

    public abstract void name();

   public abstract void getAddress();

   public abstract String getName(String name);

   protected abstract int getNo(int no);

   abstract String getFatherName();

   protected abstract void hello();


   public final static String REGEX_EXPRESSION = "39UIDHE8923!@71928";
    
// we can have all type of method in the abstract class except the private 
// IN INTERFACE WE HAVE ALL THE METHOD AS PUBLIC AND STATIC BY DEFAULT ALL THE METHOD ARE PUBLIC

// WE CANNOT INITIATE NOR INTERFACE NOR THE ABSTRACT CLASS BUT A ABSTRACT CAN HAVE THE CONSTRUCTOR BUT A INTERFACE CANNOT HAVE 
// WE CAN HAVE ABSTRACT AND NON ABSTRACT IN ABSTRACT CLASS BUT IN THE INTERFAC ALL THE METHODS ARE ABSTRACT ND STATIC 

// WE CAN IMPLEMENT MORE THAN ONE INTERFACE IN CLASS THAT ACHIVE THE MULTIPLE INHERITENCE IN JAVA BUT WE CAN EXTEND ONLY ONE CLASS ABSTRACT CLASS IN ANY CLASS\

//WE USE INTERFACE TO ACHIEVE ABSTRACTION 

}
