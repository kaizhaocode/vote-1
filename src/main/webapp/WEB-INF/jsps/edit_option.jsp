<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>添加选项</title>
		<script type="text/javascript" src="js/jquery-1.8.3.js"></script>

		<script>
			$(function() {
				var isFirstOption = true;
				$("#add_title").click(function() {
					//如果是第一次添加选项, 直接创建
					if(isFirstOption){
						$("#add_title").before($("<p><input name='option' type='text' /><button>删除</button></p>"));
						isFirstOption = false;
						return false;
					}else{//
						var len = $("input[name=option]").length;
						var allInputs =  $("input[name=option]");
						var lastContent = $(allInputs[len-1]).val()
						if(lastContent==""){
							alert("上一个选项为空")
							return false;
						}else{
							$("#add_title").before($("<p><input name='option' type='text' /> <button>删除</button></p>"));
						}
					}
					
				});
				$("#sub").click(function(){
					var len = $("input[name=option]").length;
					var allInputs =  $("input[name=option]");
					var lastContent = $(allInputs[len-1]).val()
					if(lastContent==""){
						alert("选项不能为空")
						return false;
					}else{
						$("#form1").submit();
					}
				});
			});
		</script>
	</head>
	<body>
		
		<form id="form1" action="<c:url value='/editOption.do'/>">
			<input type="hidden" name="tid" value="${tid }"/>
			<c:forEach items="${options}" var="option">
				<input name='option' type='text' value="${option.name }"/> <a href="#">删除选项</a></p>
			</c:forEach>
			<input type="button" value="添加选项" id="add_title" />
			<input id="sub" type="button" value="完成编辑" />
		</form>
	</body>
</html>
