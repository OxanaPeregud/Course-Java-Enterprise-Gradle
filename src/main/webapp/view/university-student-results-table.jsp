<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Results</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/univer-style.css">
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Student Results Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add Student Results"
               onclick="window.location.href='university-add-student-results'; return false;"
               class="add-button"
        />

        <table>
            <tr>
                <th>Result ID</th>
                <th>Mark</th>
                <th>Review</th>
            </tr>

            <%--@elvariable id="studentresults" type="java.util.List"--%>
            <c:forEach var="tempStudentResults" items="${studentresults}">

                <tr>
                    <td> ${tempStudentResults.id} </td>
                    <td> ${tempStudentResults.mark} </td>
                    <td> ${tempStudentResults.review} </td>
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
