package dssc.assignment.bank;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationRunner {

    private ByteArrayOutputStream outputStream;

    public ApplicationRunner() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    public void parseFile(Path filePath) throws IOException {
        Main.main(filePath.toString());
    }

    public void showsAccountNumber(String accountNumberAsText) {
        assertEquals(accountNumberAsText, outputStream.toString());
    }

}
