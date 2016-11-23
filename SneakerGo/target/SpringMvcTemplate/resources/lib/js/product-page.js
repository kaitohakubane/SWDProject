/**
 * Created by Hung on 11/20/2016.
 */
$(document).ready(function(){

    var dataTable=$('#product-table');
    addDataTable(dataTable);
    registerEvent();

})

function registerEvent(){
    $('.delete-btn').on('click',function(){
        var productId=$(this).data("id");
        deleteProduct(productId);
    })

}


function deleteProduct(productId){
    var Data={
        "productId": productId
    }
    var requestURL = contextPath + DELETE_PRODUCT_URL;
    var requestMethod = "POST";

    $.ajax({
        url: requestURL,
        type: requestMethod,
        data: Data,
        success: function () {
            var notifyData={
                'title': 'Delete Product',
                'content': 'Delete product successfully'
            }
            showNotifyModal(contextPath+PRODUCT_PAGE_URL,true,notifyData);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error(textStatus);
        }
    });
}