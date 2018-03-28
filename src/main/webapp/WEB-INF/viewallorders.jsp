<%-- 
    Document   : vieworders
    Created on : 23-03-2018, 10:09:48
    Author     : alber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%=request.getAttribute("orderList") %>
        <form name="vieworder" action="FrontController" method="Post">
            <input type="hidden" name="command" value="vieworder">
            <input type="submit" value="Se ordren">
        </form>
    </body>
</html>
