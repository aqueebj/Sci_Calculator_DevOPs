package org.iiitb.Calculator;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String [] args){
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("##########################################");
        System.out.println("#### Welcome to Scientific Calculator ####");
        System.out.println("##########################################\n");
        do {
            System.out.println("#### Options ####");
            System.out.println("1 for Factorial\n2 for Natural Log\n3 for Power\n4 for Square Root\n5 for exit\n");
            System.out.print("Please Enter your choice: ");
            try {
                choice = scan.nextInt();
                while (choice > 5 || choice < 1) {
                    System.out.println("Invalid choice, Try Again...\n");
                    System.out.print("Please Enter your choice: ");
                    choice = scan.nextInt();


                }
            }
            catch (InputMismatchException error) {
                System.out.println("Error: " + error.toString());
                return;
            }
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
                    case 5:System.out.println("Thank You, Exiting...\n");
                            break;
            }

            System.out.println("\n");
        }while(choice!=5);
    }

}
