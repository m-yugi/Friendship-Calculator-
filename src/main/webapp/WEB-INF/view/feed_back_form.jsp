<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>feedback</title>
</head>
<body>
<!-- <h1>cooming soon!</h1> -->
<h1>feed back</h1>
<form:form action="feedbackprocess" method="POST" modelAttribute="feedback">
    <label for="name">Name :</label>
    <form:input type="text" id="name" path="username"></form:input>
    <form:errors path="username"/>
    <br/>
    <label for="email">Email :</label>
    <form:input type="email" id="email" path="email"></form:input>
    <form:errors path="email"/>
    <br/>
    <form:checkbox path="aggred" label="do you want us to send conformation email"></form:checkbox>
    <label for="response"> FeedBack :</label>
    <form:input type="text" id="response" path="feedback"></form:input>
    <form:errors path="feedback"/>
    <br/>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
