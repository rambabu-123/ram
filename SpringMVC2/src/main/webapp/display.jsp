<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="grey">
<h1 align="center">
username: <%=request.getAttribute("username") %>
password: <%=request.getAttribute("password") %>
email: <%=request.getAttribute("email") %>
phno: <%=request.getAttribute("phno") %>
</h1>
</body>
</html>