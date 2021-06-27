package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Admin;
import com.peregud.springmvc.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AdminController.class)
class AdminControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AdminService service;

    @Test
    void addAdmin() throws Exception {
        List<Admin> listAdmins = new ArrayList<>();
        when(service.listAll()).thenReturn(listAdmins);
        this.mockMvc.perform(get("/add-admin")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listAdmins)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("admin-table"))
                .andReturn();
    }

    @Test
    void getAdmin() throws Exception {
        List<Admin> listAdmins = new ArrayList<>();
        when(service.listAll()).thenReturn(listAdmins);
        this.mockMvc.perform(get("/get-admin")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listAdmins)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("admin-table"))
                .andReturn();
    }
}
