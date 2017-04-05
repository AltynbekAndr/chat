<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main3.css"/>
    <link rel="shortcut icon" type="image/png" href="images/icon_project2.png"/>
</head>

<body>
<div class="container">
<%@ include file="head.jsp"%>
<%@ include file="footer.jsp"%>
<%@ include file="email.jsp"%>
    <div>
        <img class="sertificate" src="images/sertificate.jpg" alt="сертификат таллаский осоо таалай сервис"/>
    </div>
     <form action="autorization" method="GET" class="form">
         <input type="submit" value="войти" class="submit"/>
     </form>
    <div class="mycontainerr">


        <div class="container2">
            <h6> Название фирмы:</h6>
            <p>ОсОО Таалай Сельхоз Сервис</p>
        </div>
        <div class="container2">
            <h6> Вид деятельности:</h6>
            <p>Сельскохозяйственные предприятия</p>
        </div>
        <div class="container2">
            <h6>Описание деятельности: </h6>
            <p>"ОсОО Таалай Сельхоз Сервис"-производство и поставки кукурузного крахмала, патоки, глютена, зародыша, сухого корма. Закупка и продажа сельскохозяйственных культур.</p>

        </div>
        <div class="container2">
            <h6> Доп.информация: </h6>
            <p>роизводит качественные продукты из генетически немодифицированного кукурузного зерна, которое выращено на собственных сельскохозяйственных землях в Воронежской области. Предприятие оснащено современным высокотехнологичным оборудованием и способно переработать до 300 тонн кукурузы,пшена,горох в сутки.</p>
        </div>
        <div class="container2">
            <h6> Ф.И.О руководителя: </h6>
            <p>Т.Абдиев</p>
        </div>
        <div class="container2">
            <h6> Адрес: </h6>
            <p>Кыргызская республика,Таласская область,Таласский район,село А.Огонбаева,Сыдыка,№29</p>
        </div>
        <div class="container2">
            <h6> Email: </h6>
            <p>OsOOTaalaiSelhozService@gmail.com</p>
        </div>
        <div class="container2">
            <h6>  Тел.номер: </h6>
            <p>+9967797513465</p>
        </div>

    </div>

    <%@ include file="footer2.jsp"%>












</div>



</body>



</html>