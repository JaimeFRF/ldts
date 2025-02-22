package com.tomb.git;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public List<String> readFile(String path) throws IOException {

        List<String> level = new ArrayList<>();

        File level_file = new File(path);
        Scanner reader = new Scanner(level_file);

        readFile(level, reader);

        reader.close();

        return level;
    }

    private void readFile(List<String> level, Scanner reader) {
        while(reader.hasNext()){
            level.add(reader.nextLine());
        }
    }
}
