/**
 * Created by Hung on 11/23/2016.
 */
var IMPORT_PRODUCT_URL="/admin/import/create";
var STOCK_PAGE_URL="/admin/stock";
var IMPORT_PRODUCT_POPUP_TITLE="IMPORT PRODUCT";
var IMPORT_PRODUCT_POPUP_MSG="Import Product successfully";
$(document).ready(function () {
    var dataTable = $('#stock-table');
    var SIZE_LIST = {
        option1: {value: 3, text: 3},
        option2: {value: 3.5, text: 3.5},
        option3: {value: 4, text: 4},
        option4: {value: 4.5, text: 4.5},
        option5: {value: 5, text: 5},
        option6: {value: 5.5, text: 5.5},
        option7: {value: 6, text: 6},
        option8: {value: 6.5, text: 6.5},
        option9: {value: 7, text: 7},
        option10: {value: 7.5, text: 7.5},
        option11: {value: 8, text: 8},
        option12: {value: 8.5, text: 8.5},
        option13: {value: 9, text: 9},
        option14: {value: 9.5, text: 9.5},
        option15: {value: 10, text: 10},
        option16: {value: 10.5, text: 10.5},
        option17: {value: 11, text: 11},
        option18: {value: 11.5, text: 11.5},
        option19: {value: 12, text: 12},
        option20: {value: 12.5, text: 12.5},
        option21: {value: 13, text: 13},
    }

    /**
     * Initialize size list
     */
    $.each(SIZE_LIST, function (i, item) {
        $('#size').append($('<option>', {
            value: item.value,
            text : item.text
        }));
    });

    /**
     * Style for Data table
     */
    addDataTable(dataTable);


    $('.import-btn').off("click").on("click", function () {
        var row = $(this);
        var productID = row.data("product");
        var attributeID = row.data("attribute");
        var name = $(row).closest("tr").find("td:nth-child(2)").html().trim();
        var size = $(row).closest("tr").find("td:nth-child(3)").html().trim();
        importModalInitialize(productID,attributeID,name,size);
    });

    $('#import-btn').on("click",function(){
        var button=$(this);
        var name=$('#importModal').find('#productName').val();
        var size=$('#importModal').find('#size').val();
        var quantity=$('#importModal').find('#quantity').val();
        var price=$('#importModal').find('#price').val();
        var supplier=$('#importModal').find('#supplier').val();
        var confirmData = {
            'title': CONFIRM_INFORMATION_TITLE,
            'content': 'Name: '+name+ '</br>' + 'Size: '+size+ '</br>'+
            'Quantity: '+quantity+ '</br>' +'Price: '+price+ '</br>'+ 'Supplier: '+supplier+ '</br>'
        }
        showConfirmModal(importProduct,confirmData,[button.data("productID"),button.data("attributeID")]);
    })

})

function importModalInitialize(productID,attributeID,name, size) {
    $('#importModal').find('#productName').val(name);
    $('#importModal').find('#size').val(size);
    $('#importModal').find('#import-btn').data("productID",productID);
    $('#importModal').find('#import-btn').data("attributeID",attributeID);
    $('#importModal').find('#quantity').val('');
    $('#importModal').find('#price').val('');
    $('#importModal').find('#supplier').val('');
}

function importProduct(productID,attributeID){
    $('#importModal').modal("hide");
    var formData = new FormData($('#import-form')[0]);
    formData.append("productId", productID)
    formData.append("attributeID", attributeID)
    var requestURL = contextPath + IMPORT_PRODUCT_URL;
    var requestMethod = "POST";
    var requestData = formData;

    $.ajax({
        url: requestURL,
        type: requestMethod,
        data: requestData,
        processData: false,
        contentType: false,
        success: function () {
            var notifyData = {
                'title': IMPORT_PRODUCT_POPUP_TITLE,
                'content': IMPORT_PRODUCT_POPUP_MSG
            }
            $(".confirm-modal").modal('hide');
            showNotifyModal(contextPath + STOCK_PAGE_URL, true, notifyData);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error(textStatus);
        }
    });

}
