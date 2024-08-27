
// // import java.util.Arrays;

// // public class foundidx {
// // public static void main(String[] args) {
// // int a[] = { 2, 2, 8, 7, 9, 8, 6, 7 };
// // int temp;
// // for (int i = 1; i < 8; i++) {
// // int current = arr[i];
// // int j = i - 1;
// // while (j >= 0 && arr[j] > current) {
// // // keep swaping
// // arr[j + 1] = arr[j];
// // j--;
// // }
// // arr[j + 1] = current;
// // }
// // for (int i = 0; i < 8; i++) {
// // System.out.print("\t" + a[i]);
// // }
// // }
// // }

// /**
//  * foundidx
// //  */
// // public class foundidx {
// //     public static void main(String[] args) {
// //         int a[] = { 5, 2, 7, 9, 11 };
// //         boolean isAscending = true;
// //         for (int i = 0; i < a.length; i++) {
// //             if (a[i] > a[i + 1]) {
// //                 System.out.println("not ascending");
// //                 break;
// //             } else {
// //                 System.out.println(isAscending);
// //                 break;
// //             }
// //         }

// //     }

// // }

// /**
//  * foundidx
//  */
// public class foundidx {

//     public static void main(String[] args) {
//         int a[] = { 5, 7, 85, 7, 9, 2 };
//         int min = a[0];
//         int max = a[0];
//         for (int i = 1; i < a.length; i++) {
//             if (min > a[i]) {
//                 min = a[i];
//             } else if (max < a[i]) {
//                 max = a[i];
//             }
//         }
//         System.out.println("min= " + min);
//         System.out.println("max=" + max);
//     }
// }

/**
 * foundidx
 */
// public class foundidx {

//     public static void main(String[] args) {
//         int a[] = { 5, -6, 9, 8, -3, -4, 7, -8 };
//         int pos = 0, neg = 0;
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] > 0) {
//                 pos = pos + a[i];
//             } else {
//                 neg = neg - a[i];
//             }
//         }
//         System.out.println("Sum of postive integers of an array is : " + pos);
//         System.out.println("Sum of negative integers of an array is : " + neg);
//     }
// }

// import java.util.Arrays;

/**
 * foundidx
 */
// public class foundidx {

//     public static void main(String[] args) {
//         int a[] = { 5, 97, 6, 3, 7, 2, 1 };
//         // for (int i = 0; i < a.length; i++) {
//         // if (a[i] > a[i + 1]) {
//         // int temp = a[i];
//         // a[i] = a[i + 1];
//         // a[i + 1] = temp;
//         // }
//         // }
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] > a[i + 1]) {
//                 // swap
//                 int temp = a[i];
//                 a[i] = a[i + 1];
//                 a[i + 1] = temp;
//                 System.out.println(a[i]);
//             }
//         }
//     }
// }

/**
 * foundidx
 */
public class foundidx {

    public static void main(String[] args) {
        int a[] = { 2, 8, 5, 6, 4, 9, 1 };
        int left = a[0];
        int right = a.length - 1;
        // int mid = (left + right) / 2;
        int mid = left + (right - left) / 2;
        int target = 9;

        // int index = (a, target);

        for (int i = 0; i < a.length - 1; i++) {
            if (target < mid) {
                right = mid - 1;

                // System.out.println(target + "found at index" + a[i]);
            } else if (target > mid) {
                left = mid + 1;
                // System.out.println(target + "found at index" + a[i]);
            } else {
                System.out.println("not found");
            }
        }
        System.out.println(target);

    }
}