package dssc.assignment.bank.parse;

import dssc.assignment.bank.BankOcrAcceptanceTest;
import dssc.assignment.bank.Entry;
import dssc.assignment.bank.EntryReader;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadEntryTest {

    @Test
    void allZerosEntry() throws Exception {
        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allZerosEntry");
        EntryReader reader = new EntryReader(Path.of(allZerosSingleEntry.toURI()));
        Entry entry = reader.readEntry();
        assertEquals("000000000", entry.toString());
    }

    @Test
    void allOnesEntry() throws Exception {
        URL allOnesSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allOnesEntry");
        EntryReader reader = new EntryReader(Path.of(allOnesSingleEntry.toURI()));
        Entry entry = reader.readEntry();
        assertEquals("111111111", entry.toString());
    }
}
