package interviewprep.ConceptsThatNotCoveredYet;

import java.io.Serializable;

public class SingletonDesignPattern implements Serializable {

    //ways to break the singleton DesignPattern
    //1 - Using reflection -- we can manipulate the fields of the class using the reflection and change the accessibility of the class and then make the constructor that will lead to create a new object
    //2 - using serialization -- and deserialization -- first we will serialize the object and then deserialize the object that will lead to the creation of the new object and the method to compare if the both the object is equal or not is hashCode

    public static SingletonDesignPattern singletonDesignPattern;



     private SingletonDesignPattern(){
//         if (singletonDesignPattern!=null){
//             throw new RuntimeException("You are trying to break the singleton design pattern");
//         }
    }

    public static SingletonDesignPattern getSingletonDesignPattern(){

         if (singletonDesignPattern == null){
              singletonDesignPattern = new SingletonDesignPattern();
         }
         return singletonDesignPattern;
    }

}


