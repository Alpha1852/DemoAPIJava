package com.formation.epita.bnpp.enumeration.ex1;

public enum JourSemaine {
    DIMANCHE ( true, "😊"),
    LUNDI (false,  "😂"),
    MARDI(false,  "😂"),
    MERCREDI(false, "😂"),
    JEUDI(false, "😂"),
    VENDREDI(false,  "😂"),
    SAMEDI(true,  "👌");

    private boolean isJourWeekend;
    private String smiley;
    JourSemaine(boolean isJourWeekend, String smiley) {
        this.isJourWeekend = isJourWeekend;
        this.smiley = smiley;
    }
    public boolean isJourWeekend(){
        return isJourWeekend;
    }

    public String getSmiley(){

        return smiley;
    }
}