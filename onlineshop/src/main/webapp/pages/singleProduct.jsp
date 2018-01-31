<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
				<li class="breadcrumb-item"><a
					href="${contextRoot}/show/all/products">Products</a></li>
				<li class="breadcrumb-item active">${product.name}</li>
			</ol>
		</div>
	</div>
	<div class="row">

		<!-- Display the Product Img  -->
		<div class="col-xs-12 col-sm-4">

			<div class="img-thumbnail">

				<img alt="ProductImg" src="${images}/${product.code}.png"
					class="img-fluid">



			</div>

		</div>

		<!-- Display the Product Description  -->

		<div class="col-xs-12 col-sm-8">
			<h3>${product.name }</h3>
			<hr />
			<p>${product.description}</p>
			<hr />
			<h4>
				Price:<strong>${product.uintPrice }</strong>
			</h4>
			<hr>


			<c:choose>
				<c:when test="${product.quntity<1}">
					<h6>
						<span style="color: red">Out of Stock </span>
					</h6>
				</c:when>
				<c:otherwise>
					<h6>Qty. Available: ${product.quntity}</h6>
				</c:otherwise>
			</c:choose>
			
			
			
			
				<c:choose>
				<c:when test="${product.quntity<1}">
					<a href="javascript:void(0)"
				class="btn btn-success disabled"> <strike> Add to Cart </strike> </a>
				</c:when>
				<c:otherwise>
					<a href="${contextRoot }/cart/add/${product.id}"
				     class="btn btn-success"> Add to Cart </a>
				</c:otherwise>
			</c:choose>
			
			

			 <a href="${contextRoot }/show/all/products" class="btn btn-primary">
				Back </a>
		</div>
	</div>
</div>