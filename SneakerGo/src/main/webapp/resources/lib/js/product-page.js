/**
 * Created by Hung on 11/20/2016.
 */
$(document).ready(function () {

    var dataTable = $('#product-table');
    addDataTable(dataTable);
    registerEvent();

})

function registerEvent() {
    $('.delete-btn').on('click', function () {
        var productId = $(this).data("id");
        deleteProduct(productId);
    })

    $('#sale-percentage').change(setMinMaxForNumberInput);


    $('.update-btn').off("click").on("click", function () {
        var row = $(this);

        var productId = row.data("id");
        var picture = $(row).closest("tr").find("td:nth-child(2)").find(".product-image").attr("src");
        var description = $(row).closest("tr").find("td:nth-child(1)").data("id");
        var name = $(row).closest("tr").find("td:nth-child(3)").html().trim();
        var nation = $(row).closest("tr").find("td:nth-child(5)").html().trim();
        var price = $(row).closest("tr").find("td:nth-child(4)").html().trim();
        productModalInitialize(UPDATE_BUTTON_LABEL,productId,picture,description,name,nation,price);
    });

    $('.add-btn').off("click").on("click", function () {
        productModalInitialize(ADD_BUTTON_LABEL);
    });

    $('.sale-btn').off("click").on("click", function () {
        var row = $(this);
        var productId = row.data("id");
        var name = $(row).closest("tr").find("td:nth-child(3)").html().trim();
        saleModalInitialize(productId,name);
    });

}
function productModalInitialize(buttonLabel,productId, picture,description, name, nation, price) {
    if(picture==null){
        picture=NO_IMG_SOURCE;
    }
    $('#add-edit-btn').text(buttonLabel);
    $('#productModal').find('#productName').val(name);
    $('#productModal').find('#price').val(price);
    $('#productModal').find('#nation').val(nation);
    $('#productModal').find('#description').val(description);
    $('#productModal').find('#image').attr("src",picture);
    $('#productModal').find('#add-edit-btn').data("id",productId);
}

function saleModalInitialize(productId,name){
    $('#saleModal').find('#sale-product-id').val(productId);
    $('#saleModal').find('#sale-product-name').val(name);
    $('#saleModal').find('#sale-btn').data("id",productId);
}

function deleteProduct(productId) {
    var Data = {
        "productId": productId
    }
    var requestURL = contextPath + DELETE_PRODUCT_URL;
    var requestMethod = "POST";

    $.ajax({
        url: requestURL,
        type: requestMethod,
        data: Data,
        success: function () {
            var notifyData = {
                'title': 'Delete Product',
                'content': 'Delete product successfully'
            }
            showNotifyModal(contextPath + PRODUCT_PAGE_URL, true, notifyData);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error(textStatus);
        }
    });
}