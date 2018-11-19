<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
 <title><tiles:getAsString name="title"/></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
</head>

<body>
<div class="container">
	<div class="row header">
		<div class="col-md-12">
	  		<tiles:insertAttribute name="header" />
	  	</div>
	</div>
	
<%-- 	<div class="row nav">
		<div class="col-md-12">
		  <tiles:insertAttribute name="menu" />
		</div>
	</div> --%>
	
	<div class="row body">
		<div class="col-md-12">
	   		<tiles:insertAttribute name="body" />
		</div>
	</div>
	
	<div class="row footer">
		<div class="col-md-12">
	  		<tiles:insertAttribute name="footer" />
		</div>
	</div>
</div>	
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>  	
</body>
</html>
