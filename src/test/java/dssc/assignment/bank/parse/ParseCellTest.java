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

    @Test
    void threeCell() {
        String threeAsText =
                        " _ " +
                        " _|" +
                        " _|";
        assertEquals("3", new Cell(threeAsText).toString());
    }

    @Test
    void fourCell() {
        String fourAsText =
                        "   " +
                        "|_|" +
                        "  |";
        assertEquals("4", new Cell(fourAsText).toString());
    }

    @Test
    void fiveCell() {
        String fiveAsText =
                        " _ " +
                        "|_ " +
                        " _|";
        assertEquals("5", new Cell(fiveAsText).toString());
    }

    @Test
    void sixCell() {
        String sixAsText =
                        " _ " +
                        "|_ " +
                        "|_|";
        assertEquals("6", new Cell(sixAsText).toString());
    }

    @Test
    void sevenCell() {
        String sevenAsText =
                        " _ " +
                        "  |" +
                        "  |";
        assertEquals("7", new Cell(sevenAsText).toString());
    }

    @Test
    void eightCell() {
        String eightAsText =
                        " _ " +
                        "|_|" +
                        "|_|";
        assertEquals("8", new Cell(eightAsText).toString());
    }

    @Test
    void nineCell() {
        String nineAsText =
                        " _ " +
                        "|_|" +
                        " _|";
        assertEquals("9", new Cell(nineAsText).toString());
    }
}
