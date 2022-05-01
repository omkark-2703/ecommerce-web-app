<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Product</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css"/>
</head>
<body>
 <style>
		.container
		{  
        	text-align: center;  
        	margin: auto;  
        	padding: 50px; 
        	border-radius: 15px ;  
        }
   </style> 
   
<div class="container">
<h3>Enter Product ID to Remove</h3>
    <form action="RemoveProduct">
      <input type="text" name="id" placeholder="Enter Product Id" id="id" >
      <input type="submit" class="button-primary" value="Delete">
    </form>
</body>
</html>