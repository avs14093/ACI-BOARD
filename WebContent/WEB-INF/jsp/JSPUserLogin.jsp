<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="css/bootstrap.min.css" rel="stylesheet">
   	<link href="signin.css" rel="stylesheet">
  </head>
  <body>
  
  	<div class="container">
  	 <img src="img/logo.png" class="center-block" style="width: 35em; height: 25sem;">
			<form method="GET" action="#" class="form-signin" role="form">
	        <h2 class="form-signin-heading">Sign in <small>ACI</small></h2>
	        <% 
	        	String loginInfo = (String) request.getAttribute("loginInfo");
	        	if(loginInfo != null)
	        	{
	        		out.print("<div class='alert alert-danger'>" + loginInfo + "</div>");
	        	}
	        %>
	        <input type="text" name="username" class="form-control" placeholder="Username" required autofocus>
	        <input type="password" name="password" class="form-control" placeholder="Password" required>
	        <label class="checkbox">
	          <input type="checkbox" value="remember-me"> Remember me
	        </label>
	        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      		</form>
    </div>
    
    <script src="https://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
