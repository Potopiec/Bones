<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<header>
    <div id="bonesLogo"></div>
    <div id="searchContainer">
        <form name="searchForm" action="/">
            <input type="text"/>

            <input type="submit" value="search"/>
        </form>
    </div>

    <ul>
        <li><a href="<c:url value="/add"/>"></a></li>
    </ul>
</header>
