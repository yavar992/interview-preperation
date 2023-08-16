package interviewprep.RealInterview;

import java.util.HashMap;

public class CityBankInterview { //7 year experience
    public static void main(String[] args) {
        //what is base class and diff b/ interface anc the abstract class
        //functional interface
        //diff b/w int i = 9 and int i =09; ans-- you will get the compilation error because byDefault java use the decimal number system and 09 is a octal number and even this is not a octal number
        //becoz octal number is from the 0-7 only
        //internal implementation of the hashmap
        //what is rehasing in java and what is the criteria for the hashmap , can string or StringBuilder can be key in the hashmap
        //what is the fail-fast and fail safe in the collection
        //what will happen when we update the key in the hashmap when we are using the StingBuilder as key
        // how long stack and the heap memory remains - ? stack memory automaticlly reclaims when the method return coz method calls or frane stores in the stack memiry and
        //once the jvm jvm stopped the heap memory will be released from the heap area and also when also when some refernce variable are not using in the programm they will be removed by the garbage collector from the heap
        // WHAT IS THE MARKER INTERFACE IN THE JAVA - ?
        //marker interface is the interface which doesn't have any merhod in the interface and is used for the
        //internal implementation of the hashmap -- it internally use the linkdedlIST To store the key and values
        //diff b/w hasmap and the concurrent-hashmap
        //11 - why do we prefer String as key in the hashmap - ?
        // diff scopes in the spring

        int i = 9;
        int b = 05;// 09 will give the compilation error

        int s= 94_2342;
        System.out.println(s);
        HashMap<StringBuilder , Integer> hashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder("Yavar");
        hashMap.put(stringBuilder ,3);
        hashMap.put(stringBuilder.append("Yavar") , 5);
        hashMap.put(stringBuilder.append("") , 4);
        System.out.printf(String.valueOf(hashMap));

        Integer ac = 34;
        String cd ="434";
        String acd = String.valueOf(ac);
        Integer AS = Integer.valueOf(cd);

        //syntex of the hashmap
//        HashMap<keyType , valueType> hashMap = new HashMap<keyType, valueType>();
//        HashMap<StringBuilder ,Integer> hashMap = new HashMap<>();
//        we can use the StringBuilder as the keyType in the hashMap but it's not recommanded to use the StringBuilder as the keyType becoz StringBuilder can be modified and the don't override the equal and hascode method of the object class
        //hashmap - in the hashmap evey key should be unique and the key can be unique and value also can be unique and String can be key in the hashmap

        // suppose if uh have the any object assign with the null value so now tell me how much space it will takeof the memory -?
        // 4 bytes on the 32 b-bit system and 8 bytes on the 64 bits system

        //q - why do we use wrapper class with the collection not the primtive
        //        ans- becoz collection doesn't support the primitive data types , colllection onkly works with the objects that's why
    }
}
