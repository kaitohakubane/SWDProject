/**
 * Created by Hung on 11/26/2016.
 */
$(document).ready(function(){
    var $fromDate=$('#fromDate');
    var $toDate=$('#toDate');
    var dataTable=$('#import-table');
    addDataTable(dataTable);
    $('.change-btn').off("click").on("click", function () {
        var row = $(this);
        var importID = row.data("id");
        var name = $(row).closest("tr").find("td:nth-child(1)").html().trim();
        var size = $(row).closest("tr").find("td:nth-child(2)").html().trim();
        var quantity = $(row).closest("tr").find("td:nth-child(3)").html().trim();
        var price = $(row).closest("tr").find("td:nth-child(4)").html().trim();
        var supplier = $(row).closest("tr").find("td:nth-child(5)").html().trim();
        importModalInitialize(importID,name,size,quantity,price,supplier);
    });

    $("#import-btn").on("click",function(){

    })
})

function importModalInitialize(productId,name,size,quantity,price,supplier){
    $('#importModal').find('#name').val(name);
    $('#importModal').find('#size').val(size);
    $('#importModal').find('#quantity').val(quantity);
    $('#importModal').find('#price').val(price);
    $('#importModal').find('#supplier').val(supplier);
    $('#importModal').find('#import-btn').data("id",productId);
}