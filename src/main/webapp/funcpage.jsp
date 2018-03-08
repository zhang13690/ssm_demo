<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 功能页面 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<c:set var="basePath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>功能页面</title>
</head>
<body>
    <div>欢迎你，${user.username}</div>
    <ul>
        <li>
            <a href="${basePath}/product/getAllProducts.action">查看员工信息</a>
        </li>
    </ul>
</body>
</html>
