<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("basePath", basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>index</title>
	<base href="${basePath}">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="resources/images/favicon-16x16.png" rel="icon" type="image/png" sizes="16x16">
	<link href="resources/images/favicon-32x32.png" rel="icon" type="image/png" sizes="32x32">
	<link href="resources/images/favicon-48x48.png" rel="icon" type="image/png" sizes="48x48">
	<link href="resources/images/favicon-64x64.png" rel="icon" type="image/png" sizes="64x64">
	<link href="resources/images/favicon-96x96.png" rel="icon" type="image/png" sizes="96x96">
	<link href="images/favicon.ico" rel="shortcut icon" type="image/x-icon"> 
	<link href="resources/images/favicon-96x96.png" rel="apple-touch-icon-precomposed" sizes="96x96">
</head>
<body>
	indexs首页
</body>
</html>
