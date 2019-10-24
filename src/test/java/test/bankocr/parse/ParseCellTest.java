package test.bankocr.parse;

import bankocr.kata.Cell;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ParseCellTest {

    @Test
    void zeroCell() {
        String zeroAsText =
                        " _ " +
                        "| |" +
                        "|_|";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("0")));
    }

    @Test
    void oneCell() {
        String zeroAsText =
                        "   " +
                        "  |" +
                        "  |";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("1")));
    }
}
