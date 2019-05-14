/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Adrian
 */
import java.util.Scanner;
import java.lang.Exception;



public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double wynik = 0;
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();
            System.out.println("Podaj drugą liczbę: ");
                double b = sc.nextDouble();
                sc.nextLine();
            System.out.println("Podaj znak działania, które chcesz wykonać (+ - * / ^): ");
                String operationSymbol = sc.nextLine();

        switch (operationSymbol) {
            case "+":
                wynik = a+b;
                break;
            case "-":
                wynik = a-b;
                break;
            case "*":
                wynik = a*b;
                break;
            case "/":
                wynik = a/b;
                break;
            case "^":
                wynik = Math.pow(a, b);
                break;
            default:
                System.out.println("Podałeś zły znak działania!");
                System.out.println("Spróbuj jeszcze raz");
        }
        
        System.out.println(wynik);
                
                
        
    }

}

class inputError extends Exception
{
    
} 