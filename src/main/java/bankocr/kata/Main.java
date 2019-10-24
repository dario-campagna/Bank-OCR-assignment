package bankocr.kata;

import java.nio.file.Path;

public class Main {
    public static void main(String... args) {
        EntryReader parser = new EntryReader(Path.of(args[0]));
        String[] entry = parser.readEntry();
        AccountNumber accountNumber = new AccountNumber(entry);
        System.out.println(accountNumber.toString());
    }
}
