<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css"/>
  <title>Edit Product</title>
</head>
<body>
<style>
.container{  
		
        text-align: center;  
        margin: auto;  
          padding: 80px; 
        border-radius: 15px ;  
          
} </style>
  <div class="container">
  <h3>Enter Product ID to Update</h3>
    <form action="EditProduct">
      <input type="text" name="id" placeholder="Enter Product Id" id="id" >
      <input type="submit" class="button-primary" value="Edit">
    </form>

  </div>
</body>
</html>