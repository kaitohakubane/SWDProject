/**
 * Created by Hung on 11/26/2016.
 */

var SEARCH_BILL_URL = "/admin/bill-management/search";
$(document).ready(function () {
    var dataTable = $('#bill-detail-table');
    addDataTable(dataTable);

    $('#back-label').on("click", function () {
        var label = $(this);
        $('#back-form').attr('action', contextPath + SEARCH_BILL_URL);
        var fromDate = $("<input>").attr("type", "hidden")
        var toDate = $("<input>").attr("type", "hidden")
        fromDate = fromDate.attr("name", "fromDate").val(label.data('from'));
        toDate = toDate.attr("name", "toDate").val(label.data('to'));
        $('#back-form').append(fromDate);
        $('#back-form').append(toDate);
        $('#back-form').submit();
    })
})