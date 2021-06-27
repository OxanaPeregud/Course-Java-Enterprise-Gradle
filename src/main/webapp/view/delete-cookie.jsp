<html>
<head>
    <title>Delete Cookies</title>
</head>

<body>
<div style="text-align: center;">
    <h1>Delete Cookies</h1>
</div>
<%
    Cookie cookie;
    Cookie[] cookies;

    cookies = request.getCookies();

    if (cookies != null) {
        out.println("<h2> Found Cookies</h2>");

        for (Cookie value : cookies) {
            cookie = value;

            if ((cookie.getName()).compareTo("first_name") == 0) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                out.print("Deleted cookie: " +
                        cookie.getName() + "<br/>");
            }
            out.print("Name : " + cookie.getName() + ",  ");
            out.print("Value: " + cookie.getValue() + " <br/>");
        }
    } else {
        out.println(
                "<h2>No cookies found</h2>");
    }
%>

<p>
    <a href="${pageContext.request.contextPath}/add-cookie">Add Cookie</a>
</p>

<p>
    <a href="${pageContext.request.contextPath}/read-cookie">Read Cookie</a>
</p>

<p>
    <a href="${pageContext.request.contextPath}/login">Go back to login</a>
</p>

</body>
</html>
