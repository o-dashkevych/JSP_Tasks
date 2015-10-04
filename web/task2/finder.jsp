<%--
  Created by IntelliJ IDEA.
  User: Oleg
  Date: 9/20/2015
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 2</title>
</head>
<body>
<div>
  <h3>
    Description:
  </h3>
  <p>
    Поиск слова, введенного пользователем. Поиск и определение частоты встре-
    чаемости осуществляется в текстовом файле, расположенном на сервере.
  </p>
</div>
<br>
<div>
    Введите слово для поиска в файле:
    <form action="/find_word" method="post">
        <input type="text" name="word" style="width: 150px" />
        <input type="submit" name="button" value="Accept" />
    </form>
<br>
    ${count}

</div>
</body>
</html>
