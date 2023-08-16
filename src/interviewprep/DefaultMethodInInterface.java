package interviewprep;

public interface DefaultMethodInInterface {

    public void name();

    String nameOfGarudian();

    public default int sum(int a , int b){
        return a+b;
    }

    static int tableOfTwo(int num){
        return num*2;
    }
}
