<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Affirmations</title>
    <%@include file="../util/commonResourcesHead.jsp" %>
</head>
<body>

<%@include file="../util/menu.jsp" %>

<div class="container-fluid">

    <form name="theForm" action="${pageContext.request.contextPath}/gotoAffirmation">
        <h3>${greeting}</h3>

        <div class="center">
            <div class="row">
                <div class="col">
                    <h1>Affirmation of the Day:</h1>
                </div>
            </div>
            <div class="row">
                <div class="col" id="affirmationOfTheDayContainer">
                    <%@include file="affirmation-single.jsp" %>
                </div>
            </div>
            <br><br>
            <div>
                <button type="submit" class="btn" id="loginBtn">Give me another and reload the whole page</button>
                <button type="button" class="btn btn-primary" id="ajaxAffirmationLoader" href="#">Give me another via AJAX</button>
            </div>
        </div>
    </form>
</div>

<%--javascript includes--%>
<%@include file="../util/commonResourcesTail.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/affirmation.js"></script>

</body>
</html>
