<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление статьи</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main5.css"/>
    <link rel="shortcut icon" type="image/png" href="images/icon_project2.png"/>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js">
    </script>

</head>
<body>

<div id="chx">
    <h2>опубликовать статью в:</h2>
    <input type="radio" name="radio" id="r1">

    <p>Аналитика и цены</p><br/>
    <input type="radio" name="radio" id="r2">

    <p>Сельхозтехника</p><br/>
    <input type="radio" name="radio" id="r3">

    <p>Торговая площадка</p><br/>

</div>

<form method="POST" action="a/b/c/uploadFile1" enctype="multipart/form-data" class="form1">

    <h3>Название статьи для страницы Аналитика и цены</h3><br/>
    <input type="text" value="название статьи" name="postname" class="lergeinput" maxlength="100" disabled/><br/>

    <h4>Загрузка фото: макс.размер не должен превышать 1mb</h4>
    <input type="file" name="file" class="file" disabled><br/>
    <textarea maxlength="2000" class="textarea" name="text" disabled>Основной текст:</textarea><br/>


    <input type="submit" value="отправить" class="submit" disabled/>
    <a href="/talasagro.com/analitikaiceny" class="ssylka">Просмотр: Аналитика и цены</a>
    <a href="/talasagro.com/torgovayaploshadka" class="ssylka">Просмотр: Торговая площадка</a>
    <a href="/talasagro.com/selhoztehnic" class="ssylka">Просмотр: Сельхозтехника</a>
</form>
<form method="POST" action="a/b/c/uploadFile2" enctype="multipart/form-data" class="form2">

    <h3>Название статьи для страницы Сельхозтехника</h3><br/>
    <input type="text" value="название статьи" name="postname" class="lergeinput" maxlength="100" disabled/><br/>

    <h4>Загрузка фото: макс.размер не должен превышать 1mb</h4>
    <input type="file" name="file" class="file" disabled><br/>
    <textarea maxlength="2000" class="textarea" name="text" disabled>Основной текст:</textarea><br/>


    <input type="submit" value="отправить" class="submit" disabled/>
    <a href="/talasagro.com/analitikaiceny" class="ssylka">Просмотр: Аналитика и цены</a>
    <a href="/talasagro.com/torgovayaploshadka" class="ssylka">Просмотр: Торговая площадка</a>
    <a href="/talasagro.com/selhoztehnic" class="ssylka">Просмотр: Сельхозтехника</a>
</form>
<form method="POST" action="a/b/c/uploadFile3" enctype="multipart/form-data" class="form3">

    <h3>Название статьи для страницы Торговая площадка</h3><br/>
    <input type="text" value="название статьи" name="postname" class="lergeinput" maxlength="100" disabled/><br/>

    <h4>Загрузка фото: макс.размер не должен превышать 1mb</h4>
    <input type="file" name="file" class="file" disabled><br/>
    <textarea maxlength="2000" class="textarea" name="text" disabled>Основной текст:</textarea><br/>


    <input type="submit" value="отправить" class="submit" disabled/>
    <a href="/talasagro.com/analitikaiceny" class="ssylka">Просмотр: Аналитика и цены</a>
    <a href="/talasagro.com/torgovayaploshadka" class="ssylka">Просмотр: Торговая площадка</a>
    <a href="/talasagro.com/selhoztehnic" class="ssylka">Просмотр: Сельхозтехника</a>
</form>


<script>


    $('#r1').change(
            function () {

                $('.lergeinput').prop('disabled', false);
                $('.file').prop('disabled', false);
                $('.textarea').prop('disabled', false);
                $('.submit').prop('disabled', false);

                $('.form1').css('display', 'block');
                $('.form2').css('display', 'none');
                $('.form3').css('display', 'none');
            }
    );
    $('#r2').change(
            function () {
                $('.lergeinput').prop('disabled', false);
                $('.file').prop('disabled', false);
                $('.textarea').prop('disabled', false);
                $('.submit').prop('disabled', false);

                $('.form1').attr('disabled', 'enabled');
                $('.form1').css('display', 'none');
                $('.form2').css('display', 'block');
                $('.form3').css('display', 'none');
            }
    );
    $('#r3').change(
            function () {
                $('.lergeinput').prop('disabled', false);
                $('.file').prop('disabled', false);
                $('.textarea').prop('disabled', false);
                $('.submit').prop('disabled', false);

                $('.form1').attr('disabled', 'enabled');
                $('.form1').css('display', 'none');
                $('.form2').css('display', 'none');
                $('.form3').css('display', 'block');
            }
    )

</script>


</body>
</html>
