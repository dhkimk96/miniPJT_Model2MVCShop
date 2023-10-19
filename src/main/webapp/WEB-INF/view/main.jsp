<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>

<!--  ///////////////////////// JSTL  ////////////////////////// -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="ko">

<head>
  <style>


  </style>
  <meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1.0" />

  <!--   jQuery , Bootstrap CDN  -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
  <link rel="stylesheet" href="layout/NewFile.css" >
  <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>

  <!-- Bootstrap Dropdown Hover CSS -->
  <link href="/css/animate.min.css" rel="stylesheet">
  <link href="/css/bootstrap-dropdownhover.min.css" rel="stylesheet">

  <!-- Bootstrap Dropdown Hover JS -->
  <script src="/javascript/bootstrap-dropdownhover.min.js"></script>

  <!--  CSS 추가 : 툴바에 화면 가리는 현상 해결 :  주석처리 전, 후 확인-->
  <style>
    body {
      padding-top : 70px;
    }
  </style>

  <!--  ///////////////////////// JavaScript ////////////////////////// -->


</head>

<body>

<!-- ToolBar Start /////////////////////////////////////-->
<jsp:include page="layout/toolbar.jsp" />
<!-- ToolBar End /////////////////////////////////////-->

<!--  아래의 내용은 http://getbootstrap.com/getting-started/  참조 -->
<div class="container ">
  <!-- Main jumbotron for a primary marketing message or call to action -->
  <div class="jumbotron">
    <h1>Model2MVCShop </h1>
    <p>할게... 많다...</p>
  </div>
</div>

<!-- 참조 : http://getbootstrap.com/css/   : container part..... -->
<div class="container">
  <h3>나폴레옹은 이렇게 말했다.</h3>
  <p>"오늘 나의 불행은 언젠가 내가 잘못 보낸 시간의 보복이다."</p>
  <h3>"... 보복 당하는중..."</h3>

</div>

</body>

</html>