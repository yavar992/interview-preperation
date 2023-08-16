package interviewprep;


public class Multithreading  {
    public static void main(String[] args) {
        Thread thread =  new Thread(new MyRunnable("thread 1") );
        Thread thread2 = new Thread(new MyRunnable("thread 2"));

        thread.start();;
        thread2.start();

        System.out.println("main thread completes");
    }
}
