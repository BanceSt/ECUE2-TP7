package net.lecnam.ecue2.tp7.nuancer;

import java.util.ArrayList;
import java.util.List;

public class Nuancier {
    List<String> couleurs;

    public Nuancier() {
        couleurs = new ArrayList<>();
        couleurs.add("noir");
        couleurs.add("rouge");
        couleurs.add("vert");
        couleurs.add("marron");
        couleurs.add("blanc");

        couleurs.add("rouge");

        couleurs.addFirst("cyan");
    }

    public List<String> getCouleurs() {
        return couleurs;
    }
}
