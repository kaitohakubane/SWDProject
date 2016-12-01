/**
 * Created by Hung on 11/23/2016.
 */
var BILL_DETAIL_URL = "/admin/bill-detail";
var SEARCH_BILL_URL = "/admin/bill-management/search";
var DELETE_BILL_URL = "/admin/bill-management/delete";
var BILL_CONFIRM_MSG = "Are you sure to delete bill ";
$(document).ready(function () {
    var $fromDate = $('#fromDate');
    var $toDate = $('#toDate');
    var dataTable = $('#bill-table');
    addDataTable(dataTable);
    $('.view-btn').on("click", function () {
        var button = $(this);
        $('#billDetail-form').attr('action', contextPath + BILL_DETAIL_URL);
        var input = $("<input>").attr("type", "hidden")
        var fromDate = $("<input>").attr("type", "hidden")
        var toDate = $("<input>").attr("type", "hidden")
        input.attr("name", "billId").val(button.data('id'));
        fromDate.attr("name", "fromDate").val($('#fromDate').val());
        toDate.attr("name", "toDate").val($('#toDate').val());

        $('#billDetail-form').append(input);
        $('#billDetail-form').append(fromDate);
        $('#billDetail-form').append(toDate);
        $('#billDetail-form').submit();
    })

    $("#search-btn").on("click", function () {
        if ($('#fromDate').val() != null && $('#toDate').val() != null) {
            $('#search-form').attr('action', contextPath + SEARCH_BILL_URL);
            $('#search-form').submit();
        }
    })

    $('.delete-btn').off("click").on("click", function () {
        var button = $(this);
        var confirmData = {
            'title': CONFIRM_INFORMATION_TITLE,
            'content': BILL_CONFIRM_MSG + button.data('id')
        }
        showConfirmModal(deleteBill, confirmData, [button.data("id")]);
    })

    setEnabledLabel();
})

function deleteBill(billID) {
    $(".confirm-modal").modal("hide")
    var Data = {
        "billId": billID
    }
    var requestURL = contextPath + DELETE_BILL_URL;
    var requestMethod = "POST";
    $.ajax({
        url: requestURL,
        type: requestMethod,
        data: Data,
        success: function () {
            var notifyData = {
                'title': 'Delete Product',
                'content': 'Delete bill successfully'
            }
            showNotifyModal(contextPath + BILL_PAGE_URL, true, notifyData);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error(textStatus);
        }
    });
}