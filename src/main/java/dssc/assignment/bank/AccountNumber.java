package dssc.assignment.bank;

public class AccountNumber {

    private final Entry entry;

    public AccountNumber(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return entry.toString();
    }
}
