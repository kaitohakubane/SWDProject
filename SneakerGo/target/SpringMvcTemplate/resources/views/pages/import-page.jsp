<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 11/26/2016
  Time: 10:42 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Import Management</title>
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
                            <div class="col-md-4 form-group time-control">
                                <div class="input-group input-large"
                                     data-date-format="mm/dd/yyyy">
                                    <input type="text" class="form-control dpd1" name="from" id="fromDate" value="${fromDate}">
                                    <span class="input-group-addon">To</span>
                                    <input type="text" class="form-control dpd2" name="to" id="toDate" value=${toDate}>
                                </div>
                            </div>

                            <table class="display table table-bordered dataTable" id="import-table"
                                   aria-describedby="hidden-table-info_info">
                                <thead>
                                <tr role="row">
                                    <th>Product Name</th>
                                    <th>Size</th>
                                    <th>Quantity</th>
                                    <th>Price</th>
                                    <th>Total</th>
                                    <th>Supplier</th>
                                    <th>Date</th>
                                    <th>Change</th>
                                    <th>Delete</th>
                                </tr>
                                </thead>

                                <tbody role="alert" aria-live="polite" aria-relevant="all">
                                <c:forEach var="item" items="${listBill}">
                                    <tr class="gradeC even">
                                        <td class="center">${item.billID}</td>
                                        <td class="center">${item.accountID}</td>
                                        <td class="center">${item.accountName}</td>
                                        <td class="center">${item.totalPrice}</td>
                                        <td class="center">${item.date}</td>
                                        <td class="center">${item.enabled}</td>
                                        <td class="center">
                                            <button type="button" class="btn btn-round btn-success" data-toggle="modal"
                                                    data-target="#importModal" data-stockID="${item.stockID}">View
                                            </button>
                                        </td>

                                        <td class="center">
                                            <button type="button" class="btn btn-round btn-success" data-toggle="modal"
                                                    data-target="#importModal" data-stockID="${item.stockID}">Change
                                            </button>
                                        </td>

                                        <td class="center">
                                            <button type="button" class="btn btn-round btn-success" data-toggle="modal"
                                                    data-target="#importModal" data-stockID="${item.stockID}">Delete
                                            </button>
                                        </td>
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
    <footer class="site-footer">
        <div class="text-center">
            2014 - Alvarez.is
            <a href="#" class="go-top">
                <i class="fa fa-angle-up"></i>
            </a>
        </div>
    </footer>
    <!--footer end-->
</section>

<div class="modal fade" id="importModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true" data-keyboard="false" data-backdrop="static">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="importModalLabel">Import product</h4>
            </div>
            <div class="modal-body">
                <div class="form-inline" role="form">
                    Product Name
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" id="productName" class="form-control" disabled>
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">
                    <label class="col-lg-2 col-sm-2 control-label" for="size">Size</label>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" id="size" class="form-control" disabled>
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">
                    Import Quantity
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="number" min="1" max="1000000000" class="form-control">
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">
                    Price
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="number" class="form-control" min="1" max="1000000" placeholder=".000 VNĐ">
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">
                    Supplier
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" id="import-btn">Import</button>
            </div>
        </div>
    </div>
</div>
<%--Time script--%>
<script src="<c:url value = "/resources/js/bootstrap-datepicker/bootstrap-datepicker.js"/>"
        type="text/javascript"></script>

<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/date.js"/>" type="text/javascript"></script>
<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/daterangepicker.js"/>"
        type="text/javascript"></script>

<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/moment.min.js"/>"
        type="text/javascript"></script>
<script src="<c:url value="/resources/lib/js/import-page.js"/>"></script>
<c:import url="/resources/views/common/footer.jsp"/>
<script src="<c:url value="/resources/js/advanced-form-components.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/common-scripts.js"/>"></script>


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
                        class="month">Sep</span><span class="month">Oct</span><span class="month active">Nov</span><span
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
                        class="year">2014</span><span class="year">2015</span><span class="year active">2016</span><span
                        class="year">2017</span><span class="year">2018</span><span class="year">2019</span><span
                        class="year old">2020</span></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

</body>

</html>

