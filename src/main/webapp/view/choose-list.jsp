<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Select</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/univer-style.css">
</head>

<body>

<div class="dropdown">
    <button class="dropdown-button">Dropdown</button>
    <div class="dropdown-list">

        <label>
            <select onchange="location = this.value;">
                <option>Choose list</option>
                <option value="${pageContext.request.contextPath}/list-courses">Courses</option>
                <option value="${pageContext.request.contextPath}/list-students">Students</option>
                <option value="${pageContext.request.contextPath}/list-teachers">Teachers</option>
            </select>
        </label>

    </div>
</div>

</body>
</html>
