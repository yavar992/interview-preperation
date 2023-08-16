package interviewprep;

import java.util.function.IntBinaryOperator;

public class LemdaExpression {
    //lemda expression
    public static void main(String[] args) {
        IntBinaryOperator sumOfTwOnO = (a,b)->a+b;
        //lemda expression
        int result1 = sumOfTwOnO.applyAsInt(4, 5);
        System.out.println(result1);
        
    }
}
