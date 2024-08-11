package Patterns;

import java.util.Scanner;


//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *

public class DimandPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<(n*2)-1; j++) {
                if(j < n-i-1) { 
                    System.out.print(" ");
                }
                else if(j<n+i){
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<2*n-1; j++) {
                if(j<=i) {
                    System.out.print(" ");
                }
                else if(j< (n*2)-i-2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}