package test.bankocr;

import bankocr.kata.Main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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
        assertThat(outputStream.toString(), is(equalTo(accountNumberAsText)));
    }

}
