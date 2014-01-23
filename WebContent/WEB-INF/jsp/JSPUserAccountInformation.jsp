<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>ACI Dashboard</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="css/bootstrap.min.css" rel="stylesheet">
  </head>
  <body>
  
  <div class="container">
  		<div class="row">
  			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-offset-20">
	   			<div class="page-header">
	   				<h1>ACI <small>Dashboard for Openstack metering</small></h1>
				</div>		
  			</div>
  		</div>
		<div class="row">
  			<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
  				<ul class="nav nav-pills nav-stacked">
  					<li><a href="ServletHome"><span class="glyphicon glyphicon-home"></span> Home</a></li>
  					<li><a href="ServletMetering"><span class="glyphicon glyphicon-signal"></span> Metering</a></li>
  					<li class="active"><a href="ServletAccountInformation"><span class="glyphicon glyphicon-user"></span> Account information</a></li>
				</ul>
  			</div>
  			<div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
  				<div class="panel panel-primary">
  					<div class="panel-heading">
						<h3 class="panel-title">Account information</h3>
					</div>
					<div class="panel-body">
						
					</div>
  				</div>
  			</div>
   		</div>  
  </div>
   
   <script src="https://code.jquery.com/jquery.js"></script>
   <script src="js/bootstrap.min.js"></script>
  </body>
</html>
