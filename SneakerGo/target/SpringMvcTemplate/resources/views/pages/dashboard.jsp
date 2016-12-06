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
                <div class="col-lg-12 main-chart">

                    <div class="row mtbox">

                        <div class="col-md-2 col-sm-2 col-md-offset-2 box0">
                            <div class="box1">
                                <span class="li_stack"></span>
                                <h3>${numberOfProduct}</h3>
                            </div>
                            <p>You have ${numberOfProduct} product on business</p>
                        </div>

                        <div class="col-md-2 col-sm-2 box0">
                            <div class="box1">
                                <span class="li_data"></span>
                                <h3>${numberOfStock}</h3>
                            </div>
                            <p>You have ${numberOfStock} product records in stock</p>
                        </div>

                        <div class="col-md-2 col-sm-2 box0">
                            <div class="box1">
                                <span class="li_shop"></span>
                                <h3>${numberOfBill}</h3>
                            </div>
                            <p>${numberOfBill} bills is made today</p>
                        </div>

                        <div class="col-md-2 col-sm-2 box0">
                            <div class="box1">
                                <span class="li_diamond"></span>
                                <h3>${numberOfSale}</h3>
                            </div>
                            <p>${numberOfSale} product sale is available for today</p>
                        </div>

                    </div><!-- /row mt -->


                    <div class="row mt">
                        <!-- SERVER STATUS PANELS -->
                        <div class="col-md-6 col-sm-6 mb">
                            <div class="white-panel pn donut-chart">
                                <div class="white-header">
                                    <h5>STOCK STATUS</h5>
                                </div>
                                <div class="row">
                                    <div class="col-sm-6 col-xs-6 goleft">
                                        <p><i class="fa fa-database"></i> 80%</p>
                                    </div>
                                </div>
                                <canvas id="serverstatus01" height="120" width="120"></canvas>
                                <script>
                                    var doughnutData = [
                                        {
                                            value: 80,
                                            color: "#68dff0"
                                        },
                                        {
                                            value: 20,
                                            color: "#fdfdfd"
                                        }
                                    ];
                                    var myDoughnut = new Chart(document.getElementById("serverstatus01").getContext("2d")).Doughnut(doughnutData);
                                </script>
                            </div>
                            <! --/grey-panel -->
                        </div><!-- /col-md-4-->


                        <div class="col-md-6 col-sm-6 mb">
                            <div class="white-panel pn">
                                <div class="white-header">
                                    <h5>TOP PRODUCT</h5>
                                </div>
                                <div class="row">
                                    <div class="col-sm-6 col-xs-6 goleft">
                                        <p><i class="fa fa-heart"></i> ${topProduct.productName}</p>
                                    </div>
                                    <div class="col-sm-6 col-xs-6"></div>
                                </div>
                                <div class="centered">
                                    <c:choose>
                                        <c:when test="${topProduct.picture eq null}">
                                            <img src="<c:url value="/resources/lib/img/noimagefound.jpg"/>"
                                                 class="product-image"/>
                                        </c:when>
                                        <c:otherwise>
                                            <img src="${pageContext.request.contextPath}/product-images/${topProduct.picture}"
                                                 class="product-image"/>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                            </div>
                        </div><!-- /col-md-4 -->
                    </div><!-- /row -->
                </div><!-- /col-lg-9 END SECTION MIDDLE -->
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
