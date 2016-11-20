<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 11/19/2016
  Time: 10:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="loading-sn">
    <div class="loading-symbol">
        <img class="loading-icon" src="${pageContext.request.contextPath}/resources/lib/img/loading-symbol.png">
        <div style="width: 0;overflow: hidden;">
            <input type="text" id="hidden-loading-focus" style="opacity: 0;filter:alpha(opacity=0);width: 0px"/>
        </div>
    </div>
</div>
