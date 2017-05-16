<%--
  Created by IntelliJ IDEA.
  User: Olga A
  Date: 13.05.2017
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create RG</title>
  <link rel='stylesheet' href='../../resources/css/bootstrap.css'>
  <link rel='stylesheet' href='../../resources/css/bootstrap.min.css'>
  <link rel='stylesheet' href='../../resources/css/bootstrap-theme.css'>
  <link rel='stylesheet' href='../../resources/css/bootstrap-theme.min.css'>
  <style>
    hr {
      border: #ffebd0; /* Убираем границу */
      background-color: #ffebd0; /* Цвет линии */
      color: #ffebd0; /* Цвет линии для IE6-7 */
      height: 50px; /* Толщина линии */
    }
  </style>
</head>
<body>
<hr>
<div class="row" >
  <div class="col-md-1"></div>
  <div class="col-md-8">
    <h3>Inventory</h3>
    <br/>
    <ul class="nav nav-tabs">
      <li class="active"><a href="/">Resource Groups</a></li>
      <li><a href="/serving-areas">Serving Areas</a></li>
      <li><a href="/departments">Departments</a></li>
      <li><a href="#">Menu 3</a></li>
    </ul>
    <br />

    <form class="form-horizontal">
      <div class="form-group">
        <label for="name" class="col-sm-3 control-label">Name</label>
        <div class="col-sm-4"><input type="text" class="form-control" id="name" placeholder="Name"></div>
      </div>
      <div class="form-group">
        <label for="comment" class="col-sm-3 control-label">Description</label>
        <div class="col-sm-4"><textarea class="form-control" rows="5" id="comment"></textarea></div>
      </div>

      <div class="form-group">
        <label for="sa" class="col-sm-3 control-label">Serving Area</label>
        <div class="col-sm-4">
        <select class="form-control" id="sa">
          <option>South</option>
          <option>North</option>
          <option>Center</option>
        </select>
        </div>
      </div>
    </form>

  </div>
</div>


</body>
</html>
