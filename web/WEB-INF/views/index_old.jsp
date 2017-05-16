<%--
  Created by IntelliJ IDEA.
  User: Olga A
  Date: 10.05.2017
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<spring:form method="post"  modelAttribute="userJSP" action="check-user">

  Name: <spring:input path="name"/> (path="" - указывает путь, используемый в modelAttribute=''. в нашем случае User.name)  <br/>
  Password: <spring:input path="password"/>   <br/>
  <spring:button>Next Page</spring:button>

</spring:form>

</body>
</html>
