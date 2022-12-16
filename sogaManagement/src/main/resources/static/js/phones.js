$(document).ready(function(){



$('#tableUserPlates').DataTable( {
        dom: 'Bfrtip',
        buttons: [
                    'copyHtml5',
                    'excelHtml5',
                    'pdfHtml5'
                ]
    } );




});