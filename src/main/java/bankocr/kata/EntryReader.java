package bankocr.kata;

import java.nio.file.Path;

public class EntryReader {

    public EntryReader(Path filePath) {

    }

    public String[] readEntry() {
        String[] entries = new String[]{
                " _  _  _  _  _  _  _  _  _ ",
                "| || || || || || || || || |",
                "|_||_||_||_||_||_||_||_||_|"
        };
        return entries;
    }
}
