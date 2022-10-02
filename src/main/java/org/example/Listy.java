package org.example;

import java.util.ArrayList;
import java.util.List;

public class Listy {
    public static void main(String[] args) {
        List <String> grupaImprezowa = new ArrayList<>();
        grupaImprezowa.add("Grazynka");
        grupaImprezowa.add("Kasia");
        grupaImprezowa.add("Janusz");
        grupaImprezowa.add("Brajan");
        grupaImprezowa.add("Michal");
        System.out.println("Osoba o indeksie 2:" + grupaImprezowa.get(2));
        System.out.println("Ilość osób w mojej grupie :" + grupaImprezowa.size());
        grupaImprezowa.remove(2);
        System.out.println("Osoba o indeksie 2:" + grupaImprezowa.get(2));
        System.out.println("Ilość osób w mojej grupie :" + grupaImprezowa.size());
        grupaImprezowa.add("Lidia");
        grupaImprezowa.add("Darek");

        System.out.println("Moja ekipa to: ");
        for(int i = 0; i <= grupaImprezowa.size()-1;i++) {

            System.out.println(grupaImprezowa.get(i));

        }

//        List <Integer> numerTotolotka = new ArrayList<>();
//        numerTotolotka.add(93);
//        numerTotolotka.add(63);
//        numerTotolotka.add(73);
//        numerTotolotka.add(23);
//        numerTotolotka.add(22);
//        System.out.println(numerTotolotka.get(4));
    }
}
