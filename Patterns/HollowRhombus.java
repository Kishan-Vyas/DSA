package Patterns;

import java.util.Scanner;

//    ****
//   *  *
//  *  *
// ****

public class HollowRhombus {
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
                if(i==0 || i==n-1 || j==0 || j== n-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
    }
}
