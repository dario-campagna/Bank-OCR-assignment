package dssc.assignment.bank;

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
    private String cellAsText;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        if (ZERO_CELL.equals(cellAsText)) {
            return "0";
        } else if (TWO_CELL.equals(cellAsText)) {
            return "2";
        } else {
            return "1";
        }
    }
}
