/**
 * Created by Hung on 11/20/2016.
 */

var CREATE_SALE_URL='/admin/sale-management/create';
var DELETE_PRODUCT_URL='/admin/product/remove';
var ADD_PRODUCT_URL='/admin/product/add';
var UPDATE_PRODUCT_URL='/admin/product/update';
var PRODUCT_PAGE_URL="/admin/product";
var ADD_BUTTON_LABEL="Add";
var UPDATE_BUTTON_LABEL="Update";
var ADD_PRODUCT_POPUP_TITLE="Add Product";
var UPDATE_PRODUCT_POPUP_TITLE="Update Product";
var CREATE_SALE_POPUP_TITLE='Create Sale';
var ADD_ACTION="add";
var UPDATE_ACTION="update";
var INIT_PERCENT_VAL='0';

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
        productModalInitialize(UPDATE_BUTTON_LABEL, UPDATE_PRODUCT_POPUP_TITLE, UPDATE_ACTION
            , productId, picture, description, name, nation, price);
    });

    $('.add-btn').off("click").on("click", function () {
        productModalInitialize(ADD_BUTTON_LABEL, ADD_PRODUCT_POPUP_TITLE, ADD_ACTION);
    });

    $('.sale-btn').off("click").on("click", function () {
        var row = $(this);
        var productId = row.data("id");
        var name = $(row).closest("tr").find("td:nth-child(3)").html().trim();
        saleModalInitialize(productId, name);
    });

    $('#add-edit-btn').on("click", function () {
        if ($(this).data('action') == ADD_ACTION) {
            addProduct();
        } else {
            updateProduct($(this).data('id'))
        }

    })

    $('#sale-btn').on("click",function(){
        createSale($(this).data('id'))
    })

}
function productModalInitialize(buttonLabel, titleLabel, action, productId, picture, description, name, nation, price) {
    if (picture == null) {
        picture = NO_IMG_SOURCE;
    }
    $('#productModalTitle').text(titleLabel)
    $('#add-edit-btn').text(buttonLabel);
    $('#productModal').find('#productName').val(name);
    $('#productModal').find('#price').val(price);
    $('#productModal').find('#nation').val(nation);
    $('#productModal').find('#description').val(description);
    $('#productModal').find('#image').attr("src", picture);
    $('#productModal').find('#add-edit-btn').data("id", productId);
    $('#productModal').find('#add-edit-btn').data("action", action);
}

function saleModalInitialize(productId, name) {
    $('#saleModal').find('#sale-product-id').val(productId);
    $('#saleModal').find('#sale-product-name').val(name);
    $('#saleModal').find('#sale-percentage').val(INIT_PERCENT_VAL);
    $('#saleModal').find('#sale-btn').data("id", productId);
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

function addProduct() {
    $('#productModal').modal("hide");
    var formData = new FormData($('#product-form')[0]);

    var requestURL = contextPath + ADD_PRODUCT_URL;
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
                'title': ADD_PRODUCT_POPUP_TITLE,
                'content': 'Add product successfully'
            }
            showNotifyModal(contextPath + PRODUCT_PAGE_URL, true, notifyData);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error(textStatus);
        }
    });
}

function updateProduct(productID) {
    $('#productModal').modal("hide");
    var formData = new FormData($('#product-form')[0]);
    formData.append("productId", productID)
    var requestURL = contextPath + UPDATE_PRODUCT_URL;
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
                'title': UPDATE_PRODUCT_POPUP_TITLE,
                'content': 'Update product successfully'
            }
            showNotifyModal(contextPath + PRODUCT_PAGE_URL, true, notifyData);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error(textStatus);
        }
    });
}

function createSale(productID) {
    $('#saleModal').modal("hide");
    var formData = new FormData($('#sale-form')[0]);
    formData.append("productId", productID)
    var requestURL = contextPath + CREATE_SALE_URL;
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
                'title': CREATE_SALE_POPUP_TITLE,
                'content': 'Create Sale successfully'
            }
            showNotifyModal(contextPath + PRODUCT_PAGE_URL, true, notifyData);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error(textStatus);
        }
    });
}

