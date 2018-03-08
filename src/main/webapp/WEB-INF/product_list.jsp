<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>查看产品数据</title>
</head>
<body>
<div>欢迎你，${user.username}</div>
<%-- 显示产品的表格 --%>
<table>
    <tr>
        <th>编号</th>
        <th>产品</th>
        <th>价格</th>
    </tr>
    <%-- 无产品数据的提示 --%>
    <c:if test="${empty productList}">
        <tr>
            <td colspan="3">暂无产品数据</td>
        </tr>
    </c:if>
    <%-- 遍历产品数据进行展示 --%>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
