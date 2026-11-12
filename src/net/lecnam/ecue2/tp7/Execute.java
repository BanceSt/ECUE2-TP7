package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.film.Film;
import net.lecnam.ecue2.tp7.film.FilmService;
import net.lecnam.ecue2.tp7.nuancer.Nuancier;

import java.io.IOException;
import java.util.*;

public class Execute {

    public static void main(String[] args) {

//        exercice1();
//
//        exercice2();
//
//        exercice3();

        exercice4();

        exercice5();

        exercice6();


    }

    private static void exercice1() {
        Nuancier nuancier = new Nuancier();
        List<String> couleurs = nuancier.getCouleurs();

        System.out.println("Exercice 1.");
        System.out.println("Methode : for");
        for (int i=0; i < couleurs.size();i++) {
            System.out.println(i + " : " + couleurs.get(i));
        }

        System.out.println("\nMethode : foreach");
        System.out.println("----------------");
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }

        System.out.println("\nMethode : iterator");
        System.out.println("----------------");
        Iterator<String> iterCouleur = couleurs.iterator();
        while ( iterCouleur.hasNext()) {
            System.out.println(iterCouleur.next());
        }


        Collections.sort(couleurs);
        System.out.println("\nMethode post tri : foreach");
        System.out.println("----------------");
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
    }


    private static void exercice2() {
        Nuancier nuancier = new Nuancier();
        Set<String> couleurs = nuancier.getCouleursTreeSet();

        System.out.println("\nExercice 2.");
        System.out.println("Methode : foreach");
        System.out.println("----------------");
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
        // TreeSet Ordonne la liste automatiquement et efface les doublons
    }

    private static void exercice3() {
        Nuancier nuancier = new Nuancier();
        System.out.println("\nExercice 3.");

        System.out.println("Code r : " + nuancier.getCouleurFromCode('r'));
    }


    private static void exercice4() {
        Film film1 = new Film("Le Parrain", "Francis Ford Coppola", 1972);
        Film film2 = new Film("Douze hommes en colère", "Reginald Rose", 1957);
        Film film3 = new Film("Le Voyage De Chihiro", "Hayao Miyazaki", 2001);
        Film film4 = new Film("Silent Voice", "Naoko Yamada", 2016);

        Set<Film> films = new TreeSet<>();
        films.add(film1);
        films.add(film2);
        films.add(film3);
        films.add(film4);


        System.out.println("----------------");
        System.out.println("Methode : foreach");
        for (Film film : films) {
            System.out.println(film);
        }


        List<Film> films1 = new ArrayList<>(films);

        Collections.reverse(films1);


        System.out.println("\n----------------");
        System.out.println("Methode post inverse : foreach");
        for (Film film : films1) {
            System.out.println(film);
        }



    }

    private static void exercice5() {
        FilmService filmService;
        try {
            filmService = new FilmService();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        filmService.printFilms();

    }

    private static void exercice6() {



    }


}
