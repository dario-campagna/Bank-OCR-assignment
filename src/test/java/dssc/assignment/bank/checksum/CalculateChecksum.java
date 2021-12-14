package dssc.assignment.bank.checksum;

import dssc.assignment.bank.AccountNumber;
import dssc.assignment.bank.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculateChecksum {

    @Test
    void validAccountNumber() {
        AccountNumber accountNumber = new AccountNumber(new Entry(" _  _  _  _  _  _  _  _  _ ", " _|| || ||_|| || || || || |", "|_ |_||_||_||_||_||_||_||_|"));
        assertEquals(0, accountNumber.checksum());
    }

    @Test
    void invalidAccountNumber() {
        AccountNumber accountNumber = new AccountNumber(new Entry("                           ", "  |  |  |  |  |  |  |  |  |", "  |  |  |  |  |  |  |  |  |"));
        assertNotEquals(0, accountNumber.checksum());
    }
}
