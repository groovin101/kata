<!DOCTYPE html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Distraction</title>
    <%@include file="../util/commonResourcesHead.jsp" %>
</head>
<body>

<%@include file="../util/menu.jsp" %>

<div class="container-fluid">

    <h1>Avert Distraction!</h1>

    <form:form modelAttribute="distraction" name="theForm" action="${pageContext.request.contextPath}/saveDistraction">
        <div class="form-group">
            <label class="required" for="distraction">Distraction</label>
            <form:textarea path="description" class="form-control" rows="3" cols="80" id="distraction"></form:textarea>
        </div>
        <div class="form-group">
            <label for="distractionLink">External Link</label>
            <form:input type="text" path="link" class="form-control" id="distractionLink"/>
        </div>
        <button type="submit" class="btn btn-primary" id="distractionButton">Save</button>
    </form:form>

    <a href="/viewDistractions">View All Distractions</a>
</div>

<%@include file="../util/commonResourcesTail.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/distraction.js"></script>

</body>
</html>
