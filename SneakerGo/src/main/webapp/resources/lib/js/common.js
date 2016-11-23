/**
 * Created by Hung on 11/19/2016.
 */
/**
 * Scroll top for common ajax.
 */
var DELETE_PRODUCT_URL='/admin/product/remove';
var PRODUCT_PAGE_URL="/admin/product";
function addDataTable(dataTable){
    dataTable.DataTable();
}

function notify(msg){
    $('#notify-message').val(msg);
    $('#notifyModal').show();
}

function confirm(msg){

}

function showNotifyModal(callIfOk, isNavigate, data) {
    var modal = $(".notify-modal");
    var title = $(".notify-title");
    var content = $(".notify-content");
    var okBtn = $(".notify-button");

    if (okBtn.data('registered-onclick') != true) {
        okBtn.data('registered-onclick', true);
        okBtn.click(function (e) {
            e.preventDefault();
            if (typeof(callIfOk) == 'function') {
                callIfOk();
            } else {
                if (isNavigate) {
                    window.location = callIfOk;
                }
            }
        });
    }
    title.text(data.title);
    content.html(data.content);
    modal.modal('show');
}

function showConfirmModal(callIfConfirm, data) {

    var modal = $(".confirm-modal");
    var title = $(".confirm-title");
    var content = $(".confirm-content");
    var confirmBtn = $(".confirm-button");

    title.text(data.title);
    content.text(data.content);
    confirmBtn.click(function (e) {
        e.preventDefault();
        callIfConfirm();
        confirmBtn.unbind();
    });

    modal.modal('show');
}