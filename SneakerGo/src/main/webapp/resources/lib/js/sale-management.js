/**
 * Created by Hung on 11/23/2016.
 */
var SEARCH_SALE_URL="/admin/sale-management/search";
$(document).ready(function(){
    var dataTable=$('#sale-table');
    addDataTable(dataTable);
    setLabel();
    $("#search-btn").on("click", function () {
        if ($('#fromDate').val() != null && $('#toDate').val() != null) {
            $('#search-form').attr('action', contextPath + SEARCH_SALE_URL);
            $('#search-form').submit();
        }
    })
})