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
public class ItemList {
    private int [][] brickArray;

    public ItemList(int[][] brickArray) {
        this.brickArray = brickArray;
    }

    public int[][] getBrickArray() {
        return brickArray;
    }

    public void setBrickArray(int[][] brickArray) {
        this.brickArray = brickArray;
    }

    @Override
    public String toString() {
        return "ItemList{" + "brickArray=" + brickArray + '}';
    }
    
}
