package net.lecnam.ecue2.tp7.film;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FilmService {
    private static Set<Film> filmSet;

    public FilmService() throws IOException {
        importFilm();
    }

    private void importFilm() throws IOException {
        Path source_file = Paths.get("films.csv");
        List<String> lines = Files.readAllLines(source_file);
        String[] parts;
        filmSet = new TreeSet<>();

        for(String line:lines) {
            parts = line.split(";");
            filmSet.add(new Film(parts[1], parts[2], Integer.parseInt(parts[0])));
        }
    }

    public void printFilms() {
        for(Film film:filmSet) {
            System.out.println(film);
        }
    }
}
