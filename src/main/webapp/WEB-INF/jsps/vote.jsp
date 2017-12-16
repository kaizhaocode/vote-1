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

		<form action="<c:url value='/vote.do'/>">
			<c:forEach items="${options }" var="option">
				<input type="radio" name="id" value="${option.id }" />${option.name }<br/>
			</c:forEach>
			<input type="submit" value="确定" />
		</form>
	</body>

</html>