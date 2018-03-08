<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>查看员工数据</title>
</head>
<body>
<%-- 显示员工的表格 --%>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
    </tr>
    <%-- 无员工数据的提示 --%>
    <c:if test="${empty empList}">
        <tr>
            <td colspan="2">暂无员工数据</td>
        </tr>
    </c:if>
    <%-- 遍历员工数据进行展示 --%>
    <c:forEach var="emp" items="${empList}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
