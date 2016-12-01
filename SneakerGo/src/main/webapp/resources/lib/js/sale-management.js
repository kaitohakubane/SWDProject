/**
 * Created by Hung on 11/23/2016.
 */
$(document).ready(function(){
    var dataTable=$('#sale-table');
    addDataTable(dataTable);

    $(".status").each(function () {
        var real = $(this).text();
        if (real == "true") {
            $(this).html("<span class='status onStock'>Active</span>")
        }
        else {
            $(this).html("<span class='status sold'>Inactive</span>")
        }
    })
})