package com.peregud.springmvc.session;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SessionListenerController.class)
class SessionListenerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void createNewSession() throws Exception {
        this.mockMvc.perform(get("/create-new-session"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Session is available now: 1")));
    }

    @Test
    void removeSession() throws Exception {
        this.mockMvc.perform(get("/destroy-active-session"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Session is not available to destroy")));
    }
}
