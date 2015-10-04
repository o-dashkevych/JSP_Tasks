<%@ page import="java.awt.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  int rows = (Integer) request.getAttribute("rows");
  pageContext.setAttribute("rows", rows);
  int columns = (Integer)request.getAttribute("columns");
  pageContext.setAttribute("columns", columns);
  String color = (String) request.getAttribute("color");
  pageContext.setAttribute("color", color);
%>

<html>
<head>
    <title></title>
</head>
<body>
  <div>
    <table border="1" bgcolor="${color}">
      <c:forEach var="i" begin="1" end="${rows}">
        <tr>
        <c:forEach var="j" begin="1" end="${columns}">
          <td>${i}, ${j}</td>
        </c:forEach>
        </tr>
      </c:forEach>
    </table>
  </div>
</body>
</html>
