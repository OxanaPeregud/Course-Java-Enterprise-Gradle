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
    <c:if test="${teacher != null}">
    <form action="update-teacher" method="post">
        </c:if>
        <c:if test="${teacher == null}">
        <form action="insert-teacher" method="post">
            </c:if>
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        <c:if test="${teacher != null}">
                            Edit Teacher
                        </c:if>
                        <c:if test="${teacher == null}">
                            Add New Teacher
                        </c:if>
                    </h2>
                </caption>
                <c:if test="${teacher != null}">
                    <input type="hidden" name="id" value="<c:out value='${teacher.id}' />"/>
                </c:if>
                <tr>
                    <th>First Name:</th>
                    <td>
                        <label>
                            <input type="text" name="firstName" size="45"
                                   value="<c:out value='${teacher.firstName}' />"
                            />
                        </label>
                    </td>
                </tr>
                <tr>
                    <th>Last Name:</th>
                    <td>
                        <label>
                            <input type="text" name="lastName" size="45"
                                   value="<c:out value='${teacher.lastName}' />"
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
