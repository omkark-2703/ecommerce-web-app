<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css"/>
  <title>Add Product</title>
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

  <h3>Add Product in Database</h3>
  <form action="AddProduct" method="GET">
  <input type="number" name="id" id="id" placeholder="Enter Product ID"><br>
    <input type="text" name="name" id="name" placeholder="Enter Product Name"><br> 
<input type="number" name="price" id="price" placeholder="Enter Product Price"><br>
<input type="number" name="quantity" id="quantity" placeholder="Enter Quantity"><br>
<input type="number" name="discount" id="" placeholder="Enter Discount"><br><br>
<input type="submit" class="button-primary" value="Add Product">

</div>

 </form>
</body>
</html>