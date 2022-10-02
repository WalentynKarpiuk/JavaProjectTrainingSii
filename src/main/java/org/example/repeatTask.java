package org.example;

import java.util.Scanner;

public class repeatTask{
static Scanner scan = new Scanner(System.in);
private static String fruitName;
private static int fruitWeight;

    public static void main(String[] args) {
        System.out.println("Hej, podaj nazwę owocu");
        fruitName = scan.nextLine();
        System.out.println("Podaj wagę owocu");
        fruitWeight = scan.nextInt();

        switch(fruitName){
            case "Pomarancza":
            printMessage(fruitName);
            break;
            case "Banana":
            printMessage(fruitName);
            break;
            case "Jabłko":
            printMessage(fruitName);
            break;
            default:
                System.out.println("Niestety nie posiadamy takich owoców!");
        }
    }
    private static void printMessage(String fruitName){
        if(fruitWeight <= 100){
            System.out.println(fruitName + "jest w sam raz, pozostało jeszcze " + (100-fruitWeight) + " kg!");
            }else{
            System.out.println(fruitName + "jest za dużo, o" + (fruitWeight - 100) + " kg!");
        }
    }


}