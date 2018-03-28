package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import FunctionLayer.entity.Calculator;
import FunctionLayer.entity.ItemList;
import FunctionLayer.entity.Order;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    
    public static ItemList createOrder(Order order) throws LoginSampleException{
        Calculator calc = new Calculator();
        OrderMapper.createOrder( order );
        ItemList itemList = calc.calculate(order);
        return itemList;        
    }

    public static List<Order> viewAllOrders() throws LoginSampleException{
        ArrayList<Order> orderList = new ArrayList();
        
        return orderList;
    }    

    public static Order viewOrder(int orderId) throws LoginSampleException{
        Order order = OrderMapper.viewOrder(orderId);
        return order;   
    }        
}
