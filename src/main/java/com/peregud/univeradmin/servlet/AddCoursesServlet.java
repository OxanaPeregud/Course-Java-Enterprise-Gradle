package com.peregud.univeradmin.servlet;

import com.peregud.univeradmin.util.DataGeneratorUtil;
import com.peregud.univeradmin.util.DataUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/university-add-courses")
public class AddCoursesServlet extends HttpServlet {
    private static final int NUMBER_OF_COURSES = 5;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        DataUtil.saveData(DataGeneratorUtil.buildCourse(NUMBER_OF_COURSES));
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(request.getContextPath() + "/university-get-courses-table");
    }
}
