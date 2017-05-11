<%@ page import="com.olav.wfm.model.Employee" %>
<%--
  Created by IntelliJ IDEA.
  User: Olga A
  Date: 11.05.2017
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
Departament <b>${dep1.title}</b>


${dep1.employees.get(0).name}
${dep1.employees.get(1).name}



</body>
</html>
