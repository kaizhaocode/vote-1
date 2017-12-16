<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

	<head>
		<meta charset="utf-8" />
		<script type="text/javascript" src="<c:url value='/js/jquery-1.8.3.js'/>" ></script>
		<script type="text/javascript">
			
			$(function(){
				$("#create").focus(function(){
					$("#create").val("");
				});
			})
			
		</script>
		<title></title>
		<style>
			#form1{
				display: inline;
				margin-left: 30px;
			}
			
			ul {
				list-style: none;
			}
			li {display:block; width:1000px; height:40px; 
				border:1px solid red; line-height: 40px;
				margin-bottom: 30px;}
			li a { margin-left: 30px;}
		</style>
	</head>

	<body>
		
		<a href="<c:url value='/toAddTitleUI.do'/>"><input type="button" value="创建问卷" /></a>
	
		<form id="form1" action="<c:url value='/findTitle.do'/>" method="post">
			<input id="create" name="titleName" type="text" value="${condition }" />  
			<input type="submit" value="搜索"/>
		</form>
		
		<hr />
		
		<ul>
			<c:forEach items="${ titles}" var="title">
				<li>
					<a href="<c:url value='toVoteUI.do?tid=${title.id}'/>">${title.name }</a>
					<a href="<c:url value='/showResult.do?tid=${title.id}'/>">查看投票结果</a>
					<a href="<c:url value='/toEditUI.do?tid=${title.id}'/>">编辑问卷</a>
					<a href="<c:url value='/deleteTitle.do?id=${title.id}'/>">删除问卷</a>
				</li>
			</c:forEach>
		</ul>
	</body>
</html>