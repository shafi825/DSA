package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static int FindSecondlargest(int[] arr) throws IllegalArgumentException{
        if(arr == null || arr.length < 2){
            throw new IllegalArgumentException("Array cannot be null or less than two elemnets");
        }
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(SecondLargest, arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] > SecondLargest && arr[i] < largest){
                SecondLargest = arr[i];
            }
        }
        return SecondLargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data into Array");
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        try (sc) {
            System.out.println("Second Largest element is: "+FindSecondlargest(arr));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
