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
            <h3><i class="fa fa-angle-right"></i> Advanced Table Example</h3>
            <div class="row mb ml">

                <!-- page start-->
                <div class="content-panel">
                    <div class="adv-table">
                        <div id="hidden-table-info_wrapper" class="dataTables_wrapper" role="grid">
                            <form class="form-inline" role="form">
                                <input type="text" class="form-control" name="billID" id="billID"
                                       value="${bill.billId}" disabled>
                                <div class="form-group">
                                    <button type="button" class="btn btn-primary" id="search-btn">Search Bill
                                    </button>
                                </div>
                            </form>

                            <form class="form-inline" role="form">
                                <div class="form-group">
                                    <label for="bill-price">Total</label>
                                    <input type="text" class="form-control"
                                           id="bill-price" value="${bill.totalPrice}" disabled>
                                </div>
                                <div class="form-group">
                                    <label for="user-name">Customer</label>
                                    <input type="text" class="form-control"
                                           id="user-name" value="${customer.name}" disabled>
                                </div>
                                <div class="form-group">
                                    <label for="user-phone">Phone Number</label>
                                    <input type="text" class="form-control"
                                           id="user-phone" value="${customer.phone}" disabled>
                                </div>
                            </form>

                            <table class="display table table-bordered dataTable" id="bill-detail-table"
                                   aria-describedby="hidden-table-info_info">
                                <thead>
                                <tr role="row">
                                    <th></th>
                                    <th>Product</th>
                                    <th>Quantity</th>
                                    <th>Price</th>
                                    <th>Total</th>
                                </tr>
                                </thead>

                                <tbody role="alert" aria-live="polite" aria-relevant="all">
                                <c:forEach var="item" items="${listBillDetail}" varStatus="counter">
                                    <tr class="gradeC even">
                                        <td class="center">${counter.count}</td>
                                        <td class="center">${item.productName}</td>
                                        <td class="center">${item.quantity}</td>
                                        <td class="center">${item.price}</td>
                                        <td class="center">${item.total}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <!-- page end-->
            </div><!-- /row -->
        </section><!-- --/wrapper ---->
    </section><!-- /MAIN CONTENT -->
    <!--main content end-->
    <!--footer start-->
    <footer class="site-footer" id="back-label" data-from="${fromDate}" data-to="${toDate}">
        <form id="back-form" method="POST"></form>
        <div class="text-center"> BACK
        </div>
    </footer>
    <!--footer end-->
</section>

<script src="<c:url value="/resources/lib/js/bill-detail-management.js"/>"></script>
<c:import url="/resources/views/common/footer.jsp"/>
<script src="<c:url value="/resources/js/advanced-form-components.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/common-scripts.js"/>"></script>

</body>

</html>

