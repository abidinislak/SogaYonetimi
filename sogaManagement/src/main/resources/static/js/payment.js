
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
















