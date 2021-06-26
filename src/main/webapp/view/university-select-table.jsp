<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Select</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/univer-style.css">
</head>

<body>

<div class="dropdown">
    <button class="dropdown-button">Tables Dropdown</button>
    <div class="dropdown-list">

        <label>
            <select onchange="location = this.value;">
                <option>Choose table</option>
                <option value="${pageContext.request.contextPath}/university-get-admins-table">Admins</option>
                <option value="${pageContext.request.contextPath}/university-get-students-table">Students</option>
                <option value="${pageContext.request.contextPath}/university-get-courses-table">Courses</option>
                <option value="${pageContext.request.contextPath}/university-get-teachers-table">Teachers</option>
                <option value="${pageContext.request.contextPath}/university-get-student-results-table">Student
                    Results
                </option>
                <option value="${pageContext.request.contextPath}/university-get-tasks-table">Tasks</option>
            </select>
        </label>

    </div>

    <p>
        <a href="${pageContext.request.contextPath}/add-cookie">Set Cookie</a>
    </p>

</div>

</body>
</html>
