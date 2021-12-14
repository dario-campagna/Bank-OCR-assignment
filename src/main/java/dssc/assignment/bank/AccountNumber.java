package dssc.assignment.bank;

public class AccountNumber {

    private Entry entry;

    public AccountNumber(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return entry.toString();
    }

    public int checksum() {
        return entry.customSum() % 11;
    }
}
