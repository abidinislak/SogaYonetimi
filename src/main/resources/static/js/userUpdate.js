

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



});