package com.peregud.springmvc.service;

import com.peregud.springmvc.model.Admin;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AdminServiceTest {

    @Test
    void listAll() {
        AdminService service = mock(AdminService.class);
        List<Admin> list = new ArrayList<>();
        when(service.listAll()).thenReturn(list);
        assertEquals(list, service.listAll());
    }

    @Test
    void save() {
        AdminService service = mock(AdminService.class);
        Admin admin = new Admin();
        when(service.save(admin)).thenReturn(admin);
        assertEquals(admin, service.save(admin));
    }
}
