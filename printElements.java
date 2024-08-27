//Taking an array as input print its elements

import java.util.*;
public class printElements{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array:"+ " ");
        int size = sc.nextInt();
        int [] elements = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the Elements:"+ " ");
            elements[i] = sc.nextInt();
        }
        for(int i=0; i<elements.length; i++){
         System.out.print(elements[i]+ " ");
        }
    } 
}
