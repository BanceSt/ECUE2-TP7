package net.lecnam.ecue2.tp7.film;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Film implements Comparable<Film> {
    private String titre;
    private String realisateur;
    private Year anneeSortie;


    public Film(String titre, String realisateur, int annee) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.anneeSortie = Year.of(annee);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s",
                titre, realisateur, anneeSortie);
    }

    @Override
    public int compareTo(Film f) {
        int result = this.anneeSortie.compareTo(f.getAnneeSortie());
        return  result != 0 ? result :
                this.titre.compareTo(f.getTitre());
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public Year getAnneeSortie() {
        return anneeSortie;
    }
}
