package interviewprep.ConceptsThatNotCoveredYet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractClass {

    public static int[] findTwoSum(int[] nums, int target) {
        int[] result = new int[2]; // Initialize the result array to store the indices of the two elements

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start the inner loop from i+1 to avoid using the same element twice
                if (nums[i] + nums[j] == target) {
                    result[0] = i; // Store the index of the first element in the result array
                    result[1] = j; // Store the index of the second element in the result array
                    return result; // Return the result array with the indices
                }
            }
        }

        return null; // Return null if no such pair is found
    }

    public static void main(String[] args) {
        int[] prob = {4,2,6,2,6,7,9,12};
        int target = 13;
        int[] result = findTwoSum(prob , target);
        System.out.println(Arrays.toString(result));
        List<Integer> input = Arrays.asList(2,4,5,7);
        List<Integer> answer = findMissingNumber(input);
        System.out.println(answer);
        
    }

    public static List<Integer> findMissingNumber(List<Integer> list){
        List<Integer> elements = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> missingNumbers = new ArrayList<>();

        for (Integer element : elements) {
            if (!list.contains(element)) {
                missingNumbers.add(element);
            }
        }
        return missingNumbers;
    }


}
