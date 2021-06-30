<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Teachers</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/univer-style.css">
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Teachers Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add Teachers"
               onclick="window.location.href='university-add-teachers'; return false;"
               class="add-button"
        />

        <table>
            <tr>
                <th>Teacher ID</th>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>

            <%--@elvariable id="teachers" type="java.util.List"--%>
            <c:forEach var="tempTeacher" items="${teachers}">

                <tr>
                    <td> ${tempTeacher.id} </td>
                    <td> ${tempTeacher.firstName} </td>
                    <td> ${tempTeacher.lastName} </td>
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
