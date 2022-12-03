package dssc.assignment.bank;

import java.util.HashMap;
import java.util.Map;

public class Cell {

    private static final String ZERO_CELL =
                    " _ " +
                    "| |" +
                    "|_|";
    private static final String ONE_CELL =
                    "   " +
                    "  |" +
                    "  |";
    private static final String TWO_CELL =
                    " _ " +
                    " _|" +
                    "|_ ";
    private static final String THREE_CELL =
                    " _ " +
                    " _|" +
                    " _|";
    private static final String FOUR_CELL =
                    "   " +
                    "|_|" +
                    "  |";
    private static final String FIVE_CELL =
                    " _ " +
                    "|_ " +
                    " _|";
    private static final String SIX_CELL =
                    " _ " +
                    "|_ " +
                    "|_|";
    private static final String SEVEN_CELL =
                    " _ " +
                    "  |" +
                    "  |";
    private static final String EIGHT_CELL =
                    " _ " +
                    "|_|" +
                    "|_|";
    private static final String NINE_CELL =
                    " _ " +
                    "|_|" +
                    " _|";
    private static final Map<String, String> cellTextToString = new HashMap<>() {{
        put(ZERO_CELL, "0");
        put(ONE_CELL, "1");
        put(TWO_CELL, "2");
        put(THREE_CELL, "3");
        put(FOUR_CELL, "4");
        put(FIVE_CELL, "5");
        put(SIX_CELL, "6");
        put(SEVEN_CELL, "7");
        put(EIGHT_CELL, "8");
        put(NINE_CELL, "9");
    }};

    private final String cellAsText;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        return cellTextToString.get(cellAsText);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return cellAsText.equals(cell.cellAsText);
    }

    @Override
    public int hashCode() {
        return cellAsText.hashCode();
    }
}
