<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Courses</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Courses Management</h1>
    <h2>
        <a href="new-course">Add New Course</a>
        &nbsp;&nbsp;&nbsp;
        <a href="list-courses">List of All Courses</a>
    </h2>
</div>
<div align="center">
    <form action="list-courses" method="post">
        <table border="1" cellpadding="5">
            <caption><h2>List of Courses</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
            </tr>
            <c:forEach var="course" items="${listCourses}">
                <tr>
                    <td><c:out value="${course.id}"/></td>
                    <td><c:out value="${course.name}"/></td>
                    <td>
                        <a href="edit-course?id=<c:out value='${course.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp
                        <label><input type="checkbox" name="deleteCourse" value="${course.id}">Delete</label>
                    </td>
                </tr>
            </c:forEach>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>

        </table>
    </form>

    <p>
        <a href="${pageContext.request.contextPath}/choose-list">Choose Another List</a>
    </p>

</div>
</body>
</html>
