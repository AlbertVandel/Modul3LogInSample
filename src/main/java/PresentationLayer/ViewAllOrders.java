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
public class ViewAllOrders extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        ArrayList<Order> orderList = LogicFacade.viewAllOrders();
        request.setAttribute("orderList", orderList);
        //for (int i = 0; i < orderList.size(); i++) {
        //request.setAttribute("orderList", "<a href=\"" + orderList.get(0) + "\" value =\"" +orderList.get(0) + "\">");
        //}
        return "viewallorders";
    }

}
