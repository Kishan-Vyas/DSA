package Patterns;

import java.util.Scanner;

//    *
//   **
//  ***
// ****

public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++) {
                if(n-i-2 >= j ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
