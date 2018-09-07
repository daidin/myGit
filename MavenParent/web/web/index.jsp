<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/5
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
    <style>
        .disabled{
            pointer-events:none;
        }
    </style>
</head>
<body>
<table border="1" width="80%" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>出生日期</th>
    </tr>
    <c:forEach items="${List.list}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.sex}</td>
            <td>${s.birthday}</td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4" align="center">
            <a href="/ListServlet?pageNo=1"><button>首页</button></a>
            <a href="/ListServlet?pageNo=${List.prePage}" class=${List.isFirstPage?"disabled":""}><button>上一页</button></a>
            <c:forEach items="${List.navigatepageNums}" var="Num">
                <a href="/ListServlet?pageNo=${Num}"><button>${Num}</button></a>
            </c:forEach>
            <a href="/ListServlet?pageNo=${List.nextPage}" class=${List.isLastPage?"disabled":""}><button>下一页</button></a>
            <a href="/ListServlet?pageNo=${List.pages}"><button>尾页</button></a>
        </td>
    </tr>
</table>
</body>
</html>
