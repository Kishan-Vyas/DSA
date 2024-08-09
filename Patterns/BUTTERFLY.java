package Patterns;

import java.util.Scanner;

// *             * 
// * *         * * 
// * * *     * * * 
// * * * * * * * * 
// * * * * * * * * 
// * * *     * * * 
// * *         * * 
// *             * 

public class BUTTERFLY {
    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n*2; j++) {
                if(j>i && j<(n*2)-i-1) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        } 
        for(int i=0; i<n; i++) { 
            for(int j=0; j<n*2; j++) {
                if(j>n-i-1 && j<(n*2)-(n-i)) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
