package test.bankocr;

import org.junit.jupiter.api.Test;

import java.net.URL;

public class BankOcrAcceptanceTest {

    @Test
    public void parseFileWithSingleAllZeroEntryAndShowActualAccountNumberOnConsole() throws Exception {
        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allZerosEntry");
        ApplicationRunner application = new ApplicationRunner();

        application.parseFile(allZerosSingleEntry);

        application.showsAccountNumber("000000000\n");
    }
}
