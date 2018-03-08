<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 登录页面 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<c:set var="basePath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>登录</title>
</head>
<body>

<form action="${basePath}/user/login.action" method="POST">
    账号：<input name="account" type="text" />
    密码：<input name="password" type="password" />
    <input type="submit" />
</form>

</body>
</html>
