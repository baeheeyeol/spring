<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<link href="${path}/resources/css/styles.css" rel="stylesheet"/> 	
<html>
<head>
</head>
<body>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="content" />
</body>
</html>
