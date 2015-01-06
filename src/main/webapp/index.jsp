<%@ page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html ng-app="ems">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/javascript/angular.js"></script>
<title>JSP Page</title>
</head>
<body>
	<h1>Employee Management System</h1>
	<div border="1" id="search_employee">
		<button>Search</button>
	</div>
	<div border="1" ng-controller="add_button">
		<button>Add Employee</button>
	</div>
</body>
</html>