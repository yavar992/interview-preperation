package sem4;

import java.util.Arrays;

public class Unit1 {

    public static void main(String[] args) {
//        why java and what's java --
//        Access Modifier  --
//        public -- everywhere in the project
//        protected == Accessible within the same package and subclasses.
//        Provides a level of protection while allowing inheritance-based access.

        int[] num = {4, 5, 6, 2, 3, 2, 5};

        System.out.println(Arrays.toString(num));


//        1 A Discuss Exception?
//        ans --In Java, an exception is an event that disrupts the normal flow of a program's execution, usually due to errors like invalid input, resource unavailability, or arithmetic errors.
//        Exceptions can be handled using try-catch blocks to prevent the program from crashing.
//        Exception handling in Java is a mechanism to handle runtime errors, allowing a program to continue its normal flow. The key components of exception handling include:
//        Try Block: This block contains the code that might throw an exception. If an exception occurs, the flow of control is transferred to the corresponding catch block.
//        Catch Block: This block handles the exception. You can have multiple catch blocks to handle different types of exceptions.
//        Finally Block: This block contains code that will execute whether or not an exception occurs. It is typically used for cleanup activities like closing files or releasing resources.
//        Throw: This keyword is used to explicitly throw an exception, either a built-in one or a custom one.
//        Throws: This keyword is used in a method signature to indicate that the method might throw one or more exceptions.



//        Discuss Various Ways to Achieve Multithreading in Java

//        Multithreading in Java can be achieved in several ways:
//        Extending the Thread class:
//        You can create a new class that extends the Thread class and override its run() method. Then, create an instance of this class and call its start() method to begin the execution of a new thread
//        Implementing the Runnable interface
//Another way is to create a class that implements the Runnable interface and override its run() method. You can then create an instance of the Thread class and pass the Runnable object to its constructor.

//Discuss the Advantages of Multithreading---------------------
//        Improved Performance:
//        Multithreading allows multiple threads to execute concurrently, making better use of CPU resources, especially on multi-core processors.
//                Resource Sharing:
//        Threads can share resources like memory, reducing the overhead of creating separate processes.
//        Responsive User Interface:
//        In GUI applications, multithreading ensures that the user interface remains responsive even when performing time-consuming tasks in the background.
//        Better System Utilization:
//        Multithreading can lead to more efficient use of system resources by allowing multiple tasks to run simultaneously.
//                Asynchronous Processing:
//        Multithreading allows for tasks to be performed asynchronously, improving application responsiveness and throughput.
//        Parallel Processing:
//        In tasks like data processing, multithreading can divide the workload among multiple threads, leading to faster completion.




//        Discuss Thread in Java -----------------------
//        A thread in Java is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution in a program. Threads in Java allow concurrent execution of two or more parts of a program for maximum utilization of CPU.
//
//        Lifecycle of a Thread:
//        New: When a thread is created but not yet started.
//                Runnable: After the start() method is called, the thread is ready to run but may be waiting for CPU time.
//        Running: The thread is actively executing.
//                Blocked/Waiting: The thread is alive but not eligible to run because it is waiting for some resource or event.
//        Terminated: The thread has completed its execution.



        
    }


}