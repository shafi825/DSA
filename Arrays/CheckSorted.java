package Arrays;

import java.util.Scanner;

public class CheckSorted {
    public static Boolean isSorted(int[] arr){
	if(arr.length==1){
		return true;
	}

	for(int i=0;i<arr.length-1;i++){
		if(arr[i]>arr[i+1]){
		  return false;
		}
	}

	return true;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Data for the Array");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (isSorted(arr)) {
            System.out.println("Given Array is Sorted");
        } else {
            System.out.println("Given array is Not Sorted");
        }

    }
}
