package com.sesame.challenge;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.time.Clock;


@Slf4j
@ActiveProfiles(profiles = "test")
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public abstract class SpringAbstractTestClass {

    @Autowired
    protected MockMvc mvc;

    @Autowired
    protected Clock clock;

    @Autowired
    protected ObjectMapper objectMapper;

    public String objectToString(Object o) {
        try {
            return this.objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new AssertionError(e);
        }
    }

}
