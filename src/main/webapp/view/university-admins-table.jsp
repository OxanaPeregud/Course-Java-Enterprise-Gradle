<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Admins</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/univer-style.css">
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Admins Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add Admins"
               onclick="window.location.href='university-add-admins'; return false;"
               class="add-button"
        />

        <table>
            <tr>
                <th>Admin ID</th>
                <th>Name</th>
            </tr>

            <%--@elvariable id="admins" type="java.util.List"--%>
            <c:forEach var="tempAdmin" items="${admins}">

                <tr>
                    <td> ${tempAdmin.id} </td>
                    <td> ${tempAdmin.name} </td>
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
