//check a given array is sorted or not

import java.util.*;
public class isAscending {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size");
    int size= sc.nextInt();
    int number[] = new int[size];
    //input
    for(int i=0; i<size; i++) {
     System.out.println("Enter number");
     number[i] = sc.nextInt();
    }
    //output
    boolean isAscending = true;
    for(int i=0; i<number.length-1; i++) {
        if(number[i]>number[i+1]){
            isAscending = false;
        }
    }
    if(isAscending){
        System.out.println("Array is in Sorted order");
    }
    else{
        System.out.println("Array is in unsorted Array");
    }
 }
}
