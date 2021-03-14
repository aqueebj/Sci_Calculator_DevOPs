package org.iiitb.Calculator;
import java.lang.Math;
import java.util.Scanner;

public class NLog {
    public void Log(){
        Scanner scan = new Scanner(System.in);
        double N;
        System.out.print("Enter the number:");
        N = scan.nextDouble();
        System.out.println("Natural Log of "+N+" is: "+Math.log(N));
    }
    public double Log(double a){

        return Math.log(a);
    }
}
