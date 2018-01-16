<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/assets/css"></spring:url>
<spring:url var="js" value="/assets/js"></spring:url>
<spring:url var="images" value="/assets/images"></spring:url>
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
</script>
</head>

<body>

	<!-- Navigation -->

	<%@include file="./share/navbar.jsp"%>

	<!-- end Navigation -->

	<div class="wrapper">
		<div class=""></div>
		<!-- load on home page  -->
		<c:if test="${ishome == true }">
			<%@include file="home.jsp"%>
		</c:if>
		<!-- load on home page -->


		<!-- load on about page  -->
		<c:if test="${isabout == true }">
			<%@include file="about.jsp"%>
		</c:if>
		<!-- load on home page -->



		<!-- load on contact page  -->
		<c:if test="${iscontact == true }">
			<%@include file="contact.jsp"%>
		</c:if>
		<!-- load on contact page -->



		<!-- Footer -->


		<%@include file="./share/footer.jsp"%>

		<!-- end Footer -->
		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<!-- self js file -->
		<script src="${js}/myapp.js"></script>

	</div>

</body>

</html>