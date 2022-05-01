<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ecommerce.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css"/>
</head>
<body>
<style>
.container
	{
		padding: 100px;
		text-align: center;
	}
</style>
<div class= "container">
<% Product product = (Product) request.getAttribute("product"); %>
 <form action="UpdateProduct" method="GET"> 
 <h3> Update the Product Values</h3>
 <input type="number" name="id" id="id" placeholder="Enter Product ID" value="${product.id}" hidden><br>
  Name : <input type="text" name="name" id="name" placeholder="Enter Product Name" value="<%= product.getName() %>"><br>
  Price : <input type="number" name="price" id="price" placeholder="Enter Product Price"value="<%= product.getPrice() %>"><br>
  Quantity : <input type="number" name="quantity" id="quantity" placeholder="Enter Quantity" value="<%= product.getQuantity() %>"><br>
  Discount : <input type="number" name="discount" id="" placeholder="Enter Discount" value="<%= product.getDiscount() %>"><br>
<input type="submit" class="button-primary" value="Update Product">
</form>
</div> 
</body>
</html>