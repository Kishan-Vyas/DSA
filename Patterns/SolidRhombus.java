package Patterns;

import java.util.Scanner;

//    ****
//   ****
//  ****
// ****


public class SolidRhombus {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<n; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
