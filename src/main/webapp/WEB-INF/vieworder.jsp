<%-- 
    Document   : vieworder
    Created on : 23-03-2018, 10:11:29
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
        <h1>Selected order</h1>
        <%=request.getAttribute("orderview")%>
    </body>
</html>
