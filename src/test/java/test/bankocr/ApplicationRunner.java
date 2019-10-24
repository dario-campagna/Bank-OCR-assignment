package test.bankocr;

import bankocr.kata.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.URL;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ApplicationRunner {

    private ByteArrayOutputStream outputStream;

    public ApplicationRunner() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    public void parseFile(URL fileURL) {
        Main.main(fileURL.getFile());
    }

    public void showsAccountNumber(String accountNumberAsText) {
        assertThat(outputStream.toString(), is(equalTo(accountNumberAsText)));
    }

}
