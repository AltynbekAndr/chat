//$('#button').click(function () {
//    var cit = $("#city").val();
//
//
//    var ValueCities = {city: cit};
//    $.ajax({
//        url: "city",
//        type: "POST",
//        contentType: "application/json",
//        dataType: "json",
//        data: JSON.stringify(ValueCities),
//
//        success: function (data) {
//            $('#1').html(data.id);
//            $('#2').html(data.country_id);
//            $('#3').html(data.state);
//            $('#4').html(data.city);
//            $('#5').html(data.region);
//            $('#6').html(data.biggest_city);
//
//
//        }, error: function () {
//            alert("vawe huin9");
//        }
//    })
//


$('#knopochka').click(function () {
    $.ajax({
        url: "createobject",
        type: "GET",
        contentType: "application/json",
        dataType: "json",

        success: function (data) {
            alert(data);
        }, error: function () {
            alert("vawe huin9");
        }
    })

});
