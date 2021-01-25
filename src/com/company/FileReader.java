package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public List<String> getTextLinesOfSmallFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    public String getFileContentUsingDataInputStream(String fileName) {
        try {
            DataInputStream reader = new DataInputStream(new FileInputStream(fileName));
            int nBytesTotal = reader.available();
            if (nBytesTotal > 0) {
              byte[] bytes = new byte[nBytesTotal];
              reader.read(bytes);
              return new String(bytes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
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

    private File getFile(String fileName) {
        Class app = Main.class;
        return new File(app.getResource(fileName).getFile());
    }
}
