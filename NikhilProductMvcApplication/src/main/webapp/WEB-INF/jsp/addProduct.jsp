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
	<form:form modelAttribute="newProduct" enctype="multipart/form-data">
		<div class="alert alert-danger" role="alert">
			<form:errors path="*" />
		</div>
		<table>
			<tr>
				<td><h2 style="color: blue">Product Creation Form</h2></td>

			</tr>
			<tr>
				<td><spring:message code="spring.form.product.productId" /></td>
				<td><form:input path="productId" /></td>
			</tr>
			<tr>
				<td><spring:message code="spring.form.product.name" /></td>
				<td><form:input path="name" /></td>
				<td style="color: red; font-size: 13px"><form:errors
						path="name" /></td>
			</tr>
			<tr>
				<td><spring:message code="spring.form.product.manufacturer" /></td>
				<td><form:input path="manufacturer" /></td>
			</tr>
			<tr>
				<td><spring:message code="spring.form.product.category" /></td>
				<td><form:select path="category">
						<form:option value="medicines" label="medicines" />
						<form:option value="FMGC" label="FMGC" />
						<form:option value="cosmetics" label="cosmetics" />

					</form:select></td>
			</tr>
			<tr>
				<td><spring:message code="spring.form.product.description" /></td>
				<td><form:input type="textarea" path="description" /></td>
				<td style="color: red; font-size: 13px"><form:errors
						path="description" /></td>
			</tr>
			<tr>
				<td><spring:message code="spring.form.product.unitPrice" /></td>
				<td><form:input path="unitPrice" /></td>
			</tr>
			<tr>
				<td><spring:message code="spring.form.product.productImage" /></td>
				<td><form:input path="productImage" type="file" /></td>
			</tr>
			<tr>

				<td colspan="2"><input type="submit" value="Add product" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>