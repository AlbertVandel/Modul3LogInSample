/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import FunctionLayer.entity.ItemList;
import FunctionLayer.entity.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alber
 */
public class OrderMapper {

        public static void createOrder( Order order ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO Orders (length, width, height, UserID) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setInt(1, order.getLength() );
            ps.setInt( 2, order.getWidth() );
            ps.setInt( 3, order.getLength() );
            ps.setInt( 4, order.getUserId() );
            ps.executeUpdate();
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
        
        public static Order viewOrder( int orderId ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "Select * from Orders where OrderID=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setInt(1, orderId );
            ResultSet rs = ps.executeQuery();
            rs.next();
            int length = rs.getInt("length");
            int width = rs.getInt("width");
            int height = rs.getInt("height");
            int userId = rs.getInt("UserID");
            Order order = new Order(orderId,length,width,height,userId);
            return order;
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
        public static ArrayList<Order> viewAllOrders() throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "Select * from Orders";
            PreparedStatement ps = con.prepareStatement( SQL );
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Order> orderList = new ArrayList();
            
            while(rs.next()){
            int orderId = rs.getInt("OrderID");
            int length = rs.getInt("length");
            int width = rs.getInt("width");
            int height = rs.getInt("height");
            int userId = rs.getInt("UserID");
            Order order = new Order(orderId,length,width,height,userId);
            orderList.add(order);
            }
            
            return orderList;
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
        
}