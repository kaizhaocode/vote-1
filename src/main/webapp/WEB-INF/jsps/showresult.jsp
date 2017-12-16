<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<c:forEach items="${options }" var="option">
			${option.name } -----  ${option.count }票<br>
		</c:forEach>
		<a href="<c:url value='/main.do'/>">返回列表</a>
	</body>
</html>
