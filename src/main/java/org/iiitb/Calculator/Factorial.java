package org.iiitb.Calculator;

import java.util.Scanner;
public class Factorial {
    public void Fact(){
        Scanner scan = new Scanner(System.in);
        int i,number,fact=1;
        System.out.print("Enter the number:");
        number = scan.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
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
