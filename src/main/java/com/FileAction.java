package com;

import java.io.*;

public class FileAction {

    public String getLargestWord(String file_location) throws Exception {

        File tempFile = new File(file_location);
        if(tempFile.exists()) {
            if (tempFile.length() != 0) {
                BufferedReader reader;
                reader = new BufferedReader(new FileReader(file_location));
                String line = reader.readLine();
                String largestWord = line;
                while (line != null) {
                    if (line.length() > largestWord.length()) {
                        largestWord = line;
                    }
                    line = reader.readLine();
                }
                reader.close();
                return largestWord;
            } else
                throw new Exception("File is Empty");
        }
        else
            throw new Exception("File does not exist");
    }

    public String getLargestWordTransposed(String file_location) throws Exception {
        String largestWord = getLargestWord(file_location);
        String transposedWord = "";
        for (int i = largestWord.length() - 1; i >= 0; i--) {
            transposedWord += largestWord.charAt(i);
        }
        return transposedWord;
    }
}
