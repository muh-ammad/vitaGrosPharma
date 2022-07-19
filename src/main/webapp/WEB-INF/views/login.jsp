<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>vitaGrosPharma</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link  href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" />
    <link  href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet" />
    <script href="<c:url value="/resources/js/bootstrap.js" />"></script>

</head>
<body onload='document.login.username.focus();'>
<div class="container mt-5 w-50">
			<div class="card text-center">
				<div class="card-header">
					<div class="card-title">
						<h3>Login</3>
					</div>
				</div>
					<div class="card-body">
						<c:url var="loginUrl" value="/login"/>
						<form action="perform_login" method="POST">
							<div class="form-group">
								<label for="username">Username</label>
								<input type="text" class="form-control" id="username" aria-describedby="username" placeholder="Enter login">
								<small id="emailHelp" class="form-text text-muted">We'll never share your login with anyone else.</small>
							  </div>
							  <div class="form-group">
								<label for="password">Password</label>
								<input type="password" class="form-control" id="password" name="password" placeholder="Password">
							  </div>
							<button class="btn btn-info" name="submit" type="submit">
								SUBMIT
							</button>
						</form>
					</div>
			</div>
</div>
</body>
</html>
