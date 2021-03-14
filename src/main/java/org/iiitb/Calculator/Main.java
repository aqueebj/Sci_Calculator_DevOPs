package org.iiitb.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int choice, flag=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("##########################################");
        System.out.println("#### Welcome to Scientific Calculator ####");
        System.out.println("##########################################\n");
        do {
            System.out.println("#### Options ####");
            System.out.println("1 for Factorial\n2 for Natural Log\n3 for Power\n4 for Square Root\n Press any other key to exit\n");
            System.out.print("Please Enter your choice: ");
            choice = scan.nextInt();
            if (choice > 4 || choice <1) {
                flag = 1;
                System.out.println("Invalid choice, Exiting...\n");
            }
            else if (flag != 1){

                switch(choice) {
                    case 1:Factorial factorial=new Factorial();
                            factorial.Fact();
                            break;
                    case 2:NLog nLog= new NLog();
                            nLog.Log();
                            break;
                    case 3:Power power=new Power();
                            power.power();
                            break;
                    case 4:Sqroot sqroot=new Sqroot();
                            sqroot.Sroot();
                            break;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }

}