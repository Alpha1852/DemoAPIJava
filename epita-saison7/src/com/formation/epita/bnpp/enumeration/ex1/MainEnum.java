package com.formation.epita.bnpp.enumeration.ex1;

public class MainEnum {

        public static void main(String[] args) {
            System.out.println("Hello world!");
            // Get all elements
            JourSemaine[] jours = JourSemaine.values();

            //Process Elements
            for(JourSemaine jour : jours){
                System.out.println(("jour: "+ jour.name())+ ", Weekend:"+jour.isJourWeekend()+ ", Je suis "+jour.getSmiley());
            }
            System.out.println(JourSemaine.JEUDI.compareTo(JourSemaine.SAMEDI));
    }
}
