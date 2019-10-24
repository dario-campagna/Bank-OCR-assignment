package test.bankocr;

import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Path;

public class BankOcrAcceptanceTest {

    @Test
    public void parseFileWithSingleAllZeroesEntryAndShowActualAccountNumberOnConsole() throws Exception {
        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allZerosEntry");
        ApplicationRunner application = new ApplicationRunner();

        application.parseFile(Path.of(allZerosSingleEntry.toURI()));

        application.showsAccountNumber("000000000\n");
    }

    @Test
    public void parseFileWithSingleAllOnesEntryAndShowActualAccountNumberOnConsole() throws Exception {
        URL allOnesSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allOnesEntry");
        ApplicationRunner application = new ApplicationRunner();

        application.parseFile(Path.of(allOnesSingleEntry.toURI()));

        application.showsAccountNumber("111111111\n");
    }
}
