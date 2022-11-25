//$(document).ready(function(){
//
//
//
//});
$(document).ready(function () {

    $('#paymentstable').DataTable();
    $('#table1').DataTable();





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
    success: function (data) {
    		                 alert("oldu")
    		             },
    		             error: function (e) {
    		             alert("olamdı");
    		             }
});

});


//$(document).ready(function () {
//    $('#paymentstable').DataTable({
//        footerCallback: function (row, data, start, end, display) {
//            var api = this.api();
//
//            // Remove the formatting to get integer data for summation
//            var intVal = function (i) {
//                return typeof i === 'string' ? i.replace(/[\$,]/g, '') * 1 : typeof i === 'number' ? i : 0;
//            };
//
//            // Total over all pages
//            total = api
//                .column(1)
//                .data()
//                .reduce(function (a, b) {
//                    return intVal(a) + intVal(b);
//                }, 0);
//
//            // Total over this page
//            pageTotal = api
//                .column(1, { page: 'current' })
//                .data()
//                .reduce(function (a, b) {
//                    return intVal(a) + intVal(b);
//                }, 0);
//
//            // Update footer
//            $(api.column(1).footer()).html('$' + pageTotal + ' ( $' + total + ' total)');
//        },
//    });
//});

















