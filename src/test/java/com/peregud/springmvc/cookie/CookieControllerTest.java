package com.peregud.springmvc.cookie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CookieController.class)
class CookieControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void readCookie() throws Exception {
        this.mockMvc.perform(get("/cookie"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("My username is Admin")));
    }

    @Test
    void setCookie() throws Exception {
        this.mockMvc.perform(get("/change-username"))
                .andDo(print())
                .andExpect(cookie().value("username", "Oxana"))
                .andExpect(cookie().maxAge("username", 604800))
                .andExpect(cookie().secure("username", true))
                .andExpect(cookie().httpOnly("username", true))
                .andExpect(cookie().path("username", "/cookie"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Username is changed")));
    }

    @Test
    void deleteCookie() throws Exception {
        this.mockMvc.perform(get("/delete-username"))
                .andDo(print())
                .andExpect(cookie().maxAge("username", 0))
                .andExpect(cookie().secure("username", true))
                .andExpect(cookie().httpOnly("username", true))
                .andExpect(cookie().path("username", "/cookie"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Username is deleted")));
    }

    @Test
    void readAllCookies() throws Exception {
        this.mockMvc.perform(get("/all-cookies"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("No cookies")));
    }
}
