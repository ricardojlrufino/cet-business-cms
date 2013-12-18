<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@ taglib uri="/template" prefix="template"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Business CMS</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Bluth Company">
<link rel="shortcut icon" href="assets/ico/favicon.html">
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/theme.css" rel="stylesheet">
<link href="assets/css/font-awesome.min.css" rel="stylesheet">
<link href="assets/css/alertify.css" rel="stylesheet">
<!-- 	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet" type="text/css"> -->
<link rel="Favicon Icon" href="assets/img/favicon.ico">
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
</head>
<body>
	<div id="wrap">
		<div class="navbar navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container-fluid">
					<div class="logo">
						<img src="assets/img/logo.png" alt="Realm Admin Template">
					</div>
					<a class="btn btn-navbar visible-phone" data-toggle="collapse"
						data-target=".nav-collapse"> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
					</a> <a class="btn btn-navbar slide_menu_left visible-tablet"> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
					</a>

					<div class="top-menu visible-desktop">
						<ul class="pull-left">
							<li><a id="messages" data-notification="25" href="#"><i
									class="icon-envelope"></i></a></li>
							<li><a id="notifications" data-notification="3" href="#"><i
									class="icon-globe"></i></a></li>
						</ul>
						<ul class="pull-right">
							<li><a href="login.html"><i class="icon-off"></i> Sair</a></li>
						</ul>
					</div>

					<div class="top-menu visible-phone visible-tablet">
						<ul class="pull-right">
							<li><a
								title="link to View all Messages page, no popover in phone view or tablet"
								href="#"><i class="icon-envelope"></i></a></li>
							<li><a
								title="link to View all Notifications page, no popover in phone view or tablet"
								href="#"><i class="icon-globe"></i></a></li>
							<li><a href="login.html"><i class="icon-off"></i></a></li>
						</ul>
					</div>

				</div>
			</div>
		</div>
		<div class="container-fluid">
			<jsp:include page="/jsp/Admin/sidebar.jsp" />

			<template:block id="body" />

		</div>
		<!--/.fluid-container-->
	</div>
	<!-- wrap ends-->
	<script type="text/javascript" src="assets/js/jquery.js"></script>
	<script type="text/javascript" src="assets/js/jquery-ui.min.js"></script>
	<script type="text/javascript" src="assets/js/raphael-min.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap.js"></script>
	<script type="text/javascript" src='assets/js/sparkline.js'></script>
	<script type="text/javascript" src='assets/js/morris.min.js'></script>
	<script type="text/javascript" src="assets/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.masonry.min.js"></script>
	<script type="text/javascript"
		src="assets/js/jquery.imagesloaded.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.facybox.js"></script>
	<script type="text/javascript" src="assets/js/jquery.alertify.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.knob.js"></script>
	<script type='text/javascript' src='assets/js/fullcalendar.min.js'></script>
	<script type='text/javascript' src='assets/js/jquery.gritter.min.js'></script>
	<script type="text/javascript" src="assets/js/realm.js"></script>
	<script type="text/javascript" src="assets/js/jquery.slimscroll.min.js"></script>
</body>
</html>