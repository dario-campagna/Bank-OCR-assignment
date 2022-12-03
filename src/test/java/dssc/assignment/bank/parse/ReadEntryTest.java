package dssc.assignment.bank.parse;

import dssc.assignment.bank.BankOcrAcceptanceTest;
import dssc.assignment.bank.Entry;
import dssc.assignment.bank.EntryReader;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadEntryTest {

    @Test
    void allEntries() throws Exception {
        URL multipleEntries = BankOcrAcceptanceTest.class.getClassLoader().getResource("multipleEntries");
        EntryReader reader = new EntryReader(Path.of(multipleEntries.toURI()));
        List<Entry> expectedEntries = List.of(
                new Entry(" _  _  _  _  _  _  _  _  _ ", " _|| || ||_|| || || || || |", "|_ |_||_||_||_||_||_||_||_|"),
                new Entry(" _  _  _  _  _  _  _  _    ", "| || || || || || || ||_   |", "|_||_||_||_||_||_||_| _|  |"),
                new Entry(" _  _  _  _  _  _     _  _ ", "  |  |  |  |  |  |  |  |  |", "  |  |  |  |  |  |  |  |  |")
        );

        assertEquals(expectedEntries, reader.readAllEntries());
    }
}
