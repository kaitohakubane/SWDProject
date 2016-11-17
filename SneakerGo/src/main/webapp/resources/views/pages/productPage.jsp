<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 11/7/2016
  Time: 10:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
    <c:import url="/resources/views/common/header.jsp"/>

    <%--Date time CSS--%>
    <link href="<c:url value="/resources/js/bootstrap-datepicker/datepicker.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/js/bootstrap-daterangepicker/daterangepicker.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/js/bootstrap-datetimepicker/datertimepicker.css"/>" rel="stylesheet">

    <%--File upload CSS--%>
    <link href="<c:url value="/resources/js/bootstrap-fileupload/bootstrap-fileupload.css"/>" rel="stylesheet">

    <%--Table CSS--%>
    <link href="<c:url value="/resources/css/table-responsive.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/js/advanced-datatable/demo_page.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/js/advanced-datatable/demo_table.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/js/advanced-datatable/DT_bootstrap.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/productPage.css"/>" rel="stylesheet">

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
            <h3><i class="fa fa-angle-right"></i> Advanced Table Example</h3>
            <div class="row mb ml">

                <!-- page start-->
                <div class="content-panel">
                    <div class="adv-table">
                        <form class="form-inline" role="form">
                            <select class="form-control">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                            </select>
                            <label>Display</label>
                            <div class="form-group search-control">

                                <input type="email" class="form-control" id="exampleInputEmail2"
                                       placeholder="Enter email">
                                <button type="submit" class="btn btn-theme">Search</button>
                            </div>

                            <div class="form-group">
                                <button type="button" class="btn btn-primary" ata-toggle="modal"
                                        data-target="#productModal">Add Product</button>
                            </div>
                        </form>

                        <table cellpadding="0" cellspacing="0" border="0"
                               class="display table table-bordered dataTable" id="hidden-table-info"
                               aria-describedby="hidden-table-info_info">
                            <thead>
                            <tr role="row">
                                <th></th>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Price</th>
                                <th>Nation</th>
                                <th>Sale</th>
                                <th>Import</th>
                                <th>Update</th>
                                <th>Delete</th>
                            </tr>
                            </thead>

                            <tbody role="alert" aria-live="polite" aria-relevant="all">
                            <tr class="gradeC even">
                                <td class="center "></td>
                                <td class="center "></td>
                                <td class="center "></td>
                                <td class="center "></td>
                                <td class="center">Mac OS 8-X</td>
                                <td class="center">
                                    <button type="button" class="btn btn-round btn-warning" data-toggle="modal"
                                            data-target="#saleModal">Sale
                                    </button>
                                </td>
                                <td class="center">
                                    <button type="button" class="btn btn-round btn-success" data-toggle="modal"
                                            data-target="#importModal">Import
                                    </button>
                                </td>
                                <td class="center">
                                    <button type="button" class="btn btn-round btn-info" data-toggle="modal"
                                            data-target="#productModal">Update
                                    </button>
                                </td>
                                <td class="center">
                                    <button type="button" class="btn btn-round btn-danger" data-toggle="modal"
                                            data-target="#confirmModal">Delete
                                    </button>
                                </td>
                            </tr>
                            <tr class="gradeA odd">
                                <td class="center "></td>
                                <td class="center "></td>
                                <td class="center "></td>
                                <td class="center "></td>
                                <td class="">Trident</td>
                                <td class="center">
                                    <button type="button" class="btn btn-round btn-warning">Sale</button>
                                </td>
                                <td class="center">
                                    <button type="button" class="btn btn-round btn-success">Import</button>
                                </td>
                                <td class="center">
                                    <button type="button" class="btn btn-round btn-info" data-toggle="modal"
                                            data-target="#productModal">Update
                                    </button>
                                </td>
                                <td class="center">
                                    <button type="button" class="btn btn-round btn-danger" data-toggle="modal"
                                            data-target="#confirmModal">Delete
                                    </button>
                                </td>
                            </tr>


                            </tbody>
                        </table>
                        <div class="dataTables_info" id="hidden-table-info_info">Showing 1 to 57 of 57 entries</div>
                        <div class="dataTables_paginate paging_two_button" id="hidden-table-info_paginate"><a
                                class="paginate_disabled_previous" tabindex="0" role="button"
                                id="hidden-table-info_previous" aria-controls="hidden-table-info">Previous</a><a
                                class="paginate_disabled_next" tabindex="0" role="button"
                                id="hidden-table-info_next" aria-controls="hidden-table-info">Next</a></div>
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
<!-- Modal -->
<div class="modal fade" id="importModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="importModalLabel">Import product</h4>
            </div>
            <div class="modal-body">
                <div class="form-inline" role="form">
                    Product ID
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">
                    Product Name
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">
                    Product Size
                    <div class="form-group">
                        <div class="col-sm-10">
                            <select class="form-control">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">
                    Import Quantity
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Import</button>
            </div>
        </div>
    </div>
