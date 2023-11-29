<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
    <form:form action="registration_sucess" method="get" modelAttribute="userinfo" >

        <label for="username">User Name :</label>
        <form:input type="text" id="username" path="username"/>
        <form:errors path="username"/>
        <br/>
        <label for="age">Age :</label>
        <form:input type="number" id="age" path="age"></form:input>
        <form:errors path="age"/>
        <br/>
        <label for="password">Password :</label>
        <form:input type="password" id="password" path="password" />
        <form:errors path="password"/>
        <br/>

        <h2>Contact Us</h2>
        <label for="email">Email :</label>
        <form:input  id="email" path="contact.email"/>
        <form:errors path="contact.email"/>
        <br/>
        <label for="phoneNumber">phone number :</label>
        <form:input path="contact.phone" id="phoneNumber"/>
        <form:errors path="contact.phone"/>
        <br/>

        <input type="submit" value="register"/>
    </form:form>
</body>
</html>
