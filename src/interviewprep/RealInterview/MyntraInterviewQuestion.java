package interviewprep.RealInterview;


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyntraInterviewQuestion {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("yavar",1200);
        map.put("shams",1300);
        map.put("abuxar",1300);
        map.put("shadab",1300);
        map.put("anas",4322);
        map.put("tabish",1500);
        map.put("aasu",1800);
        map.put("zubair",4555);




        Map.Entry<String ,Integer> result = findHighestSalary(map,4);
        System.out.println(result);

        int[] salary = {2333,1900,1200,4200,5400,3488,9900};
        //find the nth highest salary
        int higestSalary =  Arrays.stream(salary).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(higestSalary);
    }

    //FIND THE NTH HIGEST SALARY
    public static Map.Entry<String, Integer> findHighestSalary(Map<String,Integer> map, int nNumberOfHigestSalary ){
            return map.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(Collectors.toList()).get(nNumberOfHigestSalary);
    }
}
