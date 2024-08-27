import java.util.*;

public class printNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size Array of names:" + " ");
        int size = sc.nextInt();
        String names[] = new String[size];
        // Input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the names:" + " ");
            names[i] = sc.next();
        }
        // Output
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
