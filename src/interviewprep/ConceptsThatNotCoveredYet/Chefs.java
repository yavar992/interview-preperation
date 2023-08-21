package interviewprep.ConceptsThatNotCoveredYet;

public class Chefs {
    public static void main(String[] args) {
        Cooks myCook = () -> {
            System.out.println("Cooking something delicious!");
        };

        myCook.makeFood();
    }
}
