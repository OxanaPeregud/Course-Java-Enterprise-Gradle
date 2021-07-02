<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Teachers</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Teachers Management</h1>
    <h2>
        <a href="new-teacher">Add New Teacher</a>
        &nbsp;&nbsp;&nbsp;
        <a href="list-teachers">List of All Teachers</a>
    </h2>
</div>
<div align="center">
    <form action="list-teachers" method="post">
        <table border="1" cellpadding="5">
            <caption><h2>List of Teachers</h2></caption>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Course</th>
            </tr>
            <c:forEach var="teacher" items="${listTeachers}">
                <tr>
                    <td><c:out value="${teacher.id}"/></td>
                    <td><c:out value="${teacher.firstName}"/></td>
                    <td><c:out value="${teacher.lastName}"/></td>
                    <td><c:out value="${teacher.course}"/></td>
                    <td>
                        <a href="edit-teacher?id=<c:out value='${teacher.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <label><input type="checkbox" name="deleteTeacher" value="${teacher.id}">Delete</label>
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
