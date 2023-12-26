<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
</style>
</head>
<body class="back">
	<nav class="navbar navbar-default">
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
	<div class="center" style="background: #e6e6e6;">

		<form action="/registerUser" method="post">



			<div class="form-group">
				<label>Full name</label> <input type="text" class="form-control"
					name="fullname" required>
			</div>
			<div class="form-group">
				<label>User name</label> <input type="text" class="form-control"
					name="username">
			</div>
			<div class="form-group">
				<label>Password</label> <input class="form-control"
					name="password" type="password" required>
			</div>
			<div class="form-group">
				<label>Age</label> <input type="text" class="form-control"
					name="age" required>
			</div>
			<div class="form-group">
				<label>Mail</label> <input type="text" class="form-control"
					name="mail" required>
			</div>
			<div class="form-group">
				<label>Phone</label> <input type="text" class="form-control"
					name="phone" required>
			</div>
			<div class="form-group">
				<label>DOB</label> <input type="date" class="form-control"
					name="dob" required>
			</div>

			<div class="modal-footer">
				<input type="submit"
					class="btn btn-success" value="Add">
			</div>
		</form>
	</div>
</body>
</html>