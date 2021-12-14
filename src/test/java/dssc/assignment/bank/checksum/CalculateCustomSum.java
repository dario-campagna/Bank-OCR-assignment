package dssc.assignment.bank.checksum;

import dssc.assignment.bank.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateCustomSum {

    @Test
    void name() {
        Entry entry = new Entry(" _  _  _  _  _  _  _  _  _ ", " _|| || ||_|| || || || || |", "|_ |_||_||_||_||_||_||_||_|");
        assertEquals(66, entry.customSum());
    }
}
