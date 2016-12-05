<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 11/13/2016
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Revenue Report</title>
    <c:import url="/resources/views/common/header.jsp"/>
    <%--Date time CSS--%>
    <link href="<c:url value="/resources/js/bootstrap-datepicker/datepicker.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/js/bootstrap-daterangepicker/daterangepicker.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/lib/css/chart-page.css"/>" rel="stylesheet">

    <script src="<c:url value = "/resources/js/bootstrap-daterangepicker/moment.min.js"/>"
            type="text/javascript"></script>

</head>
<body>
<section id="container">
    <c:import url="/resources/views/common/data-table.jsp"/>
    <c:import url="/resources/views/common/topBar.jsp"/>
    <c:import url="/resources/views/common/menu.jsp"/>
    <!-- **********************************************************************************************************************************************************
    MAIN CONTENT
    *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <header>
                <div class="row">
                    <div class="col-md-7">
                        <h3> Revenue Report</h3>
                    </div>
                    <div class="col-md-5">
                        <h3>
                            <form id="search-form" method="POST">
                                <div class="row">
                                    <div class="col-md-7">
                                        <div data-date-viewmode="years" data-date-format="yyyy-mm-dd"
                                             data-date="2016-01-01"
                                             class="input-append date onlyYears">
                                            <input type="text" readonly="" size="16" name="fromDate"
                                                   class="form-control"
                                                   name="fromDate" id="fromDate" value="${fromDate}">
                                            <span class="input-group-btn add-on">
		                                        <button class="btn btn-theme myBtnDate" type="button"><i
                                                        class="fa fa-calendar"></i></button>
		                                      </span>
                                        </div>
                                    </div>
                                    <div class="col-md-5 text-right">
                                        <div class="form-group">
                                            <button type="button" class="btn btn-primary search-btn"
                                                    id="search-btn">Search
                                            </button>
                                        </div>
                                    </div>
                                </div>

                            </form>


                        </h3>
                    </div>
                </div>
                <hr>
            </header>
            <div class="row">
                <div class="col-md-12">
                    <div id="chartContainer" style="height: 400px; width: 100%;">
                    </div>
                </div>

            </div>
            <div class="datepicker dropdown-menu">
                <div class="datepicker-days" style="display: block;">
                    <table class=" table-condensed">
                        <thead>
                        <tr>
                            <th class="prev">‹</th>
                            <th colspan="5" class="switch">November 2016</th>
                            <th class="next">›</th>
                        </tr>
                        <tr>
                            <th class="dow">Su</th>
                            <th class="dow">Mo</th>
                            <th class="dow">Tu</th>
                            <th class="dow">We</th>
                            <th class="dow">Th</th>
                            <th class="dow">Fr</th>
                            <th class="dow">Sa</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td class="day old">30</td>
                            <td class="day old">31</td>
                            <td class="day">1</td>
                            <td class="day">2</td>
                            <td class="day">3</td>
                            <td class="day">4</td>
                            <td class="day">5</td>
                        </tr>
                        <tr>
                            <td class="day">6</td>
                            <td class="day">7</td>
                            <td class="day">8</td>
                            <td class="day">9</td>
                            <td class="day">10</td>
                            <td class="day">11</td>
                            <td class="day">12</td>
                        </tr>
                        <tr>
                            <td class="day">13</td>
                            <td class="day">14</td>
                            <td class="day active">15</td>
                            <td class="day">16</td>
                            <td class="day">17</td>
                            <td class="day">18</td>
                            <td class="day">19</td>
                        </tr>
                        <tr>
                            <td class="day">20</td>
                            <td class="day">21</td>
                            <td class="day">22</td>
                            <td class="day">23</td>
                            <td class="day">24</td>
                            <td class="day">25</td>
                            <td class="day">26</td>
                        </tr>
                        <tr>
                            <td class="day">27</td>
                            <td class="day">28</td>
                            <td class="day">29</td>
                            <td class="day">30</td>
                            <td class="day new">1</td>
                            <td class="day new">2</td>
                            <td class="day new">3</td>
                        </tr>
                        <tr>
                            <td class="day new">4</td>
                            <td class="day new">5</td>
                            <td class="day new">6</td>
                            <td class="day new">7</td>
                            <td class="day new">8</td>
                            <td class="day new">9</td>
                            <td class="day new">10</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="datepicker-months" style="display: none;">
                    <table class="table-condensed">
                        <thead>
                        <tr>
                            <th class="prev">‹</th>
                            <th colspan="5" class="switch">2016</th>
                            <th class="next">›</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td colspan="7"><span class="month">Jan</span><span class="month">Feb</span><span
                                    class="month">Mar</span><span class="month">Apr</span><span class="month">May</span><span
                                    class="month">Jun</span><span class="month">Jul</span><span class="month">Aug</span><span
                                    class="month">Sep</span><span class="month">Oct</span><span
                                    class="month active">Nov</span><span
                                    class="month">Dec</span></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="datepicker-years" style="display: none;">
                    <table class="table-condensed">
                        <thead>
                        <tr>
                            <th class="prev">‹</th>
                            <th colspan="5" class="switch">2010-2019</th>
                            <th class="next">›</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td colspan="7"><span class="year old">2009</span><span class="year">2010</span><span
                                    class="year">2011</span><span class="year">2012</span><span class="year">2013</span><span
                                    class="year">2014</span><span class="year">2015</span><span
                                    class="year active">2016</span><span
                                    class="year">2017</span><span class="year">2018</span><span class="year">2019</span><span
                                    class="year old">2020</span></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </section><!-- --/wrapper ---->
    </section><!-- /MAIN CONTENT -->

    <!--main content end-->
    <!--footer start-->
    <!--footer end-->
</section>


<script src="<c:url value = "/resources/js/jquery.canvasjs.min.js"/>"
        type="text/javascript"></script>

<script src="<c:url value = "/resources/js/bootstrap-datepicker/bootstrap-datepicker.js"/>"
        type="text/javascript"></script>

<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/date.js"/>" type="text/javascript"></script>
<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/daterangepicker.js"/>"
        type="text/javascript"></script>

<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/moment.min.js"/>"
        type="text/javascript"></script>
<c:import url="/resources/views/common/footer.jsp"/>
<script src="<c:url value="/resources/js/advanced-form-components.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/common-scripts.js"/>"></script>

</body>
</html>
<script>

    window.onload = function () {
        var chart = new CanvasJS.Chart("chartContainer",
            {

                title: {
                    text: "Earthquakes - per month"
                },
                axisX:{
                    valueFormatString: "MMM",
                    title: "Month"
                },
                axisY: {
                    title: ".000VNĐ"
                },
                data: [
                    {
                        type: "area",

                        dataPoints: [
                            { x: new Date(2010, 1, 0), y: 650 },
                            { x: new Date(2010, 2, 0), y: 700 },
                            { x: new Date(2010, 3, 0), y: 710 },
                            { x: new Date(2010, 4, 0), y: 658 },
                            { x: new Date(2010, 5, 0), y: 734 },
                            { x: new Date(2010, 6, 0), y: 963 },
                            { x: new Date(2010, 7, 0), y: 847 },
                            { x: new Date(2010, 8, 0), y: 853 },
                            { x: new Date(2010, 9, 0), y: 869 },
                            { x: new Date(2010, 10, 0), y: 943 },
                            { x: new Date(2010, 11, 0), y: 970 },
                            { x: new Date(2010, 12, 0), y: 970 }

                        ]
                    }
                ]
            });

        chart.render();
    }
</script>
