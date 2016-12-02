/**
 * Created by Hung on 11/23/2016.
 */
var SEARCH_SALE_URL="/admin/sale-management/search";
var SALE_PAGE_URL="/admin/sale-management";
var SALE_CONFIRM_MSG = "Are you sure to inactive this sale";
var DELETE_SALE_URL="/admin/sale-management/delete"
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

    $('.delete-btn').off("click").on("click", function () {
        var button = $(this);
        var confirmData = {
            'title': CONFIRM_INFORMATION_TITLE,
            'content': SALE_CONFIRM_MSG
        }
        showConfirmModal(deleteSale, confirmData, [button.data("id")]);
    })
})

function deleteSale(saleId) {
    $(".confirm-modal").modal("hide")
    var Data = {
        "saleId": saleId
    }
    var requestURL = contextPath + DELETE_SALE_URL;
    var requestMethod = "POST";
    $.ajax({
        url: requestURL,
        type: requestMethod,
        data: Data,
        success: function () {
            var notifyData = {
                'title': 'Delete Sale',
                'content': 'Delete Sale successfully'
            }
            showNotifyModal(contextPath + SALE_PAGE_URL, true, notifyData);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error(textStatus);
        }
    });
}