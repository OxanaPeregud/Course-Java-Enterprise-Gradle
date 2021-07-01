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
    <c:if test="${course != null}">
    <form action="update-course" method="post">
        </c:if>
        <c:if test="${course == null}">
        <form action="insert-course" method="post">
            </c:if>
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        <c:if test="${course != null}">
                            Edit Course
                        </c:if>
                        <c:if test="${course == null}">
                            Add New Course
                        </c:if>
                    </h2>
                </caption>
                <c:if test="${course != null}">
                    <input type="hidden" name="id" value="<c:out value='${course.id}' />"/>
                </c:if>
                <tr>
                    <th>Name:</th>
                    <td>
                        <label>
                            <input type="text" name="name" size="45"
                                   value="<c:out value='${course.name}' />"
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
