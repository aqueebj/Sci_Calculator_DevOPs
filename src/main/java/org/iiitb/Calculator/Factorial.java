package org.iiitb.Calculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Factorial {
    private static final Logger flogger = LogManager.getLogger(Factorial.class);
    public void Fact(){
        Scanner scan = new Scanner(System.in);
        int i,number,fact=1;
        System.out.print("Welcome to Factorial Calculation\n");
        System.out.print("Please Enter your number:");
        number = scan.nextInt();
        flogger.info("[FACTORIAL] - " + number);
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        flogger.info("[RESULT - FACTORIAL] - " + fact);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
    public int Fact(int a){
        int fact=1,i;
        for(i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
}
