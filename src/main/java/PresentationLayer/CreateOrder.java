/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import FunctionLayer.entity.ItemList;
import FunctionLayer.entity.Order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alber
 */
public class CreateOrder extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        
        
        
        //save Order and ItemList in session.
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        int userId = user.getId();
        
        Order order = new Order(length,width,height,userId);
        
        
        // creates and calculates ItemList from Order and puts ItemList into database. 
        ItemList itemList = LogicFacade.createOrder(order);
        
        session.setAttribute("order", order);
        session.setAttribute("itemlist", itemList);

        //command
        return "createorder";
    }
}