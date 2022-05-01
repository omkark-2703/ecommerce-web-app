
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ecommerce.Product,java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css"
    />
 
    <title>display product page</title>
  </head>
  <body>
    <div class="container">
      <h1>Product List</h1>
     <table>
       <thead>
         <tr>
         	
           <th>ID</th>
           <th>Name</th>
           <th>Price</th>
           <th>Quantity</th>
           <th>Discount</th>
    
         </tr>
       </thead>
       <% ArrayList<Product> productList =  (ArrayList<Product>) request.getAttribute("productList"); %>
       
       <tbody>
         <%for(Product p:productList){%>
        	 <tr>
           <td><%= p.getId() %> </td>
           <td><%= p.getName() %></td>
           <td><%= p.getPrice() %></td>
           <td><%= p.getQuantity() %></td>
           <td><%= p.getDiscount() %></td>
         </tr>
        	 
        	 
        	 <%
         } %>
       </tbody>
    
      </table>
    </div>
  </body>
</html>
