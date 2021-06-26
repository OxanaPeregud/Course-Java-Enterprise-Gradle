package com.peregud.univeradmin.servlet;

import com.peregud.univeradmin.util.DataGeneratorUtil;
import com.peregud.univeradmin.util.DataUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/university-add-admins")
public class AddAdminsServlet extends HttpServlet {
    private static final int NUMBER_OF_ADMINS = 5;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        DataUtil.saveData(DataGeneratorUtil.buildAdmin(NUMBER_OF_ADMINS));
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(request.getContextPath() + "/university-get-admins-table");
    }
}
