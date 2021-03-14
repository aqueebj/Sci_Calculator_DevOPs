package org.iiitb.Calculator;

import java.util.Scanner;

public class Sqroot {
    public void Sroot(){
        Scanner scan = new Scanner(System.in);
        double N;
        System.out.print("Welcome to Square Root Calculation\n");
        System.out.print("Please Enter your number:");
        N = scan.nextDouble();
        System.out.println("Square root of "+N+" is: "+Math.sqrt(N));
    }
    public double Sroot(double N){
        return Math.sqrt(N);
    }
}
