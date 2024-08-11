package Patterns;

import java.util.Scanner;

//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 

public class NumberPyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<n-i-1) {
                    System.out.print(" ");
                }   
                else {
                    System.out.print(i+1 + " ");
                }
            }
            System.out.println();
        }
    }
}
