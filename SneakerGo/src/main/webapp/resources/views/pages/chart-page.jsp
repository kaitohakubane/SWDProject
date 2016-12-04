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
                    <div class="col-md-6">
                        <h3> Revenue Report</h3>
                    </div>
                    <div class="col-md-6">
                        <h3>


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

<%--Time script--%>
<script src="<c:url value = "/resources/js/bootstrap-datepicker/bootstrap-datepicker.js"/>"
        type="text/javascript"></script>

<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/date.js"/>" type="text/javascript"></script>
<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/daterangepicker.js"/>"
        type="text/javascript"></script>

<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/moment.min.js"/>"
        type="text/javascript"></script>

<c:import url="/resources/views/common/footer.jsp"/>
<script src="<c:url value="/resources/js/common-scripts.js"/>"></script>
<script src="/resources/Theme/assets/js/jquery-1.8.3.min.js"></script>
<script src="http://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>

<%--<script src="<c:url value="/resources/js/advanced-form-components.js"/>" type="text/javascript"></script>--%>


<!--common script for all pages-->
<script src="<c:url value="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"/>"></script>
<script src="<c:url value="http://cdn.oesmith.co.uk/morris-0.4.3.min.js"/>"></script>
<!--script for this page-->
<script src="<c:url value="/resources/lib/js/chart-page.js"/>"></script>


</body>

</html>
<script>

    window.onload = function () {
        var chart = new CanvasJS.Chart("chartContainer",
            {

                title: {
                    text: "Earthquakes - per month"
                },
                data: [
                    {
                        type: "line",

                        dataPoints: [
                            {x: new Date(2012, 00, 1), y: 450},
                            {x: new Date(2012, 01, 1), y: 414},
                            {x: new Date(2012, 02, 1), y: 520},
                            {x: new Date(2012, 03, 1), y: 460},
                            {x: new Date(2012, 04, 1), y: 450},
                            {x: new Date(2012, 05, 1), y: 500},
                            {x: new Date(2012, 06, 1), y: 480},
                            {x: new Date(2012, 07, 1), y: 480},
                            {x: new Date(2012, 08, 1), y: 410},
                            {x: new Date(2012, 09, 1), y: 500},
                            {x: new Date(2012, 10, 1), y: 480},
                            {x: new Date(2012, 11, 1), y: 510}
                        ]
                    }
                ]
            });

        chart.render();
    }
</script>
