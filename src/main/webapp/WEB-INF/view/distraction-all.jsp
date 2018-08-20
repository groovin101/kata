<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>Distractions</title>
    <%@include file="../util/commonResourcesHead.jsp" %>
</head>

<body>
<%@include file="../util/menu.jsp" %>


<%--Main Content--%>
<div class="container-fluid">
    <ul>
        <c:forEach var="d" items="${distractions}">
            <li>
                <c:out value="${d.description}"/>
                <br>
                <a href="${d.link}"><c:out value="${d.link}"/></a>
            </li>
        </c:forEach>
    </ul>
</div>


<%@include file="../util/commonResourcesTail.jsp" %>
</body>
</html>