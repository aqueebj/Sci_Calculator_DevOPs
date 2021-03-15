package org.iiitb.Calculator;
import java.lang.Math;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Power {
    private static final Logger plogger = LogManager.getLogger(Power.class);
    public void power(){
        Scanner scan = new Scanner(System.in);
        double a,b,p;
        System.out.print("Welcome to Power Calculation\n");
        System.out.print("Please Enter the number a and b (as a power b):");
        a = scan.nextDouble();
        b = scan.nextDouble();
        plogger.info("[POWER] - " + a+", "+b);
        p=Math.pow(a,b);
        plogger.info("[RESULT - FACTORIAL] - " + p);
        System.out.println(a+" power "+b+" is: "+p);
    }
    public double power(double a, double b){
        return Math.pow(a,b);
    }
}
