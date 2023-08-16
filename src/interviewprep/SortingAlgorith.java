package interviewprep;

import java.util.Arrays;

public class SortingAlgorith {

    public static void bubble(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length-i-1; j++) {
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    }

    //selection sort

   public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int smallest = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[smallest] > arr[j]) {
                smallest = j;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }
}




    public static void main(String[] args) {
            
        int [] arr = {4,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

        int[] selectionSort = {43,3,4,2,3,234,23,3};
        selectionSort(selectionSort);
        System.out.println(Arrays.toString(selectionSort));
    }
}
