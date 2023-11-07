package interviewprep.java8;

@java.lang.FunctionalInterface
public interface FunctionalInterface {

    String doSomething(String a , String b);

    //we can declare the functional interface in java ..a functional interface is which has only one abstract method and if you try to
    // add more than one method in a functional interface you will end up having a compile time error

//    void hello();  this method will cause the compile time error because of it's violating the rule which state that  interface can have only one abstract method

    default String hi(String ab){
        return ab;
    }

    static int sum(int a , int b){
        return a+b;
    }

    //but we can have nth number of static and default method in our functional interface -- imp

}
