<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>상품등록</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0" />

	<!--  ///////////////////////// Bootstrap, jQuery CDN ////////////////////////// -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
	<script type="text/javascript" src="../javascript/calendar.js"></script>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>


	<!-- Bootstrap Dropdown Hover CSS -->
	<link href="/css/animate.min.css" rel="stylesheet">
	<link href="/css/bootstrap-dropdownhover.min.css" rel="stylesheet">
	<!-- Bootstrap Dropdown Hover JS -->
	<script src="/javascript/bootstrap-dropdownhover.min.js"></script>


	<!-- jQuery UI toolTip 사용 CSS-->
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<!-- jQuery UI toolTip 사용 JS-->
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

	<!--  ///////////////////////// CSS ////////////////////////// -->
	<style>
		body > div.container{
			border: 3px solid #D6CDB7;
			margin-top: 60px;
		}


	</style>

	<!--  ///////////////////////// JavaScript ////////////////////////// -->
	<script type="text/javascript">
		function fncAddProduct(){
			//Form 유효성 검증
			var name = document.detailForm.prodName.value;
			var detail = document.detailForm.prodDetail.value;
			var manuDate = document.detailForm.manuDate.value;
			var price = document.detailForm.price.value;

			if(name == null || name.length<1){
				alert("상품명은 반드시 입력하여야 합니다.");
				return;
			}
			if(detail == null || detail.length<1){
				alert("상품상세정보는 반드시 입력하여야 합니다.");
				return;
			}
			if(manuDate == null || manuDate.length<1){
				alert("제조일자는 반드시 입력하셔야 합니다.");
				return;
			}
			if(price == null || price.length<1){
				alert("가격은 반드시 입력하셔야 합니다.");
				return;
			}


			$('form').attr('method','post').attr('enctype','multipart/form-data').attr('action','addProduct?menu=manage').submit();
		}

		function resetData(){
			document.detailForm.reset();
		}

		$(function () {
			$("button.btn.btn-primary:contains('등 록')").on("click" , function() {
				fncAddProduct();
			});

			$("a.btn.btn-primary:contains('취 소')").on('click',function(){
				resetData();
			})

			$("button.btn.btn-primary:contains('뒤 로')").on('click',function(){
				history.go(-1);
			})

		})

	</script>
</head>

<body>

<jsp:include page="../layout/toolbar.jsp" />


<div class="container">

	<h1 class="bg-primary text-center">상 품 등 록</h1>

	<!-- form Start /////////////////////////////////////-->
	<form name="detailForm" class="form-horizontal">

		<div class="form-group">
			<label for="prodName" class="col-sm-offset-1 col-sm-3 control-label">상 품 명</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="prodName" name="prodName" placeholder="상 품 명" >
			</div>
		</div>

		<div class="form-group">
			<label for="prodDetail" class="col-sm-offset-1 col-sm-3 control-label">상품 상세 정보</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="prodDetail" name="prodDetail" placeholder="상품 상세 정보" >
			</div>
		</div>

		<div class="form-group">
			<label for="manuDate" class="col-sm-offset-2 col-sm-2 control-label">제조 일자</label>
			<div class="col-sm-4">
				<input type="date" name="manuDate"  class="form-control"  id = "manuDate"/>
			</div>
		</div>

		<div class="form-group">
			<label for="price" class="col-sm-offset-1 col-sm-3 control-label">가격</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="price" name="price" placeholder="상품가격">
			</div>
		</div>

		<div class="form-group">
			<label for="price" class="col-sm-offset-1 col-sm-3 control-label">수량</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="stock" name="stock" placeholder="입고수량">
			</div>
		</div>

		<div class="form-group">
			<label for="files" class="col-sm-offset-1 col-sm-3 control-label">상품이미지</label>
			<div class="col-sm-4">
				<label for="files">
					<%--
                    <div class="btn btn-default btn-block">
                     <span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>
                     &nbsp;이미지 선택
                    </div>
                     --%>
					<input type="file"  multiple="multiple" id="files" name="files">
				</label>
			</div>



		</div>

		<div class="form-group">
			<div class="col-sm-offset-4  col-sm-4 text-center">
				<button type="button" class="btn btn-primary"  >등 록</button>
				<a class="btn btn-primary btn" href="#" role="button">취 소</a>
				<button type="button" class="btn btn-primary"  >뒤 로</button>
			</div>
		</div>
	</form>
	<!-- form Start /////////////////////////////////////-->

</div>
<!--  화면구성 div end /////////////////////////////////////-->

</body>
</html>
