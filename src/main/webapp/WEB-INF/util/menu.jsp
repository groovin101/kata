<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

    <a class="navbar-brand" href="${pageContext.request.contextPath}/">TRAX</a>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">

        <ul class="navbar-nav mr-auto">
            <%--todo: consider incorporating the active indicator for visual indication of where we are at--%>
            <li class="nav-item">
                <a class="nav-link" href="/gotoAffirmation">Inspire</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Meditate</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Reflect</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/gotoGoal">Plan</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Distraction</a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="/gotoAddDistraction">Add</a>
                    <a class="dropdown-item" href="/viewDistractions">View All</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">DO</a>
            </li>
        </ul>
    </div>

</nav>