</div>


<!-- Modal -->
<div class="modal fade" id="productModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="addProductModalTitle">Add product</h4>
            </div>
            <div class="modal-body form-horizontal style-form">

                <div class="form-inline" role="form">
                    <label class="col-lg-2 col-sm-2 control-label" for="addMethodProductName">Name</label>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="addMethodProductName">
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">
                    <label class="col-lg-2 col-sm-2 control-label" for="nation">Nation</label>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <select class="form-control" id="nation">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">

                    <label class="col-lg-2 col-sm-2 control-label" for="description">Description</label>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="description">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-md-3">Image Upload</label>
                    <div class="col-md-9">
                        <div class="fileupload fileupload-new" data-provides="fileupload"><input type="hidden">
                            <div class="fileupload-new thumbnail" style="width: 200px; height: 150px;">
                                <img src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image" alt="">
                            </div>
                            <div class="fileupload-preview fileupload-exists thumbnail"
                                 style="max-width: 200px; max-height: 150px; line-height: 10px;"></div>
                            <div>
                                          <span class="btn btn-theme02 btn-file">
                                           <span class="fileupload-new"><i
                                                   class="fa fa-paperclip"></i> Select image</span>
                                           <span class="fileupload-exists"><i
                                                   class="fa fa-undo"></i> Change</span>
                                           <input type="file" class="default">
							  </span>
                                <a href="#" class="btn btn-theme04 fileupload-exists" data-dismiss="fileupload"><i
                                        class="fa fa-trash-o"></i> Remove</a>
                            </div>
                        </div>
                        <span class="label label-info">NOTE!</span>
                        <span>
                                 Attached image thumbnail is
                                 supported in Latest Firefox, Chrome, Opera,
                                 Safari and Internet Explorer 10 only
                                 </span>
                    </div>
                </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Add Product</button>
            </div>
        </div>
    </div>
</div>


<!-- Modal -->
<div class="modal fade" id="saleModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="saleModalLabel">Sale</h4>
            </div>

            <div class="modal-body form-horizontal style-form">
                <div class="form-inline" role="form">
                    <label class="col-lg-2 col-sm-2 control-label" for="saleMethodProductID">ID</label>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="saleMethodProductID">
                        </div>
                    </div>
                </div>
                <div class="form-inline" role="form">
                    <label class="col-lg-2 col-sm-2 control-label"
                           for="saleMethodProductName">Name</label>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="saleMethodProductName">
                        </div>
                    </div>
                </div>

                <div class="form-inline" role="form">
                    <label class="col-lg-2 col-sm-2 control-label"
                           for="saleMethodProductPercent">Percentage</label>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="saleMethodProductPercent">
                        </div>
                    </div>
                </div>


                <div class="form-group last">
                    <label class="col-lg-2 col-sm-2 control-label">Date</label>
                    <div class="col-md-6">
                        <div class="input-group input-large" data-date="01/01/2014"
                             data-date-format="mm/dd/yyyy">
                            <input type="text" class="form-control dpd1" name="from">
                            <span class="input-group-addon">To</span>
                            <input type="text" class="form-control dpd2" name="to">
                        </div>
                        <span class="help-block">Select date range</span>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Sale Product</button>
            </div>
        </div>
    </div>
</div>


<script src="<c:url value = "/resources/js/bootstrap-datepicker/bootstrap-datepicker.js"/>"
        type="text/javascript"></script>
<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/daterangepicker.js"/>"
        type="text/javascript"></script>
<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/date.js"/>" type="text/javascript"></script>
<script src="<c:url value = "/resources/js/bootstrap-daterangepicker/moment.min.js"/>"
        type="text/javascript"></script>
<script src="<c:url value = "/resources/js/bootstrap-datetimepicker/bootstrap-datetimepicker.js"/>"
        type="text/javascript"></script>
<script src="<c:url value = "/resources/js/bootstrap-fileupload/bootstrap-fileupload.js"/>"
        type="text/javascript">
</script>

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
                <td class="day active">13</td>
                <td class="day">14</td>
                <td class="day">15</td>
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
                        class="month active">Nov</span><span class="month">Dec</span></td>
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
                        class="year">2011</span><span
                        class="year">2012</span><span class="year">2013</span><span class="year">2014</span><span
                        class="year">2015</span><span class="year active">2016</span><span
                        class="year">2017</span><span class="year">2018</span><span class="year">2019</span><span
                        class="year old">2020</span></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<c:import url="/resources/views/common/footer.jsp"/>

</body>
</html>
