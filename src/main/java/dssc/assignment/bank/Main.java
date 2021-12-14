package dssc.assignment.bank;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String... args) throws IOException {
        EntryReader reader = new EntryReader(Path.of(args[0]));
        reader.readAllEntries().stream()
                .map(AccountNumber::new)
                .forEach(accountNumber -> {
                    if (accountNumber.checksum() == 0) {
                        System.out.println(accountNumber);
                    } else {
                        System.out.println(accountNumber + " ERR");
                    }
                });
    }
}
