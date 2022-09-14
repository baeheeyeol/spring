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
  <input type="text" name = "contents" id="myInput" placeholder="Title...">
  <span onclick="newElement()" class="addBtn">Add</span>
</div>

<ul id="list">
<c:forEach var="list" items="${todoList}">
<li <c:if test="${list.todoyn eq '1' }">class='checked'</c:if>
		<c:if test="${list.todoyn ne '1' }">class='check'</c:if>
		>${ list.no} ${list.contents }<span class="close">x</span></li>
</c:forEach>
</ul>
<script>
function newElement(){
	console.log("ajaxtest");
	$.ajax({
    url : '/java/todo',
    type : 'post',
    data : {contents : $('#myInput').val()},
    dataType :'json',
    success:function(data){
    	console.log(data.no)
    	if(data.todoyn ==1)(
    	$('#list').append("<li class='checked'>"+data.no+" "+data.contents+"<span class='close'>x</span></li>")
    	)
    	else if(data.todoyn !=1)(
    	$('#list').append("<li class='check'>"+data.no+" "+data.contents+"<span class='close'>x</span></li>")
    	)
    },
    error:function(data){}
  })
}
$(document).on('click', '.close', function(e){

});
</script>
</body>
</html>