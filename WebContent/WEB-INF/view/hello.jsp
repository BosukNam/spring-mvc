<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>

인사말 : ${greeting}
<br/>

<table>
	<thead>
		<tr>
			<td>no</td><td>날짜</td><td>금액</td><td>구매내역</td>
		</tr>
	</thead>

	<tbody>
		<c:forEach var="account" items="${dataset}">
			<tr>
				<td>${account.id}</td>
				<td>${account.date}</td>
				<td>${account.amount}</td>
				<td>${account.content}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>