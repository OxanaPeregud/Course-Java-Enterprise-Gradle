<%
    Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
    Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));
    Cookie password = new Cookie("password", request.getParameter("password"));

    firstName.setMaxAge(60 * 60 * 24);
    lastName.setMaxAge(60 * 60 * 24);
    password.setMaxAge(60 * 60 * 24);

    response.addCookie(firstName);
    response.addCookie(lastName);
    response.addCookie(password);
%>

<html>
<head>
    <title>Set Cookies</title>
</head>

<body>
<div style="text-align: center;">
    <h1>Set Cookies</h1>
</div>
<ul>
    <li><p><b>First Name:</b>
        <%= request.getParameter("first_name")%>
    </p></li>
    <li><p><b>Last Name:</b>
        <%= request.getParameter("last_name")%>
    </p></li>
    <li><p><b>Password:</b>
        <%= request.getParameter("password")%>
    </p></li>
</ul>

<p>
    <a href="${pageContext.request.contextPath}/read-cookie">Read Cookie</a>
</p>

<p>
    <a href="${pageContext.request.contextPath}/delete-cookie">Delete Cookie</a>
</p>

<p>
    <a href="${pageContext.request.contextPath}/login">Go back to login</a>
</p>

</body>
</html>
