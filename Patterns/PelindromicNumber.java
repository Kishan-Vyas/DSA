package Patterns;

import java.util.Scanner;

//    1
//   212
//  32123
// 4321234

public class PelindromicNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n*2-1; j++) {
                if(j < n-i-1) {
                    System.out.print(" ");
                }
                else if(j<n) {
                    System.out.print(n-j);
                }
                else if(j < n+i) {
                    System.out.print(j-n+2);
                }
            }
            System.out.println();
        }
        
    }
}
