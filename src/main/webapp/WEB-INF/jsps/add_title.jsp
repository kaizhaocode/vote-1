<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

	<head>
		<meta charset="UTF-8">
		<title>创建投票标题</title>
		<script type="text/javascript" src="js/jquery-1.8.3.js"></script>

		<script>
			$(function() {
				$("#add_title").click(function(){
					var title = $("#title").val();
					if(title==""){
						alert('标题不能为空!');
						return false;
					}
					$("#form1").submit();
					
				});
			});
		</script>
	</head>

	<body>
		<form id="form1" action="<c:url value='/addTitle.do'/>">
			投票名称 <input id="title" name="titleName" /><br/>

			<input type="button" value="立即创建" id="add_title" />

		</form>

	</body>

</html>