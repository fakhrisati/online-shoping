<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/assets/css"></spring:url>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet" />

<!-- theme CSS -->
<link href="${css}/bootstrap-letra-css-theme.css" rel="stylesheet" />

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet" />

<title>onlineshope - ${title}</title>

<script>
	window.menu = '${title}';
	window.contextroot = '${contextRoot}';
</script>
</head>
<body>

	<div class="wrapper">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
			<div class="container">
				<a class="navbar-brand" href="#">Online Shop</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarResponsive" aria-controls="navbarResponsive"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsive">
					<ul class="navbar-nav ml-auto">
						<li id="Home" class="nav-item active"><a class="nav-link"
							href="${contextRoot}/home">Home <span class="sr-only">(current)</span>
						</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div class="content">

			<div class="contianer">

				<div class="row">
					<div class="col-xs-8">
					  
					   <div class="jumbotron">
					   
					     <h1>${erorrTitle}</h1>
					     <hr/>
					     <blockquote>${erorrDescription} </blockquote>
					  
					   </div>
					
					</div>
				</div>
			</div>

		</div>

	</div>

</body>
</html>