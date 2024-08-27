
//find the Minimum and Maximum value of an Array
//HINT: read about INTEGER.MIN_VALUE and INTEGER.MAX_VALUE
import java.util.*;

public class maxandmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        System.out.println("Enter the number:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();

        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            } else if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum value is : " + min);
        System.out.print("Maximum value is : " + max);
    }
}
