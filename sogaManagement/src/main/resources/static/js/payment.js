//$(document).ready(function(){
//
//
//
//});

$("#formUpdateButton").click(function(){

alert("test ankara");

var dataObject = {
    'userName': $('#userName').val(),
    'personName': $('#personelName').val(),
    'personLastName': $('#personelastName').val(),
    'password': $('#passWord').val()
};


$.ajax({
    url: '/userUpdate',
    type: 'POST',
    contentType: 'application/json',
    data:JSON.stringify(dataObject),
    dataType: 'json',
    success: function (data) {
    		                 alert("oldu")
    		             },
    		             error: function (e) {
    		             alert("olamdı");
    		             }
});

});