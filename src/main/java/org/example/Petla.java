package org.example;
import java.util.Scanner;
public class Petla {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Podaj czas do wybuchu");
        int i = scan.nextInt();
        for (int j = i; j >=0 ; j--) {
            System.out.println("Launch for:" + j);
            Thread.sleep(500);
        }

// added for changes :)

        System.out.println("Boom ");
    }

}
