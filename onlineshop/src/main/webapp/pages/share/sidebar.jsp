
<h1 class="my-4">Shop Name</h1>
<div class="list-group">
<c:forEach items="${catogeries}" var="category">
 
<a href="${contextRoot}/show/catogery/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a>
</c:forEach>
	
</div>
