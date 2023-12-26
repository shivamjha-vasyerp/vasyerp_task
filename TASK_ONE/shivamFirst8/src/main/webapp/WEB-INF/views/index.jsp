<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>CRUD Data Table for car</title>
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
	margin-top: 120px;
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

.pagination li a {
	border: none;
	font-size: 13px;
	min-width: 30px;
	min-height: 30px;
	color: #999;
	margin: 0 2px;
	line-height: 30px;
	border-radius: 2px !important;
	text-align: center;
	padding: 0 6px;
}

.pagination li a:hover {
	color: #666;
}

.pagination li.active a, .pagination li.active a.page-link {
	background: #03A9F4;
}

.pagination li.active a:hover {
	background: #0397d6;
}

.pagination li.disabled i {
	color: #ccc;
}

.pagination li i {
	font-size: 16px;
	padding-top: 6px
}

/* Modal styles */
.modal .modal-dialog {
	max-width: 400px;
}

.modal .modal-header, .modal .modal-body, .modal .modal-footer {
	padding: 20px 30px;
}

.modal .modal-content {
	border-radius: 3px;
}

.modal .modal-footer {
	background: #ecf0f1;
	border-radius: 0 0 3px 3px;
}

.modal .modal-title {
	display: inline-block;
}

.modal .form-control {
	border-radius: 2px;
	box-shadow: none;
	border-color: #dddddd;
}

.modal textarea.form-control {
	resize: vertical;
}

.modal .btn {
	border-radius: 2px;
	min-width: 100px;
}

.modal form label {
	font-weight: normal;
}

.center {
	margin: auto;
	margin-top: 50px;
	width: 80%;
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
</style>
<script>
	$(document).ready(function() {
		// Activate tooltip
		$('[data-toggle="tooltip"]').tooltip();

		// Select/Deselect checkboxes
		var checkbox = $('table tbody input[type="checkbox"]');
		$("#selectAll").click(function() {
			if (this.checked) {
				checkbox.each(function() {
					this.checked = true;
				});
			} else {
				checkbox.each(function() {
					this.checked = false;
				});
			}
		});
		checkbox.click(function() {
			if (!this.checked) {
				$("#selectAll").prop("checked", false);
			}
		});
	});
</script>
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
					<li><a href="register" style="">Register</a></li>

				</ul>
			</div>


		</div>
		<!-- /.container-fluid -->
	</nav>
	<div class="center" style="background: #FAF9F6">
		<h1 class="display-4 font-monospace lh-1"
			style="color: black; margin-bottom: 20px; display: inline; float: left;">Cars
			Data</h1>

		<a href="#addEmployeeModal" class="btn btn-success"
			data-toggle="modal" style="float: right; margin-top: 12px"> <i
			class="material-icons">&#xE147;</i> Add New data
		</a>


		<table class="table "
			style="box-shadow: 10px 10px 8px #888888; border: 2px solid teal; padding: 5px; color: black; background: #e6e6e6;">
			<thead>
				<tr>
					<th>Id</th>
					<th>Brand</th>
					<th>Name</th>
					<th>Type</th>
					<th>Color</th>
					<th>Launch_year</th>
					<th>Mileage</th>
					<th>FeulCapacity</th>

				</tr>

			</thead>
			<tbody>
				<c:forEach var="car" items="${car}">
					<tr class="table-light">
						<td>${car.id}</td>
						<td>${car.brand}</td>
						<td>${car.name}</td>
						<td>${car.type}</td>
						<td>${car.color}</td>
						<td>${car.launch_year}</td>
						<td>${car.mileage}</td>
						<td>${car.fuelCapacity}</td>
						<td><a href="/delete?id=${car.id}"><span
								class="material-symbols-outlined"
								style="color: #CC5500; margin-right: 10px;"> delete </span></a> <a
							href="/editData?id=${car.id}"><span
								class="material-symbols-outlined" style="color: #008080">
									edit </span></a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<!-- Edit Modal HTML -->
	<div id="addEmployeeModal" class="modal fade"
		style="background: #e6e6e6;">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="/addData" method="post">


					<div class="modal-body">
						<div class="form-group">
							<label>Brand</label> <input type="text" class="form-control"
								name="brand" required>
						</div>
						<div class="form-group">
							<label>Car_Color</label> <input type="text" class="form-control"
								name="color" required>
						</div>
						<div class="form-group">
							<label>Fuel_capacity</label> <input class="form-control"
								name="fuelCapacity" type="text" required>
						</div>
						<div class="form-group">
							<label>Car_launch_year</label> <input type="text"
								class="form-control" name="launch_year" required>
						</div>
						<div class="form-group">
							<label>mileage</label> <input type="text" class="form-control"
								name="mileage" required>
						</div>
						<div class="form-group">
							<label>car_name</label> <input type="text" class="form-control"
								name="name" required>
						</div>
						<div class="form-group">
							<label>car_type</label> <input type="text" class="form-control"
								name="type" required>
						</div>
					</div>
					<div class="modal-footer">
						<input type="submit" class="btn btn-success" value="Add">
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>