<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>SignIn</title>
    <link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
<ul>
    <li><a href="index.jsp">Home</a> </li>
    <li><a href="SignIn.jsp" class="active">SignIn</a></li>
    <li><a href="Register.jsp">Register</a></li>
    <li><a href="Rating.jsp">Rating</a></li>
</ul>
<h3><%= "Sign In" %></h3>
<form  action="search-result-servlet">
        <pre>
        <input type="text" name="email" placeholder="Enter your Email">
        <input type="text" name="password" placeholder="Enter your password">
        <input type="submit" value="Log In">
        </pre>
</form>

<br/>

</body>
</html>