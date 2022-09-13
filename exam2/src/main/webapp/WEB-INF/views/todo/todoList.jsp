<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
 <div id="myDIV" class="header">
  <h2>My To Do List</h2>
  <input type="text" id="myInput" placeholder="Title...">
  <span onclick="newElement()" class="addBtn">Add</span>
</div>
<ul>
<c:forEach var="list" items="${todoList }" >
<li<c:if test="${list.todoyn eq '1' }" class="checked"/><c:if "${list.todoyn ne '1' }" class="check"/>>
${list.no } ${list.contents }<span class="close">x</span>
</li>
</c:forEach>
</ul>
</body>
<script>
function newElement(){
	$.ajax({
		url : 'insert',
		type : post,
		data : {contents : $('#myInput').val()},
		dataType:'json'
		success :function(data){
			console.log(data)
		}
		
	})
}
</script>
</html>