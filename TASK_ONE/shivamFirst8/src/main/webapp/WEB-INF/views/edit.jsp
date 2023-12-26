<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<style>
.center {
	margin: auto;
	width: 50%;
	border: 2px solid #F4C430;
	padding: 20px;
}

.back {
	background-image:
		url('https://images.pexels.com/photos/2166711/pexels-photo-2166711.jpeg');
	height: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}

.button-set {
	display: flex;
	justify-content: space-between;
}
</style>
</head>
<body class="back">

	<nav class="navbar navbar-default" style="border: 2px solid #F4C430;">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Cars</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
					<li><a href="#">Link</a></li>

				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Login</a></li>

				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="/register" style="">Register</a></li>

				</ul>
			</div>


		</div>
		<!-- /.container-fluid -->
	</nav>
	<div class="center" style="background: white;">

		<div>
			<form action="/addData" method="post">

				<input type="hidden" name="id" value="${data.id}" />

				<div class="form-group">
					<label>Brand</label> <input type="text" class="form-control"
						name="brand" value="${data.brand }" required>
				</div>
				<div class="form-group">
					<label>Car_Color</label> <input type="text" class="form-control"
						name="color" value="${data.color}" required>
				</div>
				<div class="form-group">
					<label>Fuel_capacity</label> <input class="form-control"
						name="fuelCapacity" type="text" value="${data.fuelCapacity }"
						required>
				</div>
				<div class="form-group">
					<label>Car_launch_year</label> <input type="text"
						class="form-control" name="launch_year"
						value="${data.launch_year }" required>
				</div>
				<div class="form-group">
					<label>mileage</label> <input type="text" class="form-control"
						name="mileage" value="${data.mileage }" required>
				</div>
				<div class="form-group">
					<label>car_name</label> <input type="text" class="form-control"
						name="name" value="${data.name }" required>
				</div>
				<div class="form-group">
					<label>car_type</label> <input type="text" class="form-control"
						name="type" value="${data.type }" required>
				</div>

				<div class="button-set">
					<div class="one">
						<a href="/back" style="text-decoration: none;"><button
								class="btn btn-danger">Back</button></a>
					</div>
					<div class="two">
						<input type="submit" class="btn btn-success" value="Save">
					</div>
				</div>

			</form>
		</div>
	</div>


</body>
</html>