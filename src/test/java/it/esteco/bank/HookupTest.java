package it.esteco.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class HookupTest {

    @Test
    public void isThisWorking() {
        Hookup hookup = new Hookup();
        assertThat(hookup.getMessage(), is(equalTo("Ready to go!")));
    }
}