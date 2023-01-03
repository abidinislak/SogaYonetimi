
$("#formUpdateButton").click(function(){



var dataObject = {
    'userName': $('#userName').val(),
    'personName': $('#personelName').val(),
    'personLastName': $('#personelastName').val(),
    'password': $('#passWord').val(),
    'id': $('#userid').val()
};


$.ajax({
    url: '/userUpdate',
    type: 'POST',
    contentType: 'application/json',
    data:JSON.stringify(dataObject),
    dataType: 'json',
    success: function (data) {

    		                 alert("oldu");
    		             },
   error: function (e) {
    		             alert(e);

    		             }
});

});