package com.fformation.epita.java.collections.exo;

import java.util.ArrayList;
import java.util.List;

public class MainCollection {

    public static void main(String[] args) {
        System.out.println("Listes!");
        List<String> maliste = new ArrayList<>();
        maliste.add("Bonjour ");
        maliste.add("Merci ");
        maliste.add("Aurevoir ");
        maliste.add("Et à bientôt 'j'espère");
        for(int i =0; i<= maliste.size(); i++){
            System.out.println(maliste.get(i));
        }
    }

}
