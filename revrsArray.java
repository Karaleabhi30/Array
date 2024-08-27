//reverse array
import java.util.*;
public class revrsArray {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size");
    int size = sc.nextInt();
    int array[] = new int[size];
    //input
    for(int i=0; i<size; i++){
        System.out.println("Enter array");
        array[i] = sc.nextInt();
    }
    //output
    for(int i=array.length-1; i>=0; i--){
        System.out.print(array[i]+" ");
    }
   } 
}