package interviewprep;

public class MyRunnable implements Runnable{

    private final String name;

  
    
    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("thread " + name + "is running");
        for (int i = 1; i <= 5; i++) {
            System.out.println("thread " + name + " :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException  e) {
                e.getMessage();
            }
        }
        System.out.println("Thread " + name + " Completed");

    }
    public static void main(String[] args) {
        
    }

}