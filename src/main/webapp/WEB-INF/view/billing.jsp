<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Billing</title>
</head>
<body>
    <h1>this is a billing page </h1>
    <form:form action="billing_sucess" method="get" modelAttribute="bill">
        <label for="card">card Number :</label>
        <form:input id="card" path="cardnumber"></form:input>
        <label for="amount">amount :</label>
        <form:input id="amount" path="amount"></form:input>

        <input type="submit" value="submit">
    </form:form>
</body>
</html>
