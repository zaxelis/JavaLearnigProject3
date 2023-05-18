package md.BedrosCristi.accessmodifiers;

import md.BedrosCristi.accessmodifiers.peopleevidence.Person;

import javax.swing.*;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        //cream primul obiect despre care cunoastem putine detalii
        Person elonMusk = new Person(2001010100L, "Elon", "Musk");
        System.out.println(elonMusk.toString());
        Person.printNumarTotalDePersoane();

        //cream al 2 obiect despre care cunoastem toate detaliite
        Person billGates = new Person(2001554544L, "Bill", "Gates", 67, "Arborilor 21A",
                "Moldovean", "masculin", "+37368545854", true, "divortat");
        System.out.println(billGates.toString());
        //folosim instruciunea if
        if (billGates.hasUniversityDegree) {
            System.out.println("Bill Gates are studii superioare");
        } else {
            System.out.println("Bill Gates nu are studii superioare");
        }
        Person.printNumarTotalDePersoane();

        //cream al 3 obiect despre care cunoastem toate detaliile
        Person barakObama = new Person(2005675154L, "Barak", "Obama", 61, "Feredeului 12", "Moldovean",
                "masculin", "+37379854587", true, "casatorit");
        System.out.println(barakObama.toString());
        //folosim instriuctiunea if
        if (barakObama.hasUniversityDegree) {
            System.out.println("Barak Obama are studii superioare");
        } else {
            System.out.println("Barak Obama nu are studii superioare");
        }
        Person.printNumarTotalDePersoane();

        //cream al 4 obiect despre care cunoastem putine detalii
        Person angelaMerkel = new Person(2001548487L, "Angela", "Merkel");
        System.out.println(angelaMerkel.toString());
        Person.printNumarTotalDePersoane();

        //cream al 5 obiect despre care cunoastem toate detaliile
        Person jimCarrey = new Person(2001542563L, "Jim", "Carrey", 61, "Grenoble 259", "Moldovean",
                "Masculin", "+37368545474", false, "casatorit");
        System.out.println(jimCarrey.toString());
        //folosim instruciunea if
        if (jimCarrey.hasUniversityDegree) {
            System.out.println("Jim Carrey are studii superioare");
        } else {
            System.out.println("Jim Carrey nu are studii superioare");
        }
        Person.printNumarTotalDePersoane();
    }
}
