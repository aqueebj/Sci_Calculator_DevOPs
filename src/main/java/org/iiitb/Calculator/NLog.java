package org.iiitb.Calculator;
import java.lang.Math;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NLog {
    private static final Logger nlogger = LogManager.getLogger(NLog.class);
    public void Log(){
        Scanner scan = new Scanner(System.in);
        double N,ln;
        System.out.print("Welcome to Natural Log Calculation\n");
        System.out.print("Please Enter your number:");
        N = scan.nextDouble();
        nlogger.info("[NLog] - " + N);
        ln=Math.log(N);
        nlogger.info("[RESULT - NLog] - " + ln);
        System.out.println("Natural Log of "+N+" is: "+ln);
    }
    public double Log(double a){

        return Math.log(a);
    }
}
