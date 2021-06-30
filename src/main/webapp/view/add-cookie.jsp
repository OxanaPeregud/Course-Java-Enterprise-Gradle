<html>
<body>
<form action="${pageContext.request.contextPath}/set-cookie" method="GET">

    First Name: <label>
    <input type="text" name="first_name">
</label>
    <br/>
    Last Name: <label>
    <input type="text" name="last_name"/>
</label>
    <br/>
    Password: <label>
    <input type="text" name="password"/>
</label>
    <input type="submit" value="Submit"/>
</form>

<p>
    <a href="${pageContext.request.contextPath}/login">Go back to login</a>
</p>

</body>
</html>
