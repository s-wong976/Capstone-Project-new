<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
<ul>
    <li><a href="index.jsp">Home</a> </li>
    <li><a href="SignIn.jsp">SignIn</a></li>
    <li><a href="Register.jsp" class="active">Register</a></li>

</ul>
<h2><%= "Registration" %></h2>
<form method = "post" action="register-servlet">
        <pre>
        <input type="text" name="name" placeholder="Enter your Name">
        <input type="text" name="email" placeholder="Enter your Email">
        <input type="text" name="password" placeholder="Enter your password">
        <input type="submit" value="Submit">
        </pre>
</form>
<br/>

</body>
</html>