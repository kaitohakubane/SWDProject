/**
 * Created by Hung on 11/19/2016.
 */
/**
 * Scroll top for common ajax.
 */
var NO_IMG_SOURCE="http://www.placehold.it/200x150/EFEFEF/AAAAAA&text=no+image";
var CONFIRM_INFORMATION_TITLE="CONFIRM INFORMATION";
var BILL_PAGE_URL="/admin/bill-management"
function addDataTable(dataTable){
    dataTable.DataTable();
}

function notify(msg){
    $('#notify-message').val(msg);
    $('#notifyModal').show();
}


function setMinMaxForNumberInput(){
    var max = parseInt($(this).attr('max'));
    var min = parseInt($(this).attr('min'));
    if ($(this).val() > max)
    {
        $(this).val(max);
    }
    else if ($(this).val() < min)
    {
        $(this).val(min);
    }
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

function showConfirmModal(callIfConfirm, data,args) {

    var modal = $(".confirm-modal");
    var title = $(".confirm-title");
    var content = $(".confirm-content");
    var confirmBtn = $(".confirm-button");

    title.text(data.title);
    content.html(data.content);
    confirmBtn.click(function (e) {
        e.preventDefault();
        callIfConfirm.apply(this,args);
        confirmBtn.unbind();
    });

    modal.modal('show');
}

function setLabel(){
    $(".status").each(function () {
        var real = $(this).text();
        if (real == "true") {
            $(this).html("<span class='status onStock'>Active</span>")
        }
        else {
            $(this).html("<span class='status sold'>Inactive</span>")
        }
    })

    $(".product-size").each(function(){
        var status=$(this).text();
        if (status == "0") {
            $(this).html("<span class='status sold'>Not imported</span>")
        }
    })

    $(".product-quantity").each(function(){
        var status=$(this).text();
        if (status == "0") {
            $(this).html("<span class='status sold'>Out of stock</span>")
        }
        else {
            if (status < 10 && status >0){
                $(this).html("<span class='status onStock'>" + status+"</span>")
            }
        }
    })
}