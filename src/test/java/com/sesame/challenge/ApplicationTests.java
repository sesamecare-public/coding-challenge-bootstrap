package com.sesame.challenge;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ApplicationTests extends SpringAbstractTestClass {

    @Test
    public void dummyTest() {
        assertThat(1, equalTo(1));
    }
}
