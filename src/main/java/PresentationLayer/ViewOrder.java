/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.entity.Order;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alber
 */
public class ViewOrder extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        //ArrayList<Order> orderList = (ArrayList<Order>) request.getAttribute("orderList");
        int orderId = Integer.parseInt(request.getParameter("orderid"));
        Order order = LogicFacade.viewOrder(orderId);
        request.setAttribute("orderview",order);
        return "vieworder";
    }
    
}
