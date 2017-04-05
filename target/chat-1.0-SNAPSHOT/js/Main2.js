$('.registration').click(function () {

    var JsonSubject = {name: $("input[name=name]").val(), mail: $("input[name=mail]").val()};


    $.ajax({
        type: "POST",
        url: "uregistration",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(JsonSubject),
        timeout: 120000,
        success: function (data) {
            var variable = "<h1>" + " Вы зарегистрировались как " + data + "</h1>";
            $('.content').css({display: none});
            $('.container1').html(variable);
        }, error: function () {
            alert("vawe huin9");
        }
    })

});



