package bankocr.kata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class EntryReader {

    private final BufferedReader bufferedReader;

    public EntryReader(Path filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath.toFile());
        bufferedReader = new BufferedReader(fileReader);
    }

    public Entry newReadEntry() throws IOException {
        return new Entry(bufferedReader.readLine(), bufferedReader.readLine(), bufferedReader.readLine());
    }
}
