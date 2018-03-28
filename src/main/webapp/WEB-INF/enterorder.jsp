<%-- 
    Document   : products
    Created on : 20-03-2018, 15:45:34
    Author     : alber
--%>

<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="stylesheet.css" rel="stylesheet" type="text/css"/>
        <title>Products</title>
    </head>
    <body>
        <% 
            session = request.getSession();
            User user = (User)session.getAttribute("user");
            
            
        
        %>
        
        <h4>User : <%=user.getEmail() %> </h4>
        
        <h1>Her kan du bygge dit Legohus </h1>
        
        <form name="createorder" action="FrontController" method="POST">
            <input type="hidden" name="command" value="createorder">
            <h2> Indtast målene på dit Legohus <h3>
            Længde: <input type = "number" name="length">
            <br>
            Bredde: <input type = "number" name="width"> 
            <br>
            Højde: <input type = "number" name="height">
            <br>
            <input type = "submit" value = "Bestil">
        </form>
            
    </body>
</html>
