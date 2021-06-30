<html>
<head>
    <title>Read Cookies</title>
</head>

<body>
<div style="text-align: center;">
    <h1>Read Cookies</h1>
</div>
<%
    Cookie cookie;
    Cookie[] cookies;

    cookies = request.getCookies();

    if (cookies != null) {
        out.println("<h2> Found Cookies</h2>");

        for (Cookie value : cookies) {
            cookie = value;
            out.print("Name : " + cookie.getName() + ",  ");
            out.print("Value: " + cookie.getValue() + " <br/>");
        }
    } else {
        out.println("<h2>No cookies found</h2>");
    }
%>

<p>
    <a href="${pageContext.request.contextPath}/add-cookie">Add Cookie</a>
</p>

<p>
    <a href="${pageContext.request.contextPath}/delete-cookie">Delete Cookie</a>
</p>

<p>
    <a href="${pageContext.request.contextPath}/login">Go back to login</a>
</p>

</body>
</html>
