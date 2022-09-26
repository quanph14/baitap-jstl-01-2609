<%@ page import="javax.swing.*" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 9/26/2022
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Customer" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table border="1">
  <tr>
    <td>Name</td>
    <td>Birthday</td>
    <td>Address</td>
    <td>Image</td>
  </tr>
  <c:forEach var = "item" items = "${customersList}">
    <tr>
      <td><c:out value="${item.getName()}"></c:out></td>
      <td><c:out value="${item.getBirthday()}"></c:out></td>
      <td><c:out value="${item.getAddress()}"></c:out></td>
      <td><img src="<c:out value="${item.getImage()}"></c:out>"></td>
    </tr>

  </c:forEach>
</table>
</body>
</html>
