<%--
  Created by IntelliJ IDEA.
  User: amywilson
  Date: 2023-04-18
  Time: 3:47 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Food</title>
    <link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
<ul>
    <li><a href="index.jsp">Home</a> </li>
    <li><a href="SignIn.jsp">SignIn</a></li>
    <li><a href="Register.jsp">Register</a></li>
    <li><a href="Rating.jsp">Rating</a></li>
    <li><a href="FoodSearch.jsp" class="active">Food Search</a></li>
</ul>

<h1> Search Food</h1>

<p>This is where we will redirect from the sign in page</p>

<form  action="search-result-servlet">
        <pre>
        <input type="text" name="keyword" placeholder="keyword">
        <input type="submit" value="Search">
        </pre>
</form>

</body>
</html>
