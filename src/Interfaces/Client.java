/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // User Menu 
            System.out.println(
                    "\n1.Addition\n2.Substraction\n3.multiplication\n4.division\n5.Exit");
            System.out.println("Enter the option:");
            int opt = sc.nextInt();
            if (opt == 5) {
                break;
            }
            System.out.println(
                    "Enter the the first number:");
            int a = sc.nextInt();
            System.out.println("Enter the second number:");
            Integer b = sc.nextInt();
            Integer n;
            switch (opt) {                 
                case 1:
                    // lookup method to find reference of remote 
                    // object 
                   calculadoraCliente obj
             = (calculadoraCliente)Naming.lookup("ADD");
                    n = obj.suma(a, b);
                    System.out.println("Addition= " + n);
                    break;
                case 2:
                    calculadoraCliente obj1
                            = (calculadoraCliente) Naming.lookup("ADD");
                    n = obj1.resta(a, b);
                    System.out.println("Substaction= " + n);
                    break;
                case 3:
                    calculadoraCliente obj2
                            = (calculadoraCliente) Naming.lookup("ADD");
                    n = obj2.multiplicacion(a, b);
                    System.out.println("Multiplication = " + n);
                    break;
                case 4:
                    calculadoraCliente obj3
                            = (calculadoraCliente) Naming.lookup("ADD");
                    n = obj3.division(a, b);
                    System.out.println("Division = " + n);
                    break;
            }
        }
    }
}
