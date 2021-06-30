<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Students</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/univer-style.css">
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Students Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add Students"
               onclick="window.location.href='university-add-students'; return false;"
               class="add-button"
        />

        <table>
            <tr>
                <th>Student ID</th>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>

            <%--@elvariable id="students" type="java.util.List"--%>
            <c:forEach var="tempStudent" items="${students}">

                <tr>
                    <td> ${tempStudent.id} </td>
                    <td> ${tempStudent.firstName} </td>
                    <td> ${tempStudent.lastName} </td>
                </tr>

            </c:forEach>
        </table>

    </div>

    <p>
        <a href="${pageContext.request.contextPath}/university-choose-table">Choose Another Table</a>
    </p>

</div>
</body>
</html>
