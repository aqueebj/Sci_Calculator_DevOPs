package org.iiitb.Calculator;

import java.util.Scanner;

public class Sqroot {
    public void Sroot(){
        Scanner scan = new Scanner(System.in);
        double N;
        System.out.print("Enter the number:");
        N = scan.nextDouble();
        System.out.println("Square root of "+N+" is: "+Math.sqrt(N));
    }
    public double Sroot(double N){
        return Math.sqrt(N);
    }
}
