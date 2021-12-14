package dssc.assignment.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EntryReader {

    private final List<String> fileLines;

    public EntryReader(Path filePath) throws IOException {
        fileLines = Files.readAllLines(filePath);
    }

    public List<Entry> readAllEntries() {
        List<Entry> entries = new ArrayList<>();
        for (int i = 0; i < fileLines.size(); i+=4) {
            entries.add(new Entry(fileLines.get(i), fileLines.get(i+1), fileLines.get(i+2)));
        }
        return entries;
    }
}
