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
    <c:if test="${student != null}">
    <form action="update-student" method="post">
        </c:if>
        <c:if test="${student == null}">
        <form action="insert-student" method="post">
            </c:if>
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        <c:if test="${student != null}">
                            Edit Student
                        </c:if>
                        <c:if test="${student == null}">
                            Add New Student
                        </c:if>
                    </h2>
                </caption>
                <c:if test="${student != null}">
                    <input type="hidden" name="id" value="<c:out value='${student.id}' />"/>
                </c:if>
                <tr>
                    <th>First Name:</th>
                    <td>
                        <label>
                            <input type="text" name="firstName" size="45"
                                   value="<c:out value='${student.firstName}' />"
                            />
                        </label>
                    </td>
                </tr>
                <tr>
                    <th>Last Name:</th>
                    <td>
                        <label>
                            <input type="text" name="lastName" size="45"
                                   value="<c:out value='${student.lastName}' />"
                            />
                        </label>
                    </td>
                </tr>
                <tr>
                    <th>Course:</th>
                    <td>
                        <label>
                            <input type="text" name="courseId" size="45"
                                   value="<c:out value='${student.course}' />"
                            />
                        </label>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save"/>
                    </td>
                </tr>
            </table>
        </form>
</div>
</body>
</html>
