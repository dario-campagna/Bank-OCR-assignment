package test.bankocr.parse;

import bankocr.kata.AccountNumber;
import bankocr.kata.Entry;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PrintAccountNumberTest {

    @Test
    void allZerosEntry() {
        Entry entry = new Entry(" _  _  _  _  _  _  _  _  _ ","| || || || || || || || || |","|_||_||_||_||_||_||_||_||_|");
        assertThat(new AccountNumber(entry).toString(), is(equalTo("000000000")));
    }

    @Test
    void allOnesEntry() {
        Entry entry = new Entry("                           ", "  |  |  |  |  |  |  |  |  |", "  |  |  |  |  |  |  |  |  |");
        assertThat(new AccountNumber(entry).toString(), is(equalTo("111111111")));
    }
}
