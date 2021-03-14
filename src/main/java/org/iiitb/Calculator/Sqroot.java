package org.iiitb.Calculator;

import java.util.Scanner;

public class Sqroot {
    public void Sroot(){
        Scanner scan = new Scanner(System.in);
        int N;
        System.out.print("Enter the number:");
        N = scan.nextInt();
        System.out.println("Square root of "+N+" is: "+Math.sqrt(N));
    }
}
