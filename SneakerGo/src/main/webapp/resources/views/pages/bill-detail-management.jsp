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
    <title>Bill Detail Management</title>
    <c:import url="/resources/views/common/header.jsp"/>
    <%--Date time CSS--%>
    <link href="<c:url value="/resources/js/bootstrap-datepicker/datepicker.css"/>" rel="stylesheet">

    <link href="<c:url value="/resources/js/bootstrap-daterangepicker/daterangepicker.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/SneakerStyle.css"/>" rel="stylesheet">
    <script src="/resources/js/jquery-1.8.3.min.js"></script>
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
                    <div class="col-md-8">
                        <h3> Advanced Table Example</h3>
                    </div>
                    <div class="col-md-4 text-right">
                        <h3>
                            <a>
                                <form id="back-form" method="POST">
                                <span class="btn btn-primary backToView" id="back-label" data-from="${fromDate}"
                                data-to="${toDate}">
                                    back
                                </span>
                                </form>
                            </a>
                        </h3>
                    </div>
                </div>
                <hr>
            </header>
            <div class="row">
                <div class="col-md-12">
                    <form class="form-inline" role="form">
                        <div class="row">
                            <div class="col-md-1">
                                <label class="billDetailLabel" for="bill-price">Total</label>
                            </div>
                            <div class="col-md-3">
                                <input type="text" class="form-control"
                                       id="bill-price" value="${bill.totalPrice}" disabled>
                            </div>
                            <div class="col-md-1">
                                <label class="billDetailLabel" for="bill-price">Customer</label>
                            </div>
                            <div class="col-md-3">
                                <input type="text" class="form-control"
                                       id="user-name" value="${customer.name}" disabled>
                            </div>
                            <div class="col-md-1">
                                <label class="billDetailLabel" for="bill-price">Phone</label>
                            </div>
                            <div class="col-md-3">
                                <input type="text" class="form-control"
                                       id="user-phone" value="${customer.phone}" disabled>
                            </div>
                        </div>
                    </form>

                .</div>
                <div class="col-md-12">
                    <table class="display table table-bordered dataTable" id="bill-detail-table"
                           aria-describedby="hidden-table-info_info">
                        <thead>
                        <tr role="row">
                            <th></th>
                            <th>Product</th>
                            <th>Size</th>
                            <th>Quantity</th>
                            <th>Price</th>
                            <th>Total</th>
                        </tr>
                        </thead>

                        <tbody role="alert" aria-live="polite" aria-relevant="all">
                        <c:forEach var="item" items="${listBillDetail}" varStatus="counter">
                            <tr class="gradeC even">
                                <td class="text-center">${counter.count}</td>
                                <td class="center">${item.productName}</td>
                                <td class="center">${item.size}</td>
                                <td class="text-center">${item.quantity}</td>
                                <td class="text-center">${item.price}</td>
                                <td class="text-center">${item.total}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <!-- page start-->

            <!-- page end-->
            </div><!-- /row -->
        </section><!-- --/wrapper ---->
    </section><!-- /MAIN CONTENT -->
    <!--main content end-->
    <!--footer start-->
    <!--footer end-->
</section>
<%--<script class="include" type="text/javascript" src="<c:url value="/resources/js/jquery.dcjqaccordion.2.7.js"/>"></script>--%>
<script src="<c:url value="/resources/lib/js/bill-detail-management.js"/>"></script>
<c:import url="/resources/views/common/footer.jsp"/>
<%--<script src="<c:url value="/resources/js/advanced-form-components.js"/>" type="text/javascript"></script>--%>
<script src="<c:url value="/resources/js/common-scripts.js"/>"></script>

</body>

</html>

