<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 11/9/2016
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add New Product</title>
    <c:import url="/resources/views/common/header.jsp"/>
    <c:import url="/resources/views/common/menu.jsp"/>
    <c:import url="/resources/views/common/topBar.jsp"/>
</head>
<body>
<section id="main-content">
    <section class="wrapper">
        <div class="row mt">
            <div class="col-lg-12">
                <div class="form-panel">
                    <form class="form-horizontal style-form" method="get">
                        <div class="form-group">
                            <label class="col-sm-2 col-sm-2 control-label">Product Name</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 col-sm-2 control-label">Price</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 col-sm-2 control-label">Nation</label>
                            <div class="col-sm-10">
                                <select class="form-control">
                                    <option>NA</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-10">
                                <button type="button" class="btn btn-round btn-primary">Upload</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
</section>
<c:import url="/resources/views/common/footer.jsp"/>
</body>
</html>
