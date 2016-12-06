/**
 * Created by mynvtse61526 on 12/4/2016.
 */

var GENERATE_CHART_URL="/admin/revenue-report/generate";
$(document).ready(function () {
    $('#chart-btn').off("click").on("click", function () {
        generateChart($('#year').val());
    });
})

function showChart(element,data){
    Morris.Area({
        element: element,
        data: data,
        xkey: 'period',
        ykeys: ['revenue'],
        labels: ['Revenue'],
        pointSize: 5,
        parseTime: false,
        hideHover: 'auto',
    });

}

function generateChart(year) {
        var requestURL = contextPath + GENERATE_CHART_URL;
        var requestMethod = "POST";
        var Data={
            "year": year
        }
        $.ajax({
            url: requestURL,
            type: requestMethod,
            data: Data,
            success: function (data) {
                if (data.length == 0) {
                    $('#chartContainer').text('No data');
                } else {
                    showChart("chartContainer", data);
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.error(textStatus);
            }
        });
}