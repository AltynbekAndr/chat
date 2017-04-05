<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main2.css"/>
</head>
<body>

<div class="p1" align="center">
    <table border="0">
        <tr align="center">
            <td colspan="3"><img class="p5" src="images/psheno.jpg" name="slide_show"
                                 alt="талас,тоо буурчак,kyrgyzstan,talas"></td>
        </tr>

    </table>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js">
</script>

<script type="text/javascript">
    all_images = ["images/psheno.jpg",
        "images/combain2.jpg",
        "images/combain3.jpg",
        "images/psheno1.jpg"];
    var ImgNum = 0;
    var ImgLength = all_images.length - 1;
    var delay = 2500;
    var lock = false;
    var run;

    function chgImg(direction) {
        if (document.images) {
            ImgNum = ImgNum + direction;
            if (ImgNum > ImgLength) {
                ImgNum = 0;
            }
            if (ImgNum < 0) {
                ImgNum = ImgLength;
            }
            document.slide_show.src = all_images[ImgNum];
        }
    }

    function auto() {
        if (lock == true) {
            lock = false;
            window.clearInterval(run);
        }
        else if (lock == false) {
            lock = true;
            run = setInterval("chgImg(1)", delay);
        }
    }
</script>
<script type="text/javascript">
    auto();
</script>

</body>
</html>
