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
				<h1>Products</h1>
				<p>All the available products in our store</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
		
		    <div class="col-md-10">
			<c:forEach items="${products}" var="product">
			   
				<div class="col-sm-6 col-md-3">
					<div class="thumbnail">
					    <img src="<c:url value="/img/dettol.jpg"></c:url>"   width="100%" />
						<div class="caption">
						    
							<h3>${product.name}</h3>
							<p>${product.description}</p>
							<p>$${product.unitPrice}</p>
							<p>
								<a href="<spring:url value="/products/get?id=${product.productId}" />" class="btn btn-primary btn-large"> <span
									class="glyphicon-eye-open glyphicon"> </span> Details
								</a>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
			</div>
		</div>
	</section>
</body>
</html>
¬
