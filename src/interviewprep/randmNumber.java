package interviewprep;

/**
 * randmNumber
 */
public class randmNumber {

    public static void main(String[] args) {
        
        Double randomNumber = Math.random() * 9000 + 1000;
        System.out.println(randomNumber);
        int otp = (int) ((Math.random() * 9000) + 1000);
        System.out.println(otp);

        int randomNo = (int)  ((Math.random()*900000)+1000);
        System.out.println(randomNo);
    }
}