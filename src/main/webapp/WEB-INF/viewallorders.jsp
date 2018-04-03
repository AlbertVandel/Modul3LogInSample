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
        <h1>List of all orders</h1>
        <%=request.getAttribute("orderList")%>
        <form name="vieworder" action="FrontController" method="Post">
            <input type="hidden" name="command" value="vieworder">
            <input type ="number" name ="orderid">Ordrens id</input> 
            <table style="width:100%">
                <tr>

                </tr>
            </table> 
            <input type="submit" value="Se ordren">
        </form>
    </body>
</html>
