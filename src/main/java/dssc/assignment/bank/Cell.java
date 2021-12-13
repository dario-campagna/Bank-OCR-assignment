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
    private static final Map<String, String> cellTextToString = new HashMap<>() {{
        put(ZERO_CELL, "0");
        put(ONE_CELL, "1");
        put(TWO_CELL, "2");
    }};

    private String cellAsText;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        return cellTextToString.get(cellAsText);
    }
}
