<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HEMLOME</title>
    <!-- <spring:url value="/resources/css/homepage.css" var="homepageCss" /> -->
    <!-- <link rel="stylesheet" href="../css/homepage.css"> -->
    <!-- <link rel="stylesheet" href="${homepageCss}" type="text/css"> -->
    
<link href="/lovcal/resources/css/homepage.css" rel="stylesheet" >
</head>
<body>
    <h1 class="logo">Love Caluclator</h1>
    <form:form action="processHomePage" method="get" modelAttribute="userinfo">
        <div class="form_container">
            <div class="yourname_container">
                <label for="yourname" class="label">your name</label>
                <form:input type="text" id="yourname" path="yourname" class="inputs"/>
                <form:errors path="yourname" class="errors"/>
            </div>
                <br/>
            <div class="hername_container">
                <label for="hername" class="label">Her name</label>
                <form:input type="text" id="hername" path="hername" class="inputs"/>
                <form:errors path="hername" class="errors"/>
            </div>
                <br/>
            <div class="checkbox_container">
                <form:checkbox path="aggred" label="i am doing this for fun" id="checkbox"></form:checkbox>
                <form:errors path="aggred" class="errors"/>
            </div>
                <br/>
            <input type="submit" value="caluclate" class="btn"/>
        </div>
        </form:form>
</body>
</html>
