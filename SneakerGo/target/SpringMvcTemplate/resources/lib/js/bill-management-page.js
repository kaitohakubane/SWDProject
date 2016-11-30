/**
 * Created by Hung on 11/23/2016.
 */
var BILL_DETAIL_URL = "/admin/bill-detail";
$(document).ready(function () {
    var $fromDate = $('#fromDate');
    var $toDate = $('#toDate');
    var dataTable = $('#bill-table');
    addDataTable(dataTable);
    $('.view-btn').on("click", function () {
        var button = $(this);
        alert(button.data('id'))
        $('#billDetail-form').attr('action', contextPath + BILL_DETAIL_URL);
        var input = $("<input>").attr("name", "billId").val(button.data('id'));
        var fromDate = $("<input>").attr("name", "fromDate").val($('#fromDate').val());
        var toDate = $("<input>").attr("name", "toDate").val($('#toDate').val());
        $('#billDetail-form').append(input);
        $('#billDetail-form').append(fromDate);
        $('#billDetail-form').append(toDate);
        $('#billDetail-form').submit();
    })
})