
$(document).ready(function () {

//    $('#paymentstable').DataTable();
//    $('#table1').DataTable();

$('#table1').DataTable( {
        dom: 'Bfrtip',
        buttons: [
                    'copyHtml5',
                    'excelHtml5',
                    'csvHtml5',
                    'pdfHtml5'
                ]
    } );

$('#paymentstable').DataTable( {
        dom: 'Bfrtip',
        buttons: [
                    'copyHtml5',
                    'excelHtml5',
                    'csvHtml5',
                    'pdfHtml5'
                ]
    } );



});





$("#phoneNumberAdd").click(function(){
var valueA=$("#phoneNumber").val();
var valueB=$("#userid").val();
	url = "/saveUserPhone";
		csrfValue = $("input[name='_csrf']").val();
params = {

phoneNumber : valueA,
userid : valueB,
			_csrf : csrfValue
		};
$.post(
	url,
	params,
	function(response)
	 {
			if (response == "Succes saved") {
window.location.replace("http://localhost:8080/userPage");
				}
		else if (response == "hata") {

								alert("OPPPS.. Something wrong");
							}
						}).fail(function() {
							alert("Oppss..  Something wrong and we dont know why, please conatct admin");
				});
});
























$("#formUpdateButton").click(function(){




var dataObject = {
    'userName': $('#userName').val(),
    'personName': $('#personelName').val(),
    'personLastName': $('#personelastName').val(),
    'password': $('#passWord').val(),
    'id' : $('#userid').val()
};


$.ajax({
    url: '/userUpdate',
    type: 'POST',
    contentType: 'application/json',
    data:JSON.stringify(dataObject),
    dataType: 'json',


}).done(function() {
    alert("qweqweqwe");
  });;

});
















