/**
 * Created by Hung on 11/23/2016.
 */

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
        var stockID = row.data("id");
        var name = $(row).closest("tr").find("td:nth-child(2)").html().trim();
        var size = $(row).closest("tr").find("td:nth-child(3)").html().trim();
        importModalInitialize(stockID,name,size);
    });

})

function importModalInitialize(stockID,name, size) {
    $('#importModal').find('#productName').val(name);
    $('#importModal').find('#size').val(size);
    $('#importModal').find('#import-btn').data("id",stockID);;
}
