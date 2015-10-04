<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 1</title>
</head>
<body>
<div>
    <h3>
        Description:
    </h3>
        <p>
            Создать сервлет и взаимодействующие с ним классы и JSP-страницы, вы-
            полняющие следующие действия: генерация таблиц по переданным параметрам: заголовок, количество строк
            и столбцов, цвет фона.
        </p>
</div>
<br>
<div>
    <form name="TableGen" action="/table_gen" method="post">
        К-во строк
        <input name="rows" type="number" style="width: 50px">
        К-во столбцов
        <input name="columns" type="number" style="width: 50px">
        Цвет
        <input name="color" type="color">

        <input type="submit" name="button" value="Submit">
    </form>
</div>
</body>
</html>
