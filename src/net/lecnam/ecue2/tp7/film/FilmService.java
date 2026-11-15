package net.lecnam.ecue2.tp7.film;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Year;
import java.util.*;

public class FilmService {
    private static Set<Film> filmSet;
    private static Map<Year, Set<Film>> indexParAnnee;


    public FilmService() throws IOException {
        importFilm();

    }

    private void importFilm() throws IOException {
        Path source_file = Paths.get("films.csv");
        List<String> lines = Files.readAllLines(source_file);
        String[] parts;
        filmSet = new TreeSet<>();
        indexParAnnee = new HashMap<>();
        Film tempFilm;

        for(String line:lines) {
            parts = line.split(";");
            tempFilm = new Film(parts[1], parts[2], Integer.parseInt(parts[0]));
            filmSet.add(tempFilm);


            if (indexParAnnee.containsKey( Year.of(Integer.parseInt(parts[0])))){
                indexParAnnee.get(Year.of(Integer.parseInt(parts[0]))).add(tempFilm);
            } else {
                indexParAnnee.put(Year.of(Integer.parseInt(parts[0])), new TreeSet<>());
            }
        }
    }

    public void searchFilm(String search) {
        for (Film film:filmSet) {
            if (film.getTitre().indexOf(search) != -1) {
                System.out.println(film);
            }
        }
    }

    public void searchFilmByAnnee(int search) {
        Set<Film> filmSetAnnee = indexParAnnee.get(Year.of(search));
        if (filmSetAnnee == null) {
            System.out.println("Aucun film de " + search + ".");
            return;
        }

        for (Film film: filmSetAnnee) {
            System.out.println(film);
        }
    }

    public void printFilms() {
        for(Film film:filmSet) {
            System.out.println(film);
        }
    }
}
