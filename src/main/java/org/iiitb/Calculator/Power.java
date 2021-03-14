package org.iiitb.Calculator;

import java.util.Scanner;

public class Power {
    public void power(){
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the number a and b (as a power b):");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(a+" power "+b+" is: "+Math.pow(a,b));
    }
}
