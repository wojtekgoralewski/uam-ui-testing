package org.example;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

public class SampleTest {

    @Test
    public void sampleTest() {
        open("https://www.google.com");

    }

}