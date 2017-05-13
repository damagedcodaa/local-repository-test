<%--
  Created by IntelliJ IDEA.
  User: Olga A
  Date: 13.05.2017
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>WFM</title>
  <link rel='stylesheet' href='../../resources/css/bootstrap.css'>
  <link rel='stylesheet' href='../../resources/css/bootstrap.min.css'>
  <link rel='stylesheet' href='../../resources/css/bootstrap-theme.css'>
  <link rel='stylesheet' href='../../resources/css/bootstrap-theme.min.css'>
</head>
<body>
<br />
<div class="row" >
  <div class="col-md-1"></div>
  <div class="col-md-8">
  <ul class="nav nav-tabs">
    <li class="active"><a href="/">Resource Groups</a></li>
    <li><a href="/serving-areas">Serving Areas</a></li>
    <li><a href="/departments">Departments</a></li>
    <li><a href="#">Menu 3</a></li>
  </ul>
  <br />
    <table  class="table table-striped">
      <thead>
      <tr>
        <td>#</td>
        <td>Name</td>
        <td>Description</td>
        <td>Skill Sets</td>
        <td>Serving Areas</td>
        <td>Calendar</td>
      </tr>
      </thead>
      <% int i = 1; %>
      <c:forEach var="resourceGroup" items="${resourceGroupList}">
        <tr>
          <td><%= i++ %></td>
          <td>${resourceGroup.name}</td>
          <td>${resourceGroup.description}</td>
          <td></td>
          <td></td>
          <td><a href="#">Calendar</a></td>
        </tr>
      </c:forEach>
    </table>
  </div>
</div>
</body>
</html>
