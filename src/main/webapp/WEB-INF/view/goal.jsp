<!DOCTYPE html>
<%@ taglib prefix="label" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Goals</title>
    <%@include file="../util/commonResourcesHead.jsp" %>
</head>

<body>

<%@include file="../util/menu.jsp" %>

<div class="container-fluid">
    <nav>
        <div class="nav nav-tabs" id="nav-tab" role="tablist">
            <a class="nav-item nav-link" data-toggle="tab" role="tab" aria-controls="nav-quarterly-goals" aria-selected="false" href="#quarterlyGoalTab">Quarterly</a>
            <a class="nav-item nav-link" data-toggle="tab" role="tab" aria-controls="nav-weekly-goals" aria-selected="false" href="#weeklyGoalTab">Weekly</a>
            <a class="nav-item nav-link" data-toggle="tab" role="tab" aria-controls="nav-daily-goals" aria-selected="false" href="#dailyGoalTab">Daily</a>
            <a class="nav-item nav-link active" data-toggle="tab" role="tab" aria-controls="nav-today-goals" aria-selected="true" href="#todayGoalTab">Today</a>
        </div>
    </nav>
    <div class="tab-content" id="nav-tabContent">
        <div id="quarterlyGoalTab" class="tab-pane fade" role="tabpanel" aria-labelledby="nav-quarterly-goals-tab">
            <h1>Quarterly Goals</h1>
            <form:form modelAttribute="quarterlyGoal" name="theForm" action="${pageContext.request.contextPath}/saveGoal?type=quarterly">
                <div class="form-group">
                    <%--<label class="required" for="quarterlyGoal">Quarterly Goal</label>--%>
                    <form:textarea path="description" class="form-control" rows="3" cols="80" id="quarterlyGoal"></form:textarea>
                </div>
                <button type="submit" class="btn btn-primary" id="distractionButton">Save</button>
            </form:form>
        </div>
        <div id="weeklyGoalTab" class="tab-pane fade" role="tabpanel" aria-labelledby="nav-weekly-goals-tab">
            WEEKLY GOAL:
            * have a business idea chosen
            * have a rough business plan / value proposition started
            * identify why the idea is better than other top 5 ideas
            * identify whose need the product serves - how does it improve lives?
            * identify how to monetize
            * identify implementation strategy
            * identify MVP
            * build squishy product roadmap for visioning and long term planning
        </div>
        <div id="dailyGoalTab" class="tab-pane fade" role="tabpanel" aria-labelledby="nav-daily-goals-tab">
            DAILY GOALs as seen from beginning of the week:    (do not alter; only adjust when defining next week's)
            Mon 	: select top 10 business ideas
            Tue 	: evaluate in-depth criteria for business ideas
            Wed 	: continued... compare in-depth criteria and select single idea to implement
            Thur 	: plan implementation-details: lang/team/deploy-env, vision: MVP/rough-roadmap/milestones
            Fri 	: stories written, backlog prioritized, kanban setup; initiate blank environment in prep for Monday implementation start
        </div>
        <div id="todayGoalTab" class="tab-pane fade show active" role="tabpanel" aria-labelledby="nav-today-goals-tab">
            Thur 	: plan implementation-details: lang/team/deploy-env, vision: MVP/rough-roadmap/milestones
        </div>
    </div>
</div>

<%@include file="../util/commonResourcesTail.jsp" %>

</body>
</html>
