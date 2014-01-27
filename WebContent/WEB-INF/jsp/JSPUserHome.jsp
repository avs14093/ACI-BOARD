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
  					<li class="active"><a href="ServletHome"><span class="glyphicon glyphicon-home"></span> Home</a></li>
  					<li><a href="ServletMetering"><span class="glyphicon glyphicon-signal"></span> Metering</a></li>
  					<li><a href="ServletAccountInformation"><span class="glyphicon glyphicon-user"></span> Account information</a></li>
				</ul>
  			</div>
  			<div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
  				<div class="panel panel-primary">
  					<div class="panel-heading">
						<h3 class="panel-title">Home</h3>
					</div>
					<div class="panel-body">
						<h2>
							ACI?
						</h2>
						<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.</p>
						<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.</p>
					</div>
  				</div>
  				<!-- Button trigger modal -->
<button class="btn btn-primary btn-lg" data-remote="http://google.at" data-toggle="modal" data-target="#myModal">
  Launch demo modal
</button>
  				
  				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
  				
  			</div>
   		</div>  
  </div>
   
   <script src="https://code.jquery.com/jquery.js"></script>
   <script src="js/bootstrap.min.js"></script>
  </body>
</html>
