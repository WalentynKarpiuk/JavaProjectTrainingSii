package org.example;

import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe browsera: FireFox, Chrome, Edge :");
       String browser = scan.nextLine();

        //String driver;
        switch (browser){
            case "FireFox":
                //driver = "Firefox Driver";
                System.out.println("Wybrałeś FireFox Driver");
                break;
            case "Chrome":
                //driver = "Chrome Driver";
                System.out.println("Wybrałeś Chrom Driver");
                break;
            case "Edge":
                //driver = "Edge";
                System.out.println("Wybrałeś Edge Driver" );
                break;
            default:
                //driver = "Other driver";
            System.out.println("wybrałem inny Driver");
        }
        //System.out.println("Wartość drivera " + driver );
    }
}
