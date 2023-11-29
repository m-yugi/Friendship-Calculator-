<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Email</title>
</head>
<body>
    <h1>Hi ${userinfo.yourname}</h1>
    <h2>Send results to Email</h2>
    <form:form action="email_process" method="post" modelAttribute="email">
        <label for="Email">Email :</label>
        <form:input  path="userEmail" id="Email"></form:input>
        <form:errors path="userEmail"></form:errors>
        <input type="submit" value="submit">
    </form:form>
</body>
</html>
