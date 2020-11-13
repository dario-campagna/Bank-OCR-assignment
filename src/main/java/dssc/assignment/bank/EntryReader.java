package dssc.assignment.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EntryReader {

    private final List<String> fileLines;

    public EntryReader(Path filePath) throws IOException {
        fileLines = Files.readAllLines(filePath);
    }

    public Entry readEntry() {
        return new Entry(fileLines.get(0), fileLines.get(1), fileLines.get(2));
    }
}
