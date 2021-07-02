<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Students Management</h1>
    <h2>
        <a href="new-student">Add New Student</a>
        &nbsp;&nbsp;&nbsp;
        <a href="list-students">List of All Students</a>
    </h2>
</div>
<div align="center">
    <form action="list-students" method="post">
        <table border="1" cellpadding="5">
            <caption><h2>List of Students</h2></caption>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Course</th>
            </tr>
            <c:forEach var="student" items="${listStudents}">
                <tr>
                    <td><c:out value="${student.id}"/></td>
                    <td><c:out value="${student.firstName}"/></td>
                    <td><c:out value="${student.lastName}"/></td>
                    <td><c:out value="${student.course}"/></td>
                    <td>
                        <a href="edit-student?id=<c:out value='${student.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp
                        <label><input type="checkbox" name="deleteStudent" value="${student.id}">Delete</label>
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
