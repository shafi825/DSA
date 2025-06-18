package Arrays;

import java.util.Scanner;

public class Largest {

    public static int FindLargest(int[] arr) throws IllegalArgumentException{
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be Null or Empty");
        }

        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){      //Core Logic
            if(arr[i] > Largest){
                Largest=arr[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data into Array");
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        try (sc) {
            System.out.println("The Largest Element is:"+FindLargest(arr));
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
