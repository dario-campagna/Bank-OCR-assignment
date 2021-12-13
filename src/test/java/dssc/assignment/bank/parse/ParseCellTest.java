package dssc.assignment.bank.parse;

import dssc.assignment.bank.Cell;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseCellTest {

    @Test
    void zeroCell() {
        String zeroAsText =
                        " _ " +
                        "| |" +
                        "|_|";
        assertEquals("0", new Cell(zeroAsText).toString());
    }

    @Test
    void oneCell() {
        String oneAsText =
                        "   " +
                        "  |" +
                        "  |";
        assertEquals("1", new Cell(oneAsText).toString());
    }

    @Test
    void twoCell() {
        String twoAsText =
                        " _ " +
                        " _|" +
                        "|_ ";
        assertEquals("2", new Cell(twoAsText).toString());
    }
}
