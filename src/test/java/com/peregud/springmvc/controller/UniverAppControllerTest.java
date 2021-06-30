package com.peregud.springmvc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UniverAppController.class)
class UniverAppControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void viewHomePage() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("select-table"))
                .andReturn();
    }
}
