package interviewprep.reviseAndNewConceptForInterviewsNovemberEdition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsersImpl{

    public static void main(String[] args) {
        List<Users> users = new ArrayList<>();
        users.add(new Users(22,"Yavar",6500));
        users.add(new Users(25,"shams",7500));
        users.add(new Users(24,"khalid",2300));
        users.add(new Users(23,"anas",7600));
        Collections.sort(users);
        System.out.println(users);
    }
}
