<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Courses</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/univer-style.css">
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Courses Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add Courses"
               onclick="window.location.href='university-add-courses'; return false;"
               class="add-button"
        />

        <table>
            <tr>
                <th>Course ID</th>
                <th>Name</th>
            </tr>

            <%--@elvariable id="courses" type="java.util.List"--%>
            <c:forEach var="tempCourse" items="${courses}">

                <tr>
                    <td> ${tempCourse.id} </td>
                    <td> ${tempCourse.name} </td>
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
