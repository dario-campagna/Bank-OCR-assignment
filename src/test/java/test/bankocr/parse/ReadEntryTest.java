package test.bankocr.parse;

import bankocr.kata.EntryReader;
import org.junit.jupiter.api.Test;
import test.bankocr.BankOcrAcceptanceTest;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ReadEntryTest {

    @Test
    void allZerosEntry() throws URISyntaxException {
        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allZerosEntry");
        EntryReader reader = new EntryReader(Path.of(allZerosSingleEntry.toURI()));
        String[] entryLines = reader.readEntry();
        assertThat(entryLines[0], is(equalTo(" _  _  _  _  _  _  _  _  _ ")));
        assertThat(entryLines[1], is(equalTo("| || || || || || || || || |")));
        assertThat(entryLines[2], is(equalTo("|_||_||_||_||_||_||_||_||_|")));
    }
}
