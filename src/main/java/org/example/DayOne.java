package org.example;

import java.util.Scanner;

public class DayOne {
    static Scanner scan = new Scanner(System.in);
    private static int fruitWeight;
    private static String fruitFromUser;

    public static void main(String[] args) {
        //0.Instrukcje użytkowniku co ma podać
        System.out.println("Witaj urzytkowniku, podaj mi teraz nazwe owocu:");
        // 1. pobranie owoców - String
        fruitFromUser = scan.nextLine();
        // 2. pobranie wagi -
        System.out.println("Podaj mi teraz wagę owocu:");
        fruitWeight = scan.nextInt();
        //3. co wybieramy if lub switch - swich dla owoców

        switch (fruitFromUser) {
            case "Jablko":
                printMessage(fruitFromUser);
                break;
            case "Pomarancza":
                printMessage(fruitFromUser);
                break;
            case "Banany":
                printMessage(fruitFromUser);
                break;
            default:
                System.out.println("Nie obsługujemy takich owoców");

        }
    }
    //4. mechanizm czy brakuje czy jest nadmiar
//5. wyświetlanie odpowiednego komunikatu
    private static void printMessage(String fruitFromUser) {

        if (fruitWeight <= 100) {
            System.out.println(fruitFromUser + " jest w sam raz, mamy jeszcze " + (100 - fruitWeight) + " kg miejsca");
        } else {
            System.out.println(fruitFromUser + " jest za dużo o " + (fruitWeight - 100) + "kg");
        }
    }

}

//System.out.println("Witaj uzytkowniku " + textFromUser);
//4. mechanizm czy brakuje czy jest nadmiar
//5. wyświetlanie odpowiednego komunikatu



