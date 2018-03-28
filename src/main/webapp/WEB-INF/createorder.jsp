<%-- 
    Document   : createorder
    Created on : 21-03-2018, 13:27:43
    Author     : alber
--%>

<%@page import="FunctionLayer.entity.ItemList"%>
<%@page import="java.util.Arrays"%>
<%@page import="FunctionLayer.entity.Calculator"%>
<%@page import="FunctionLayer.entity.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            session = request.getSession();
            Order order = (Order)session.getAttribute("order");
            ItemList itemList = (ItemList)session.getAttribute("itemlist");
            out.println(Arrays.deepToString(itemList.getBrickArray()));
        %>
        
        <h4>Order : <%=order.toString() %> </h4>
        <h1>Some information on the order you just made will go here</h1>
    </body>
</html>
