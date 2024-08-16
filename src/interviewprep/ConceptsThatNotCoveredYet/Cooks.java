package interviewprep.ConceptsThatNotCoveredYet;

public interface Cooks {
    // public void makeFood();


    default void hello(){
        System.out.println("in default method  ");
    }
}

