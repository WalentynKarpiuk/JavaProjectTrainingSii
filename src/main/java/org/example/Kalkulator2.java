package org.example;

import java.util.Scanner;

public class Kalkulator2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartosc A: ");
        //scanner.next();
        double A = scanner.nextDouble();
        System.out.print("Podaj wartosc B: ");
        double B = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Napisz co chcesz zrobić: +  sumowanie;  -  różnica; * mnożenie; / dzielenie:");
        String act = scanner.nextLine();
        //scanner.nextLine();

        if(act.equals("+")){
            System.out.println(A+B);

        }else if(act.equals("-")){
            System.out.println(A-B);

        }else if(act.equals("*")){
            System.out.println(A*B);
        }else if(act.equals("/")){
            if(B==0){
                System.out.println("Nie da sie podzielić na 0 - spróbuj jeszcze raz!");
            }else{System.out.println(A/B);}

        }else{
            System.out.println("Twój wybór niezgodny z instrukcją (+,-,*,/) - spróbuj jeszcze raz!");
        }




    }
}
