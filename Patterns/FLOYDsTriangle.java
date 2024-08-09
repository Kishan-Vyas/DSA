package Patterns;

import java.util.Scanner;

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 

public class FLOYDsTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        int number = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print((number++) + " ");
            }
            System.out.println();
        }
    }
}
