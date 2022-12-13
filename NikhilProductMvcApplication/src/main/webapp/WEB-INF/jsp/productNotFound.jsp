<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1 class="alert alert-danger">There is no product found with
					the Product id</h1>
			</div>
		</div>
	</section>
	<section>
		<div class="container">
			<p>${URL	}</p>
			<p>${message}</p>
		</div>
		<div class="container">
			<p>
				<a href="<spring:url value="/products/all" />"
					class="btn btn-primary"> <span
					class="glyphicon-hand-left glyphicon"> </span> products
				</a>
			</p>
		</div>
	</section>
</body>
</html>
