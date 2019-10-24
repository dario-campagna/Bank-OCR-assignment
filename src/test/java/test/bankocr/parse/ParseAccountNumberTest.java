package test.bankocr.parse;

import bankocr.kata.AccountNumber;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ParseAccountNumberTest {

    @Test
    void allZerosEntry() {
        String[] allZerosEntryLines = new String[]{
                " _  _  _  _  _  _  _  _  _ ",
                "| || || || || || || || || |",
                "|_||_||_||_||_||_||_||_||_|"
        };
        assertThat(new AccountNumber(allZerosEntryLines).toString(), is(equalTo("000000000")));
    }
}
