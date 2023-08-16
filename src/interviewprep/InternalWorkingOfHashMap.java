package interviewprep;

import java.util.HashMap;
import java.util.Iterator;

public class InternalWorkingOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer , String> hashMap = new HashMap<>();
        hashMap.put(1 , "String");
        hashMap.put(2,"hi");
        hashMap.put(4,"numerical");
        System.out.printf(hashMap.toString());
        hashMap.remove(2);
        System.out.printf(hashMap.toString());
        System.out.printf(String.valueOf(hashMap.containsKey(3)));
        System.out.printf(String.valueOf(hashMap.size()));
        System.out.printf(hashMap.keySet().toString());
        System.out.println(hashMap.get("string"));
                //put get contains remove size keySet
    }
}
