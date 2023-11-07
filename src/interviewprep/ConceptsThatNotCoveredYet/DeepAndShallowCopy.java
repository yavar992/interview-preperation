package interviewprep.ConceptsThatNotCoveredYet;

public class DeepAndShallowCopy {
    int x;
    int y;

    public DeepAndShallowCopy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        DeepAndShallowCopy shallowCopy = new DeepAndShallowCopy(12,10);
        //shallow copy
        DeepAndShallowCopy deepAndShallowCopy1 = shallowCopy;
        deepAndShallowCopy1.x = 43;
        System.out.println("original objects :" + shallowCopy.x);
        System.out.println("shallow copy :" + deepAndShallowCopy1.x);
        //changes made via to the shallow copy will reflect the changes into the original objects

        //deep copy
        DeepAndShallowCopy deepAndShallowCopy2 = new DeepAndShallowCopy(shallowCopy.x, shallowCopy.y);
        deepAndShallowCopy2.x = 56;
        System.out.println("original objects: " + shallowCopy.x);
        System.out.println("deep copy: " + deepAndShallowCopy2.x);
        //changes made via to the deep copy will not relate to the original objects
    }
}
