package hu.nive.ujratervezes.zarovizsga.people;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class People {
    public int getNumberOfMales(String path) {
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            return numberOfMales(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private int numberOfMales(List<String> lines) {
        int numberOfMales = 0;
        for (String line : lines) {
            String[] parts = line.split(",");
            String gender = parts[4];
            if (gender.equals("Male")) {
                numberOfMales++;
            }
        }
        return numberOfMales;
    }
}

