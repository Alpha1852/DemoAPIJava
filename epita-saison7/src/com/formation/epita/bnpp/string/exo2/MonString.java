package com.formation.epita.bnpp.string.exo2;

public class MonString {


    public String majuscule(String chaine){

        return chaine.toUpperCase();
    }
     public int nobleDecaractere(char a, String chaine){
         int nb = 0;
         for (int i=0; i < chaine.length(); i++)
         {
             if (chaine.charAt(i) == a)
                 nb++;
         }
         return nb;

     }

     public String remplace(String chaine){
              return chaine.replace('a', '4');
     }
}
