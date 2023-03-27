package com.formation.epita.bnpp.enumeration.ex1;

public enum JourSemaine {
    DIMANCHE (true),
    LUNDI(false),
    MARDI(false),
    MERCREDI(false),
    JEUDI(false),
    VENDREDI(false),
    SAMEDI(true);

    private boolean jourWeekend;
    JourSemaine(boolean jourWeekend) {
        this.jourWeekend = jourWeekend;
    }
}