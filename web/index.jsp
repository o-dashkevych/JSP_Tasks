<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Oleg
  Date: 9/17/2015
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Перечень заданий</title>
  </head>
  <body>
<table width=500px" align="center" border="1">
  <tr>
    <td>Номер</td>
    <td>Задача</td>
  </tr>
  <tr>
    <td>1</td>
    <td>Создать сервлет и взаимодействующие с ним классы и JSP-страницы, вы-
      полняющие следующие действия: генерация таблиц по переданным параметрам: заголовок, количество строк
      и столбцов, цвет фона.</td>
    <td>
      <form action="task1/table.jsp" >
        <input type="submit" value="Select">
      </form>
    </td>
  </tr>
  <tr>
    <td>2</td>
    <td>Поиск слова, введенного пользователем. Поиск и определение частоты встре-
      чаемости осуществляется в текстовом файле, расположенном на сервере.</td>
    <td>
      <form action="task2/finder.jsp" >
        <input type="submit" value="Select">
      </form>
    </td>
  </tr>
</table>
  </body>
</html>
