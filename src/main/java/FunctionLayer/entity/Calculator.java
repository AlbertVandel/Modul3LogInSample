/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer.entity;

/**
 *
 * @author alber
 */
public class Calculator {
    
    private ItemList itemList;
    private int[][] brickArray = new int[3][4];
    
    public Calculator() {
    }
    
    public ItemList calculate(Order order){
        
        int length = order.getLength();
        int width = order.getWidth();
        int height = order.getHeight();
        
        //brick 4x2
        brickArray[0][0] = ((length-2)/4)*height;
        brickArray[0][1] = ((width-2)/4)*height;
        brickArray[0][2] = ((length-2)/4)*height;
        brickArray[0][3] = ((width-2)/4)*height;
        //brick 2x2
        brickArray[1][0] = (((length-2)%4)/2)*height;
        brickArray[1][1] = (((width-2)%4)/2)*height;
        brickArray[1][2] = (((length-2)%4)/2)*height;
        brickArray[1][3] = (((width-2)%4)/2)*height;
        //brick 1x2
        brickArray[2][0] = (((length-2)%2)/1)*height;
        brickArray[2][1] = (((width-2)%2)/1)*height;
        brickArray[2][2] = (((length-2)%2)/1)*height;
        brickArray[2][3] = (((width-2)%2)/1)*height;
        
        itemList = new ItemList(brickArray);
        
        return itemList;
    }
}
