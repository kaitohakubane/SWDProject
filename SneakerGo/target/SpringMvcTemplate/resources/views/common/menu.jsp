<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 11/9/2016
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!-- **********************************************************************************************************************************************************
    MAIN SIDEBAR MENU
    *********************************************************************************************************************************************************** -->
<!--sidebar start-->
<aside>
    <div id="sidebar"  class="nav-collapse ">
        <!-- sidebar menu start-->
        <ul class="sidebar-menu" id="nav-accordion">

            <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
            <h5 class="centered">Hung Mai</h5>

            <li class="mt">
                <a href="${pageContext.request.contextPath}/">
                    <i class="fa fa-dashboard"></i>
                    <span>Dashboard</span>
                </a>
            </li>

            <li class="sub-menu">
                <a href="javascript:;" >
                    <i class="fa fa-desktop"></i>
                    <span>Product</span>
                </a>
                <ul class="sub">
                    <li><a  href="${pageContext.request.contextPath}/admin/product">Product Management</a></li>
                </ul>
            </li>

            <li class="sub-menu">
                <a href="javascript:;" >
                    <i class="fa fa-cogs"></i>
                    <span>Bill</span>
                </a>
                <ul class="sub">
                    <li><a  href="${pageContext.request.contextPath}/admin/bill-management">Bill Management</a></li>
                </ul>
            </li>
            <li class="sub-menu">
                <a href="javascript:;" >
                    <i class="fa fa-book"></i>
                    <span>Sale</span>
                </a>
                <ul class="sub">
                    <li><a  href="${pageContext.request.contextPath}/admin/sale-management">Sale Management</a></li>
                </ul>
            </li>
            <li class="sub-menu">
                <a href="javascript:;" >
                    <i class=" fa fa-bar-chart-o"></i>
                    <span>Report</span>
                </a>
                <ul class="sub">
                    <li><a  href="morris.html">Revenue Report</a></li>
                    <li><a  href="chartjs.html">Import Report</a></li>
                </ul>
            </li>

        </ul>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--sidebar end-->
</html>
