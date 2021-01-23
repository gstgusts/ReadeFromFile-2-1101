package com.company;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public String getFileContent(String fileName) {
        var stream = getInputStream(fileName);

        Scanner scanner = new Scanner(stream);

        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append("\n");
        }

        return sb.toString();
    }

    public List<String> getAllLines(String fileName) {
        var stream = getInputStream(fileName);

        var scanner = new Scanner(stream);

        List<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        return lines;
    }

    private InputStream getInputStream(String fileName) {
        Class app = Main.class;
        return app.getResourceAsStream(fileName);
    }
}
