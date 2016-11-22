<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>DASHBOARD</title>

    <script src="<c:url value="/resources/js/chart-master/Chart.js"/>"></script>
    <c:import url="/resources/views/common/header.jsp"/>
    <link href="<c:url value="/resources/css/zabuto_calendar.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/js/gritter/css/jquery.gritter.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/lineicons/style.css"/>" rel="stylesheet">
</head>
<body>
<section id="container">
    <c:import url="/resources/views/common/topBar.jsp"/>
    <c:import url="/resources/views/common/menu.jsp"/>

    <!-- **********************************************************************************************************************************************************
    MAIN CONTENT
    *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">

            <div class="row">
                <div class="col-lg-9 main-chart">

                    <div class="row mtbox">

                        <div class="col-md-2 col-sm-2 col-md-offset-1 box0">
                            <div class="box1">
                                <span class="li_stack"></span>
                                <h3>50</h3>
                            </div>
                            <p>You have 50 product on business</p>
                        </div>

                        <div class="col-md-2 col-sm-2 box0">
                            <div class="box1">
                                <span class="li_data"></span>
                                <h3>100</h3>
                            </div>
                            <p>You have 100 product records in stock</p>
                        </div>

                        <div class="col-md-2 col-sm-2 box0">
                            <div class="box1">
                                <span class="li_shop"></span>
                                <h3>25</h3>
                            </div>
                            <p>25 bills is made today</p>
                        </div>

                        <div class="col-md-2 col-sm-2 box0">
                            <div class="box1">
                                <span class="li_diamond"></span>
                                <h3>21</h3>
                            </div>
                            <p>21 product sale is available for today</p>
                        </div>

                    </div><!-- /row mt -->


                    <div class="row mt">
                        <!-- SERVER STATUS PANELS -->
                        <div class="col-md-4 col-sm-4 mb">
                            <div class="white-panel pn donut-chart">
                                <div class="white-header">
                                    <h5>STOCK STATUS</h5>
                                </div>
                                <div class="row">
                                    <div class="col-sm-6 col-xs-6 goleft">
                                        <p><i class="fa fa-database"></i> 70%</p>
                                    </div>
                                </div>
                                <canvas id="serverstatus01" height="120" width="120"></canvas>
                                <script>
                                    var doughnutData = [
                                        {
                                            value: 70,
                                            color: "#68dff0"
                                        },
                                        {
                                            value: 30,
                                            color: "#fdfdfd"
                                        }
                                    ];
                                    var myDoughnut = new Chart(document.getElementById("serverstatus01").getContext("2d")).Doughnut(doughnutData);
                                </script>
                            </div>
                            <! --/grey-panel -->
                        </div><!-- /col-md-4-->


                        <div class="col-md-4 col-sm-4 mb">
                            <div class="white-panel pn">
                                <div class="white-header">
                                    <h5>TOP PRODUCT</h5>
                                </div>
                                <div class="row">
                                    <div class="col-sm-6 col-xs-6 goleft">
                                        <p><i class="fa fa-heart"></i> 122</p>
                                    </div>
                                    <div class="col-sm-6 col-xs-6"></div>
                                </div>
                                <div class="centered">
                                    <img src="assets/img/product.png" width="120">
                                </div>
                            </div>
                        </div><!-- /col-md-4 -->

                        <div class="col-md-4 col-sm-4 mb">
                            <!-- REVENUE PANEL -->
                            <div class="darkblue-panel pn">
                                <div class="darkblue-header">
                                    <h5>RECENT 7 DAY REVENUE</h5>
                                </div>
                                <div class="chart mt">
                                    <div class="sparkline" data-type="line" data-resize="true" data-height="75"
                                         data-width="90%" data-line-width="1" data-line-color="#fff"
                                         data-spot-color="#fff" data-fill-color="" data-highlight-line-color="#fff"
                                         data-spot-radius="4"
                                         data-data="[200,135,667,333,526,996,564,123,890,464,655]"></div>
                                </div>
                                <p class="mt"><b>$ 17,980</b><br/>Total</p>
                            </div>
                        </div><!-- /col-md-4 -->


                    </div><!-- /row -->
                </div><!-- /col-lg-9 END SECTION MIDDLE -->


                <!-- **********************************************************************************************************************************************************
                RIGHT SIDEBAR CONTENT
                *********************************************************************************************************************************************************** -->

                <div class="col-lg-3 ds">
                    <!--COMPLETED ACTIONS DONUTS CHART-->
                    <h3>NOTIFICATIONS</h3>

                    <!-- First Action -->
                    <div class="desc">
                        <div class="thumb">
                            <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                        </div>
                        <div class="details">
                            <p><muted>2 Minutes Ago</muted><br/>
                                <a href="#">James Brown</a> subscribed to your newsletter.<br/>
                            </p>
                        </div>
                    </div>
                    <!-- Second Action -->
                    <div class="desc">
                        <div class="thumb">
                            <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                        </div>
                        <div class="details">
                            <p><muted>3 Hours Ago</muted><br/>
                                <a href="#">Diana Kennedy</a> purchased a year subscription.<br/>
                            </p>
                        </div>
                    </div>
                    <!-- Third Action -->
                    <div class="desc">
                        <div class="thumb">
                            <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                        </div>
                        <div class="details">
                            <p><muted>7 Hours Ago</muted><br/>
                                <a href="#">Brandon Page</a> purchased a year subscription.<br/>
                            </p>
                        </div>
                    </div>
                    <!-- Fourth Action -->
                    <div class="desc">
                        <div class="thumb">
                            <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                        </div>
                        <div class="details">
                            <p><muted>11 Hours Ago</muted><br/>
                                <a href="#">Mark Twain</a> commented your post.<br/>
                            </p>
                        </div>
                    </div>
                    <!-- Fifth Action -->
                    <div class="desc">
                        <div class="thumb">
                            <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                        </div>
                        <div class="details">
                            <p><muted>18 Hours Ago</muted><br/>
                                <a href="#">Daniel Pratt</a> purchased a wallet in your store.<br/>
                            </p>
                        </div>
                    </div>

                </div><!-- /col-lg-3 -->
            </div><! --/row -->
        </section>
    </section>

    <!--main content end-->
    <!--footer start-->
    <footer class="site-footer">
        <div class="text-center">
            2014 - Alvarez.is
            <a href="index.html#" class="go-top">
                <i class="fa fa-angle-up"></i>
            </a>
        </div>
    </footer>
    <!--footer end-->
</section>

<!-- js placed at the end of the document so the pages load faster -->
<script src="<c:url value="/resources/js/jquery.js"/>"></script>
<script src="<c:url value="/resources/js/jquery-1.8.3.min.js"/>"></script>
<c:import url="/resources/views/common/footer.jsp"/>

<script src="<c:url value="/resources/js/jquery.sparkline.js"/>"></script>


<!--common script for all pages-->
<script src="<c:url value="/resources/js/common-scripts.js"/>"></script>

<script src="<c:url value="/resources/js/gritter/js/jquery.gritter.js"/>"></script>
<script src="<c:url value="/resources/js/gritter-conf.js"/>"></script>

<!--script for this page-->
<script src="<c:url value="/resources/js/sparkline-chart.js"/>"></script>
<script src="<c:url value="/resources/js/zabuto_calendar.js"/>"></script>


</body>
</html>
