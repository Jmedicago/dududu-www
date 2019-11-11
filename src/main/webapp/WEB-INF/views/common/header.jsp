<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="header">
    <ul>
        <c:forEach var="item" items="${router}">
            <li>
                <a href="${item.url}">
                    <span>${item.name}</span>
                </a>
            </li>
        </c:forEach>
    </ul>
</div>
<script type="text/javascript">
    $(function () {
        $(".header a").eq(0).addClass("active");
        $(".header a").each(function () {
            $(".header a").click(function () {
                $(this).addClass("active").sibling().removeClass("active");
            })
        });
    })
</script>

