package interviewprep;

import java.util.Comparator;
//SORTING THE CLASS ON THE BASIS OF PHONE NO
public class PhoneWiseShorting implements Comparator<Comaprator>{

    @Override
    public int compare(Comaprator o1, Comaprator o2) {
       return o1.getPhone().compareTo(o2.getPhone());
    }

}
