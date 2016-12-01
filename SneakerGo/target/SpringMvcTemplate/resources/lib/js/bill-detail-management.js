/**
 * Created by Hung on 11/26/2016.
 */

$(document).ready(function () {
    var dataTable = $('#bill-detail-table');
    addDataTable(dataTable);

    $('#back-label').on("click", function () {
        var label = $(this);
        $('#back-form').attr('action', contextPath + BILL_PAGE_URL);
        var fromDate = $("<input>").attr("name", "fromDate").val(label.data('from'));
        var toDate = $("<input>").attr("name", "toDate").val(label.data('to'));
        $('#back-form').append(fromDate);
        $('#back-form').append(toDate);
        $('#back-form').submit();
    })
})