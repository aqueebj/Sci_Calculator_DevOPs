package org.iiitb.Calculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sqroot {
    private static final Logger slogger = LogManager.getLogger(Sqroot.class);
    public void Sroot(){
        Scanner scan = new Scanner(System.in);
        double N,S;
        System.out.print("Welcome to Square Root Calculation\n");
        System.out.print("Please Enter your number:");
        N = scan.nextDouble();
        slogger.info("[SQROOT] - " + N);
        S=Math.sqrt(N);
        slogger.info("[RESULT - SQROOT] - " + S);
        System.out.println("Square root of "+N+" is: "+S);
    }
    public double Sroot(double N){
        return Math.sqrt(N);
    }
}
