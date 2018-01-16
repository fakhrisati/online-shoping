<div class="container">

	<div class="row">


		<!--show side bar -->
		<div class="col-md-3">
			<%@include file="./share/sidebar.jsp"%>
		</div>

		<!-- show all products -->
		<div class="col-md-9">

			<!-- add breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${isAllProducts == true}">

						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/home"> Home</a></li>
							<li class="breadcrumb-item active">All Products</li>

						</ol>

					</c:if>

					<c:if test="${isCategoryProducts == true}">

						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/home"> Home</a></li>
							<li class="breadcrumb-item active">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>

						</ol>

					</c:if>

				</div>



			</div>


		</div>

	</div>
</div>