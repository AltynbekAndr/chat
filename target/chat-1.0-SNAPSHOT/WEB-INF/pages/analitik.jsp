<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Аналитика и цены </title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/cssforanalitic.css"/>
    <link rel="shortcut icon" type="image/png" href="images/icon_project2.png"/>
</head>
<body>
<div class="container">
    <%@ include file="head.jsp"%>
    <%@ include file="footer.jsp"%>
    <%@ include file="email.jsp"%>
    <h1 class="result"></h1>
    <img src="/talasagro.com/analitikaicenyajaxphoto" class="myimage">
    <p class="result2"></p>
    <%@ include file="footer2.jsp"%>

</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js">
</script>

<script type="text/javascript">
    function a(){
        $.ajax({
            url: '/talasagro.com/analitikaicenyajax',
            dataType:'json',
            success: function(data) {
                $('.result').html(data.postName);
                $('.result2').html(data.text);


            }
        });

    }
</script>
<script type="text/javascript">
    a();
</script>

</body>
</html>
