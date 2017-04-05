<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/cssforautorization.css"/>
    <link rel="shortcut icon" type="image/png" href="images/icon_project2.png"/>

</head>
<body>
<div class="mydiv">
    <form action="autorizationfs" method="post">

        <input type="text" value="введите имя" maxlength="20" class="intext" name="name">

        <h1>введите пароль :</h1>
        <input type="password" value="password" maxlength="20" class="inpass" name="password">
        <input type="submit" value="войти" class="send">
    </form>
</div>
</body>
</html>
