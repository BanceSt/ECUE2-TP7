package net.lecnam.ecue2.tp7.nuancer;

import java.util.*;

public class Nuancier {
    private List<String> couleurs;
    private Map<Character, String> couleursMap;


    public Nuancier() {
        couleurs = new ArrayList<>();
        couleurs.add("noir");
        couleurs.add("rouge");
        couleurs.add("vert");
        couleurs.add("marron");
        couleurs.add("blanc");

        couleurs.add("rouge");

        couleurs.addFirst("cyan");
        initializeMap();
    }

    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(couleurs);
    }

    private void initializeMap()
    {
        couleursMap = new HashMap<>();

        for (String couleur: couleurs) {
            couleursMap.put(couleur.charAt(0), couleur);
        }
    }

    public String getCouleurFromCode(char initiale) {
        return couleursMap.get(initiale);
    }

    public List<String> getCouleurs() {
        return couleurs;
    }
}
