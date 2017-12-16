<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    pageContext.setAttribute("basePath", request.getContextPath()) ;
%>
<html>
<body>
	<c:redirect url="/main.do"></c:redirect>
</body>
</html>
