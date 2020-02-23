package com.captiva.modifiers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;


public class Finalize {

    @Test
    public void whenGC_thenFinalizerExecuted() throws IOException {
        String firstLine = new Finalizable().readFirstLine();

        assertEquals("baeldung.com", firstLine);
        System.gc();
    }
}
