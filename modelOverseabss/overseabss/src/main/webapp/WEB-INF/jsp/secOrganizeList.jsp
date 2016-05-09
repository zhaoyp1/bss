<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
</head>
<body>

<div class="container">
    <table class="table">
        <thead>
            <th>序号</th>
            <th> 组织名称</th>
            <th> 组织编号</th>
            <th>上级组织</th>
            <th>英文名称</th>
        </thead>
        <tbody>
        <c:forEach items="${secOrganizesList}" var="secOrganize" varStatus="i">
            <tr>
            <td>${i.index+1}</td>
            <td>${secOrganize.organizeName}</td>
            <td>${secOrganize.code}</td>
                <td>${secOrganize.englishName}</td>
                <td>${secOrganize.englishName}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
